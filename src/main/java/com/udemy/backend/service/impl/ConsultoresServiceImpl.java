package com.udemy.backend.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backend.component.CertificacioneConverter;
import com.udemy.backend.component.DatosFamiliaresConverter;
import com.udemy.backend.component.PersonaConverter;
import com.udemy.backend.entity.Area;
import com.udemy.backend.entity.Bancos;
import com.udemy.backend.entity.Certificaciones;
import com.udemy.backend.entity.Cliente;
import com.udemy.backend.entity.Domicilio;
import com.udemy.backend.entity.Escolaridad;
import com.udemy.backend.entity.EstadoCivil;
import com.udemy.backend.entity.Genero;
import com.udemy.backend.entity.GerenteComercial;
import com.udemy.backend.entity.GerentesArea;
import com.udemy.backend.entity.LideresConsultor;
import com.udemy.backend.entity.Perfil;
import com.udemy.backend.entity.Personas;
import com.udemy.backend.entity.RefPersonales;
import com.udemy.backend.entity.RegistroAsignacion;
import com.udemy.backend.model.CertificacionesModelo;
import com.udemy.backend.model.DatosFamiliaresModel;
import com.udemy.backend.repository.AreaRepository;
import com.udemy.backend.repository.BancoRepository;
import com.udemy.backend.repository.CertificacionRepository;
import com.udemy.backend.repository.ClienteRepository;
import com.udemy.backend.repository.ConsultoresRepository;
import com.udemy.backend.repository.DatosFamiliaresRepository;
import com.udemy.backend.repository.DomicilioRepository;
import com.udemy.backend.repository.ECivilRepository;
import com.udemy.backend.repository.EscolaridadRepository;
import com.udemy.backend.repository.GeneroRepository;
import com.udemy.backend.repository.GerenteComercialRepository;
import com.udemy.backend.repository.GerentesAreaRepository;
import com.udemy.backend.repository.LideresConsultoresRespository;
import com.udemy.backend.repository.PerfilRepository;
import com.udemy.backend.repository.RefPersonalesRepository;
import com.udemy.backend.repository.RegitroAsignacionRepository;
import com.udemy.backend.service.Consultores;

@Service("ConsultoresServiceImpl")
public class ConsultoresServiceImpl implements Consultores{


	@Autowired
	@Qualifier("consultoresRepository")
	private ConsultoresRepository consultoresRepository;
	
	@Autowired
	@Qualifier("generoRepository")
	private GeneroRepository generoRepository;
	
	@Autowired
	@Qualifier("eCivilRepository")
	private ECivilRepository eCivilRepository;
	
	@Autowired
	@Qualifier("bancoRepository")
	private BancoRepository bancoRepository;
	
	@Autowired
	@Qualifier("escolaridadRepository")
	private EscolaridadRepository escolaridadRepository;
	
	@Autowired
	@Qualifier("domicilioRepository")
	private DomicilioRepository domicilioRepository; 
	
	@Autowired
	@Qualifier("refPersonalesRepository")
	private RefPersonalesRepository refPersonalesRepository;
	
	
	@Autowired
	@Qualifier("clienteRepository")
	private ClienteRepository clienteRepository;
	
	@Autowired
	@Qualifier("areaRepository")
	private AreaRepository areaRepository;
	
	@Autowired
	@Qualifier("perfilRepository")
	private PerfilRepository perfilRepository;

	
	@Autowired
	@Qualifier("gerentesAreaRepository")
	private GerentesAreaRepository gerentesAreaRepository;

	@Autowired
	@Qualifier("lideresConsultoresRespository")
	private LideresConsultoresRespository lideresConsultoresRespository;
	
	@Autowired
	@Qualifier("gerenteComercialRepository")
	private GerenteComercialRepository gerenteComercialRepository;
	
	@Autowired
	@Qualifier("regitroAsignacionRepository")
	private RegitroAsignacionRepository regitroAsignacionRepository;
	
	@Autowired
	@Qualifier("certificacionRepository")
	private CertificacionRepository certificacionRepository;
	
	@Autowired
	@Qualifier("certificacioneConverter")
	private CertificacioneConverter certificacioneConverter;
	
	
	@Override
	public Personas findByIdPersonas(Integer id) {
		return consultoresRepository.findOne(id);
	}

	@Override
	public Iterable<Personas> ListAllPersonas() {
		return consultoresRepository.findAll();
	}

	@Override
	public Personas addPersonas(Personas personas) {
		return consultoresRepository.save(personas);
	//Personas personas=consultoresRepository.save(personaConverter.converterPersonaModel2Persona(personasModel));
	//return personaConverter.convertPersona2PersonaModel(personas);
	}

	@Override
	public void deletePersonas(Integer id) {
		consultoresRepository.delete(id);
	}

	@Override
	public Genero findByIdGenero(Integer id) {
		return generoRepository.findOne(id);
	}

	@Override
	public Iterable<Genero> ListAllGenero() {
		return generoRepository.findAll();
	}

	@Override
	public Iterable<EstadoCivil> LisAllECivil() {
		return eCivilRepository.findAll();
	}

	@Override
	public Iterable<Bancos> ListAllBancos() {
		return bancoRepository.findAll();
	}

	@Override
	public EstadoCivil findByIdEstadoC(Integer name) {
		return eCivilRepository.findOne(name);
	}

	@Override
	public Escolaridad addEscolariodad(Escolaridad escolaridad) {
		return escolaridadRepository.save(escolaridad);
	}

	@Override
	public Domicilio addDomicilio(Domicilio domicilio) {
		return domicilioRepository.save(domicilio);
	}

	@Override
	public RefPersonales addReferenciaPersona(RefPersonales refPersonales) {
		return refPersonalesRepository.save(refPersonales);
	}

	@Override
	public List<Cliente> listAllClients() {
		return clienteRepository.findAll();
	}

	@Override
	public List<Area> listAllAreas() {
		return areaRepository.findAll();
	}

	@Override
	public List<Perfil> listAllProfiles() {
		return perfilRepository.findAll();
	}

	@Autowired
	@Qualifier("datosFamiliaresConverter")
	private DatosFamiliaresConverter datosFamiliaresConverter;
	
	@Autowired
	@Qualifier("datosFamiliaresRepository")
	private DatosFamiliaresRepository datosFamiliaresRepository;
	public List<GerentesArea> listAllAreasGerency() {
		return gerentesAreaRepository.findAll();
	}

	@Override
	public List<LideresConsultor> listAllLeadersConsultor() {
		return lideresConsultoresRespository.findAll();
	}
	
	@Override
	public List<GerenteComercial> listAllComercialGerency() {
		return gerenteComercialRepository.findAll();
	}
	@Override
	public Cliente findClient(int idCliente) {
		return clienteRepository.findOne(idCliente);
	}

	@Override
	public Area findArea(int idArea) {
		return areaRepository.findOne(idArea);
	}

	@Override
	public LideresConsultor findLeader(int idLeader) {
		return lideresConsultoresRespository.findOne(idLeader);
	}

	@Override
	public GerentesArea findAreaGerency(int idGerency) {
		return gerentesAreaRepository.findOne(idGerency);
	}

	@Override
	public Perfil findProfile(int idProfile) {
		
		return perfilRepository.findOne(idProfile);
	}

	@Override
	public GerenteComercial findComercialGerency(int idComercialGerency) {
		return gerenteComercialRepository.findOne(idComercialGerency);
	}

	@Override
	public RegistroAsignacion addAsignationRegistry(RegistroAsignacion registroAsignacion) {
		return regitroAsignacionRepository.save(registroAsignacion);
	}
	
	@Override
	public DatosFamiliaresModel addDatos(DatosFamiliaresModel datosFamiliaresmodel, Personas personas) {
		com.udemy.backend.entity.DatosFamiliares datosFamiliares=datosFamiliaresRepository.save(datosFamiliaresConverter.converterDatosFamiliaresModel2DatosFamiliares(datosFamiliaresmodel, personas));
		return datosFamiliaresConverter.converterDatosFamiliares2DatosFamiliaresModel(datosFamiliares, personas);
	}

	@Override
	public CertificacionesModelo addCertificaciones(CertificacionesModelo certificacionesModelo, Personas personas) {
		Certificaciones certificaciones=certificacionRepository.save(certificacioneConverter.converterCertificacioneModel2Certificaciones(certificacionesModelo, personas));
		return certificacioneConverter.converterCertificaciones2CertificacionesModel(certificaciones, personas);
	}

}
