package com.udemy.backend.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.udemy.backend.component.RequestTimeInterceptor;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter{

	@Autowired
	@Qualifier("RequestTimeInterceptor")
	public RequestTimeInterceptor requestTimeInterceptor;
		
	@Override
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(requestTimeInterceptor);
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry){
	registry.addResourceHandler("/webjar/**").addResourceLocations("classpath:/META-INF/resources/webjars/");	
	}
}
