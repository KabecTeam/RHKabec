package com.udemy.backend.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemy.backend.constant.ViewConstant;
import com.udemy.backend.model.UserCredential;

@Controller
public class LoginController {

	public static final Log LOG=LogFactory.getLog(LoginController.class);
	
	
	
	/*
	 * aqui tenemos el metodo que devuelve el render de login
	 * primero lo muestra de manera normal
	 * si hay algun error el RequestParam se le pasa un atributo de error (login?error)
	 * si se ingreso pero el usuario cierra su sesion el RequestParam se le pasa el atributo de logout (login?logout)  
	 */
	 @GetMapping("/login")
	 public String showLoginForm(Model model,
			 @RequestParam(name="error",required=false) String error,
			 @RequestParam(name="logout",required=false) String logout){
			LOG.info("METHOD: redirectToLogin()-- PARAMS:"+error+" ,logout:"+logout);
		 model.addAttribute("error",error);
		 model.addAttribute("logout", logout);
			LOG.info("Returning to login view");
		 return ViewConstant.LOGIN;
	 }
	
	 /*
	  * Este metodo supervisa el login exitoso con un usuario existente
	  * se especifica mas detalladamente en SecurityConfiguration
	  * El metodo de ser positivo en el login redirecciona unicamente al showIndex (pagina de inicio del sistema)
	  * */
	 @GetMapping({"/loginsuccess","/"})
	 public String loginCheck(){
			 return "redirect:/Kabec/showIndex";
	}
}
