package com.udemy.backend.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration 
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	/*
	 * En esta clase ocuparemos el Spring Security para autenticar el login */
	
	//Este service viene explicado en su respectiva clase de implementacion 
	@Autowired
	@Qualifier("userService")
	private UserDetailsService userService;
	
	//Metodo que nos permite comparar la contraseña desde el front y se encriptara para poder ser comparada con la ya encriptada en la base de datos 
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception {
		auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());	
	}
	
	
	/*
	 * Este metodo nos permite hacer diversas cosas...
	 * la primera nos permite especificar los archivos estaticos para que Spring les de autorizacion de que se puedan cargar al front desde cualquier usuario
	 * la segunda especificamos la URL donde se encuentra el render del login y en la URL que evaluara los datos de la credencial 
	 * la tercera especificamos cuales son los parametros que debera Spring evaluar tales como username y password
	 * la cuarta especificamos la URL de que en caso de ser exitoso el login nos redireccionara (/loginsuccess) esta URL esta colocada 
	 * la quita especifica el parametro por el cual termina la session del usuario previamente autenticado */
		@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/css/*","/imgs/*","/js/*","/dist/img/*"
				,"/bower_components/bootstrap/dist/css/*","/dist/css/*",
				"/bower_components/font-awesome/css/*",
				"/bower_components/Ionicons/css/*").permitAll().
		anyRequest().authenticated().and().
		formLogin().loginPage("/login").loginProcessingUrl("/logincheck").
		usernameParameter("username").passwordParameter("password").
		defaultSuccessUrl("/loginsuccess").permitAll().
		and().
		logout().logoutUrl("/logout").logoutSuccessUrl("/login?logout").permitAll();
	}

	
	
	
}
