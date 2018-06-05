package com.udemy.backend.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.fabric.xmlrpc.base.Array;
import com.udemy.backend.constant.ViewConstant;
import com.udemy.backend.entity.ConsultoresEmpresaKabec;
import com.udemy.backend.entity.Domicilio;
import com.udemy.backend.entity.Escolaridad;
import com.udemy.backend.entity.Personas;
import com.udemy.backend.entity.RefPersonales;
import com.udemy.backend.service.Consultores;
import com.udemy.backend.service.ConsultoresEmpresaKabecService;

import antlr.collections.List;

@Controller
@RequestMapping("/consultores")
public class ConsultoresController {

	@Autowired
	@Qualifier("ConsultoresServiceImpl")
	private Consultores consultoresService;
	
//	@Autowired
	//@Qualifier("consultoresEmpresaKabecServiceImpl")
	//private ConsultoresEmpresaKabecService consultoresEmpresaKabecService;
	
	
	public static final Log LOG=LogFactory.getLog(ConsultoresController.class);
	
	@PostMapping("/agregarPersona")
	public ModelAndView addPersona(Personas personas,Escolaridad escolaridad,Domicilio domicilio,
			ConsultoresEmpresaKabec consultoresEmpresaKabec,RefPersonales refPersonales,
			BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			LOG.info("Metodo agregado:"+bindingResult);		
		}
		
	ModelAndView mav=new ModelAndView(ViewConstant.NEWCONSULTOR_FORM);
	mav.addObject("gen",consultoresService.ListAllGenero());
	mav.addObject("ecivil",consultoresService.LisAllECivil());
	mav.addObject("banco",consultoresService.ListAllBancos());
	mav.addObject("escolaridad",consultoresService.addEscolariodad(escolaridad));
	mav.addObject("domicilio",consultoresService.addDomicilio(domicilio));
	mav.addObject("personas",consultoresService.addPersonas(personas));// aqui esta el objeto que necesito
	
	LOG.info("Metodo agregado:"+personas.toString());		
	return mav;
	}
	
	
	@RequestMapping("genero/{idGenero}")
	public String showGenero(@PathVariable Integer id,Model model){
		model.addAttribute("genero",consultoresService.findByIdGenero(id));
		return ViewConstant.NEWCONSULTOR_FORM;
	}
	
	@RequestMapping("/genero")
	public String listGenero(Model model){
	model.addAttribute("generos",consultoresService.ListAllGenero());
		return "genero";
	}
	
	
}
