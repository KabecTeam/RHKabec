package com.udemy.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backend.component.ConsultorExpedientConverter;
import com.udemy.backend.component.HelperPrivilegeByUserModel;
import com.udemy.backend.component.HelperPrivileges;
import com.udemy.backend.component.RegistryAsignationConverter;
import com.udemy.backend.constant.ViewConstant;
import com.udemy.backend.entity.Area;
import com.udemy.backend.entity.Cliente;
import com.udemy.backend.entity.ConsultorExpediente;
import com.udemy.backend.entity.ConsultoresEmpresaKabec;
import com.udemy.backend.entity.Contact;
import com.udemy.backend.entity.ContratoNomina;
import com.udemy.backend.entity.Domicilio;
import com.udemy.backend.entity.EmpresaComplemento;
import com.udemy.backend.entity.Escolaridad;
import com.udemy.backend.entity.GerenteComercial;
import com.udemy.backend.entity.GerentesArea;
import com.udemy.backend.entity.LideresConsultor;
import com.udemy.backend.entity.Perfil;
import com.udemy.backend.entity.Personas;
import com.udemy.backend.entity.RefPersonales;
import com.udemy.backend.entity.RegistroAsignacion;
import com.udemy.backend.entity.RegistroContrato;
import com.udemy.backend.entity.UserRole;
import com.udemy.backend.model.AsignationRegistryModel;
import com.udemy.backend.model.CertificacionesModelo;
import com.udemy.backend.model.ConsultorExpedientModel;
import com.udemy.backend.model.ContactModel;
import com.udemy.backend.model.DatosFamiliaresModel;
import com.udemy.backend.model.FindUserModel;
import com.udemy.backend.model.HelperPrivilegeModel;
import com.udemy.backend.model.HelperPrivilegeNameSubItem;
import com.udemy.backend.model.NewUserModel;
import com.udemy.backend.model.PrivilegeByUserModel;
import com.udemy.backend.model.RegistroContratoModel;
import com.udemy.backend.service.Consultores;
import com.udemy.backend.service.ConsultoresExpedienteService;
import com.udemy.backend.service.ContactService;
import com.udemy.backend.service.ContratosService;
import com.udemy.backend.service.User_RolesService;
import com.udemy.backend.service.impl.UserService;

@Controller
@RequestMapping("/Kabec")
public class IndexController {

	private static final Log LOG = LogFactory.getLog(IndexController.class);

	@Autowired
	@Qualifier("contactServiceImpl")
	private ContactService contactService;

	// Estas clases estan implementadas en Service.impl
	@Autowired
	@Qualifier("user_RolesImpl")
	private User_RolesService user_RolesService;

	// Estas clases estan implementadas en Service.impl
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Autowired
	@Qualifier("ConsultoresServiceImpl")
	private Consultores consultoresService;
	
	@Autowired
	@Qualifier("consultoresExpedienteServiceImpl")
	private ConsultoresExpedienteService consultoresExpedienteService;
	
	@Autowired
	@Qualifier("consultorExpedientConverter")
	private ConsultorExpedientConverter consultorExpedientConverter;
	
	@Autowired
	@Qualifier("registryAsignationConverter")
	RegistryAsignationConverter registryAsignationConverter;
	
	@Autowired
	@Qualifier("contratosServiceImpl")
	private ContratosService contratosService; 

	// lista que nos permitira guardar los nombres de los items en el menu de
	// navegacion (estos items dependenden de cda usario)
	// la clase que mapea a esta lista (HelperPrivilegeModel) esta situada en el
	// paquete de Model
	// mas informacion en su clase respectiva
	private List<HelperPrivilegeModel> helperPrivilegeModel = new ArrayList<HelperPrivilegeModel>();
	// esta variable privada nos ayudara a recoger la informacion del Rol del
	// Usuario logeado
	private String rol = "";
	// esta variable privada nos ayudara a recoger la informacion del username
	// del usuario logewdo
	private String userName = "";

	public RegistroContrato registroContrato=new RegistroContrato();
	public RegistroContratoModel registroModel=new RegistroContratoModel();
	
	com.udemy.backend.entity.User newUser = null;

	com.udemy.backend.entity.User usuarioGlobal = null;
	
	Personas persona= null;
	
	Escolaridad escolaridadGlobal=null;
	Domicilio domicilioGlobal= null;
	RefPersonales refPersonalesGlobal=null;
	ConsultorExpediente consultorExpedienteGlobal=null;
	RegistroAsignacion registroAsignacionGlobal= null;
	
	
	List<Cliente> clientes= null;
	List<Area> areas=null;
	List<Perfil> perfiles=null;
	List<GerentesArea> gerentesAreas= null;
	List<LideresConsultor> lideresConsultor= null;
	List<GerenteComercial> gerentesComerciales= null;
	List<ContratoNomina> contratoNomina=null;
	List<EmpresaComplemento> empresaComplemento=null;
	
	
	
	/*
	 * @PostMapping("/addcontact") public String
	 * addContact(@ModelAttribute(name="contactModel")ContactModel contactModel,
	 * Model model){
	 * LOG.info("METHOD: addcontact() --PARAMS:"+contactModel.toString());
	 * //contactService.addContact(contactModel);
	 * 
	 * if(null !=contactService.addContact(contactModel)){
	 * model.addAttribute("result",1); }else{ model.addAttribute("result",0); }
	 * return "redirect:/contacts/showcontacts"; }
	 */

	/*
	 * Este metodo nos permite mostar el index de la aplicacion pero a haciendo
	 * una construccion de la interfaz de manera especifica... primero se pasa
	 * el nombre de la vista al constructor del ModelAndView segundo sacamos al
	 * usuario autenticado desde la seguridad de Spring tercero encontramos al
	 * usuario desde la entidad por el username que nos provee el usuario sacado
	 * desde la seguridad de Spring cuarto volcamos una lista con los
	 * privilegios del usuario desde la tabla Users_Role con ayuda del
	 * user_RolesService donde se encuentra el metodo para encontrar la lista de
	 * privilegios quinto es necesario limpiar la lista helperPrivilegeModel ya
	 * que de lo contrario el frontend estara haciendo la consulta y se hara
	 * cada vez mas grande el menu de navegacion sexto a la varable privada pero
	 * global rol se le pasa de la lista de privilegios previamente volcada el
	 * rol que este usuario tiene septimo a la varable privada pero global
	 * userName se le pasa de el userName del objeto User de Spring security que
	 * es el mismo que el de la entity instanciamos nuevamente la lista
	 * helperPrivilegeModel pero ahora con los privilegios asignado por
	 * HelperPrivileges().returnPrivileges(lista) aclaracion en el paquete
	 * component ern la clase HelperPrivileges pasamos como objetos al
	 * ModelAndView el rol, userName y la lista helperPrivilegeModel
	 */
	// checar los comentarios en el front end para observar la forma en como se
	// muestran los privilegios.
	@GetMapping("/showIndex")
	public ModelAndView showIndex() {
		ModelAndView mav = new ModelAndView(ViewConstant.INDEX);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		usuarioGlobal = userService.findUser(user.getUsername());
		List<UserRole> lista = user_RolesService.findPrivilegeByUser(usuarioGlobal);
		helperPrivilegeModel.clear();
		rol = lista.get(0).getRole();
		userName = user.getUsername();
		helperPrivilegeModel = new HelperPrivileges().returnPrivileges(lista);
		mav.addObject("UserRole", rol);
		mav.addObject("UserName", userName);
		mav.addObject("privileges", helperPrivilegeModel);
		return mav;
	}

	/*
	 * Este metodo hace el render de una vista con los privilegios rol y usuario
	 * hecho en showIndex()
	 */
	@GetMapping("/buscaConsultor")
	public ModelAndView showBusquedaConsultor() {
		ModelAndView mav = new ModelAndView(ViewConstant.FINDCONSULTOR_FORM);
		mav.addObject("UserRole", rol);
		mav.addObject("UserName", userName);
		mav.addObject("privileges", helperPrivilegeModel);
		return mav;
	}

	

	/*
	 * Este metodo hace el render de una vista con los privilegios rol y usuario
	 * hecho en showIndex()
	 */
	@GetMapping("/consultarPrivilegios")
	public ModelAndView showConsultaPrivilegios() {
		ModelAndView mav = new ModelAndView(ViewConstant.ROLBYUSER_FORM);
		mav.addObject("UserRole", rol);
		mav.addObject("UserName", userName);
		mav.addObject("privileges", helperPrivilegeModel);
		return mav;
	}

	/*
	 * Este metodo hace el render de una vista con los privilegios rol y usuario
	 * hecho en showIndex()
	 */
	@GetMapping("/altaUsuario")
	public ModelAndView showNuevoUsuario() {
		ModelAndView mav = new ModelAndView(ViewConstant.NEWUSER_FORM);

		mav.addObject("UserRole", rol);
		mav.addObject("UserName", userName);
		mav.addObject("privileges", helperPrivilegeModel);
		mav.addObject("newUserModel", new NewUserModel());
		return mav;
	}

	@PostMapping("/rolesUsuario")
	public ModelAndView addNewUser(@ModelAttribute(name = "newUserModel") NewUserModel newUserModel) {
		ModelAndView mav = new ModelAndView();
		if (newUserModel.getPassword().equals(newUserModel.getPasswordConfirmation())) {// la
																						// contraseñas
																						// coinciden
			if (null == userService.findUser(newUserModel.getUserName())) {// YA

				newUser = userService.addUser(newUserModel.getUserName(),
						newUserModel.getName() + " " + newUserModel.getLastName(), newUserModel.getPassword(), true);
				if (null != newUser) {
					// LOG.info(newUserModel.getUserName().replaceAll("^\\s*","").length());//
					// verificar la cadena sucia
					List<String> listaRoles = new ArrayList<String>();
					listaRoles.add("ROLE_ADMIN");
					listaRoles.add("ROLE_RH");
					listaRoles.add("ROLE_R y S");
					mav.setViewName(ViewConstant.ROLBYUSER_FORM);
					mav.addObject("UserRole", rol);
					mav.addObject("UserName", userName);
					mav.addObject("privileges", helperPrivilegeModel);
					mav.addObject("newUserName", newUser.getUsername());
					mav.addObject("Roles", listaRoles);
					mav.addObject("privilegeByUserModel", new PrivilegeByUserModel());
				} else {
					mav.setViewName(ViewConstant.NEWUSER_FORM);
					mav.addObject("UserRole", rol);
					mav.addObject("UserName", userName);
					mav.addObject("privileges", helperPrivilegeModel);
					mav.addObject("result", 1);
				}

			} else {
				mav.setViewName(ViewConstant.NEWUSER_FORM);
				mav.addObject("UserRole", rol);
				mav.addObject("UserName", userName);
				mav.addObject("privileges", helperPrivilegeModel);
				mav.addObject("result", 2);
			}

		} else {
			mav.setViewName(ViewConstant.NEWUSER_FORM);
			mav.addObject("UserRole", rol);
			mav.addObject("UserName", userName);
			mav.addObject("privileges", helperPrivilegeModel);
			mav.addObject("result", 0);
		}
		return mav;
	}

	@PostMapping("/creaRolesPorUsuario")
	public ModelAndView addNewPrivilegeByUser(
			@ModelAttribute(name = "privilegeByUserModel") PrivilegeByUserModel privilegeByUserModel) {
		ModelAndView mav = new ModelAndView(ViewConstant.INDEX);
		mav.addObject("UserRole", rol);
		mav.addObject("UserName", userName);
		mav.addObject("privileges", helperPrivilegeModel);
		new HelperPrivilegeByUserModel().buildListPrivilegesByUser(privilegeByUserModel, user_RolesService, newUser,
				user_RolesService.findPrivilegeByUser(newUser));

		return mav;
	}

	/*
	 * Este metodo hace el render de una vista con los privilegios rol y usuario
	 * hecho en showInde
	 */
	@GetMapping("/consultarUsuario")
	public ModelAndView showConsultaUsuario() {
		ModelAndView mav = new ModelAndView(ViewConstant.FINDUSER_FORM);
		mav.addObject("UserRole", rol);
		mav.addObject("UserName", userName);
		mav.addObject("privileges", helperPrivilegeModel);
		mav.addObject("findUserModel", new FindUserModel());
		return mav;
	}

	@PostMapping("/privilegiosDeUsuario")
	public ModelAndView showPrivilegesByUser(@ModelAttribute(name = "findUserModel") FindUserModel findUserModel) {
		ModelAndView mav = new ModelAndView();
		newUser = userService.findUser(findUserModel.getUserName());

		if (null == newUser) {
			mav.setViewName(ViewConstant.FINDUSER_FORM);
			mav.addObject("UserRole", rol);
			mav.addObject("UserName", userName);
			mav.addObject("privileges", helperPrivilegeModel);
			mav.addObject("result", 0);
		} else {
			if (newUser.getUsername().equals(usuarioGlobal.getUsername())) {
				mav.setViewName(ViewConstant.FINDUSER_FORM);
				mav.addObject("UserRole", rol);
				mav.addObject("UserName", userName);
				mav.addObject("privileges", helperPrivilegeModel);
				mav.addObject("result", 1);
			} else {
				List<UserRole> lista = user_RolesService.findPrivilegeByUser(newUser);
				PrivilegeByUserModel privilegeByUserModel = new PrivilegeByUserModel();
				for (UserRole x : lista) {
					if (x.getPrivilege().equals(ViewConstant.FINDCONSULTOR_FORM)) {
						privilegeByUserModel.setFindConsultor(true);
					}
					if (x.getPrivilege().equals(ViewConstant.NEWUSER_FORM)) {
						privilegeByUserModel.setNewUser(true);
					}
					if (x.getPrivilege().equals(ViewConstant.FINDUSER_FORM)) {
						privilegeByUserModel.setFindUser(true);
					}
					if (x.getPrivilege().equals(ViewConstant.NEWCONSULTOR_FORM)) {
						privilegeByUserModel.setAddConsultor(true);
					}
					if (x.getPrivilege().equals(ViewConstant.METRICS)) {
						privilegeByUserModel.setMetrics(true);
					}
					if (x.getPrivilege().equals(ViewConstant.REPORTS)) {
						privilegeByUserModel.setReports(true);
					}
					if (x.getPrivilege().equals(ViewConstant.ADDCONTRACT_FORM)) {
						privilegeByUserModel.setAddContract(true);
					}
					if (x.getPrivilege().equals(ViewConstant.FINDCONTRACT_FORM)) {
						privilegeByUserModel.setFindContract(true);
					}
				}
				List<String> listaRoles = new ArrayList<String>();
				listaRoles.add("ROLE_ADMIN");
				listaRoles.add("ROLE_RH");
				listaRoles.add("ROLE_R y S");

				mav.setViewName(ViewConstant.ROLBYUSER_FORM);

				mav.addObject("UserRole", rol);
				mav.addObject("UserName", userName);
				mav.addObject("privileges", helperPrivilegeModel);
				mav.addObject("Roles", listaRoles);
				mav.addObject("newUserName", newUser.getUsername());
				mav.addObject("privilegeByUserModel", privilegeByUserModel);
				LOG.info(findUserModel.toString());
			}
		}

		return mav;
	}
	
	
	
	
	@GetMapping("/nuevoConsultor")
	public ModelAndView showNuevoConsultor() {		
		Personas personas=new Personas();
		Escolaridad escolariodad=new Escolaridad();
		Domicilio domicilio=new Domicilio();
		RefPersonales refPersonales=new RefPersonales();
		ModelAndView mav = new ModelAndView(ViewConstant.NEWCONSULTOR_FORM);
		mav.addObject("UserRole", rol);
		mav.addObject("UserName", userName);
		mav.addObject("privileges", helperPrivilegeModel);
		
		mav.addObject("consultorExpedientModel", new ConsultorExpedientModel());
		mav.addObject("asignationRegistryModel", new AsignationRegistryModel());
		mav.addObject("registro",registroModel);
		
		
		mav.addObject("familiares",new DatosFamiliaresModel());
		mav.addObject("certificaciones",new CertificacionesModelo());
		mav.addObject("gen",consultoresService.ListAllGenero());
		mav.addObject("ecivil",consultoresService.LisAllECivil());
		mav.addObject("banco",consultoresService.ListAllBancos());
		mav.addObject("listper",consultoresService.ListAllPersonas());
		mav.addObject("contrato",contratosService.listAllContrato());
		mav.addObject("complemento",contratosService.listAllComplemento());
		clientes=consultoresService.listAllClients();
		mav.addObject("clientes",clientes );
		areas=consultoresService.listAllAreas();
		mav.addObject("areas", areas);
		perfiles=consultoresService.listAllProfiles();
		mav.addObject("perfiles", perfiles);
		gerentesAreas=consultoresService.listAllAreasGerency();
		mav.addObject("gerentes", gerentesAreas);		
		lideresConsultor=consultoresService.listAllLeadersConsultor();
		mav.addObject("lideres", lideresConsultor);
		gerentesComerciales=consultoresService.listAllComercialGerency();
		mav.addObject("gerentesComerciales", gerentesComerciales);

		
		mav.addObject("personas",personas);
		mav.addObject("escolaridad",escolariodad);
		mav.addObject("domicilio",domicilio);
		mav.addObject("refPersonales",refPersonales);
		
			return mav;
	}
	
	@PostMapping("/agregarPersona")
	public ModelAndView addPersona(Personas personas,Escolaridad escolaridad,Domicilio domicilio,
			ConsultoresEmpresaKabec consultoresEmpresaKabec,RefPersonales refPersonales,DatosFamiliaresModel datosFamiliaresModel,
			CertificacionesModelo certificacionesModelo,
			BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			LOG.info("Metodo agregado:"+bindingResult);		
		}
		
	ModelAndView mav=new ModelAndView(ViewConstant.NEWCONSULTOR_FORM);
	
	mav.addObject("UserRole", rol);
	mav.addObject("UserName", userName);
	mav.addObject("privileges", helperPrivilegeModel);
	mav.addObject("consultorExpedientModel", new ConsultorExpedientModel());
	mav.addObject("asignationRegistryModel", new AsignationRegistryModel());
	mav.addObject("registro",new RegistroContratoModel());
	mav.addObject("gen",consultoresService.ListAllGenero());
	mav.addObject("ecivil",consultoresService.LisAllECivil());
	mav.addObject("banco",consultoresService.ListAllBancos());
	mav.addObject("contrato",contratosService.listAllContrato());
	mav.addObject("complemento",contratosService.listAllComplemento());
	mav.addObject("clientes",clientes );
	mav.addObject("areas", areas);
	mav.addObject("perfiles", perfiles);
	mav.addObject("gerentes", gerentesAreas);
	mav.addObject("lideres", lideresConsultor);
	mav.addObject("gerentesComerciales", gerentesComerciales);

	
	
	persona=consultoresService.addPersonas(personas);
	mav.addObject("personas",persona);// aqui esta el objeto que necesito
	
	
	
	escolaridad.setPersonas(persona);
	escolaridadGlobal=consultoresService.addEscolariodad(escolaridad);
	mav.addObject("escolaridad",escolaridadGlobal);
	
	refPersonales.setPersonas(persona);
	refPersonalesGlobal=consultoresService.addReferenciaPersona(refPersonales);
	mav.addObject("refPersonales",refPersonalesGlobal);

	mav.addObject("familiares",consultoresService.addDatos(datosFamiliaresModel, persona));
	mav.addObject("certificaciones",consultoresService.addCertificaciones(certificacionesModelo, persona));
	
	domicilio.setPersonas(persona);
	domicilioGlobal=consultoresService.addDomicilio(domicilio);
	mav.addObject("domicilio",domicilioGlobal);
	
	
	
	LOG.info("Metodo agregado:"+personas.toString());		
	return mav;
	}
	
	
	
	
	@PostMapping("/agregaExpediente")
	public ModelAndView addExpedient(@ModelAttribute(name = "consultorExpedientModel") ConsultorExpedientModel consultorExpedientModel){
		ModelAndView mav = new ModelAndView(ViewConstant.NEWCONSULTOR_FORM);
		mav.addObject("UserRole", rol);
		mav.addObject("UserName", userName);
		mav.addObject("privileges", helperPrivilegeModel);
		mav.addObject("personas",persona);
		mav.addObject("escolaridad",escolaridadGlobal);
		mav.addObject("domicilio",domicilioGlobal);
		mav.addObject("refPersonales",refPersonalesGlobal);
		mav.addObject("familiares",new DatosFamiliaresModel());
		mav.addObject("certificaciones",new CertificacionesModelo());
		mav.addObject("gen",consultoresService.ListAllGenero());
		mav.addObject("ecivil",consultoresService.LisAllECivil());
		mav.addObject("banco",consultoresService.ListAllBancos());
		mav.addObject("contrato",contratosService.listAllContrato());
		mav.addObject("complemento",contratosService.listAllComplemento());
		mav.addObject("clientes",clientes );
		mav.addObject("areas", areas);
		mav.addObject("perfiles", perfiles);
		mav.addObject("gerentes", gerentesAreas);
		mav.addObject("lideres", lideresConsultor);
		mav.addObject("gerentesComerciales", gerentesComerciales);
		
		
		consultorExpedienteGlobal=consultoresExpedienteService.addNewExpedient(consultorExpedientConverter.convertConsultorExpedientModelToConsultorExpedient(consultorExpedientModel, persona));
		mav.addObject("consultorExpedientModel", consultorExpedienteGlobal);
		
		
		
		mav.addObject("registro", new RegistroContratoModel());
		mav.addObject("asignationRegistryModel", new AsignationRegistryModel());
		
		
		return mav;
	}
	

	
	@PostMapping("/agregarRegistro")
	public ModelAndView addRegistroContrato(RegistroContratoModel registromodel,
			Escolaridad escolaridad,ContratoNomina contratonomina,EmpresaComplemento empresaComplemeto){
		ModelAndView mav=new ModelAndView(ViewConstant.NEWCONSULTOR_FORM);
		mav.addObject("UserRole", rol);
		mav.addObject("UserName", userName);
		mav.addObject("privileges", helperPrivilegeModel);
		mav.addObject("personas",persona);
		mav.addObject("escolaridad",escolaridadGlobal);
		mav.addObject("domicilio",domicilioGlobal);
		mav.addObject("refPersonales",refPersonalesGlobal);
		mav.addObject("consultorExpedientModel", consultorExpedienteGlobal);
		mav.addObject("asignationRegistryModel",  new AsignationRegistryModel());
		mav.addObject("familiares",new DatosFamiliaresModel());
		mav.addObject("registro", new RegistroContratoModel());		//falta pasar el modelo al fronend
		mav.addObject("familiares",new DatosFamiliaresModel());
		mav.addObject("certificaciones",new CertificacionesModelo());
		mav.addObject("registro",contratosService.addRegistroContrato(registromodel,persona,contratonomina,empresaComplemeto));
		mav.addObject("gen",consultoresService.ListAllGenero());
		mav.addObject("ecivil",consultoresService.LisAllECivil());
		mav.addObject("banco",consultoresService.ListAllBancos());
		mav.addObject("contrato",contratosService.listAllContrato());
		mav.addObject("complemento",contratosService.listAllComplemento());
		mav.addObject("clientes",clientes );
		mav.addObject("areas", areas);
		mav.addObject("perfiles", perfiles);
		mav.addObject("gerentes", gerentesAreas);
		mav.addObject("lideres", lideresConsultor);
		mav.addObject("gerentesComerciales", gerentesComerciales);
		mav.addObject("gen",consultoresService.ListAllGenero());
		mav.addObject("ecivil",consultoresService.LisAllECivil());
		mav.addObject("banco",consultoresService.ListAllBancos());
		mav.addObject("contrato",contratosService.listAllContrato());
		mav.addObject("complemento",contratosService.listAllComplemento());
	
		LOG.info(registromodel.toString());
		
		
		


		
		return mav;
	}
	
	@PostMapping("/agregaRegistroAsignacion")
	public ModelAndView addAsignationRegistry(@ModelAttribute(name = "asignationRegistryModel") AsignationRegistryModel asignationRegistryModel){
		ModelAndView mav = new ModelAndView();
		mav.addObject("UserRole", rol);
		mav.addObject("UserName", userName);
		mav.addObject("privileges", helperPrivilegeModel);
	//	mav.addObject("personas",persona);
		//mav.addObject("escolaridad",escolaridadGlobal);
		//mav.addObject("domicilio",domicilioGlobal);
		//mav.addObject("refPersonales",refPersonalesGlobal);
		//mav.addObject("registro", new RegistroContratoModel());
		
	//	mav.addObject("consultorExpedientModel", consultorExpedienteGlobal);
		if(null != consultoresService.addAsignationRegistry(registryAsignationConverter.asignationRegistryModelToRegistroAsignacion(asignationRegistryModel, persona)) ){
			mav.setViewName(ViewConstant.INDEX);
			mav.addObject("result", 1);
				
		}
		
				
//		mav.addObject("asignationRegistryModel", registryAsignationConverter.RegistroAsignacionToAsignationRegistryModel(registroAsignacionGlobal));
		
		
		//LOG.info(asignationRegistryModel.toString());
		return mav;
	}
	
	
	

	
	
	
	
}
