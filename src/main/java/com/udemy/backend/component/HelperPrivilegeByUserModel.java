package com.udemy.backend.component;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.udemy.backend.entity.User;
import com.udemy.backend.entity.UserRole;
import com.udemy.backend.model.PrivilegeByUserModel;
import com.udemy.backend.service.User_RolesService;

public class HelperPrivilegeByUserModel {

	
	private static Log LOG = LogFactory.getLog(HelperPrivilegeByUserModel.class);
	
	public void buildListPrivilegesByUser(PrivilegeByUserModel  privilegeByUserModel,User_RolesService user_RolesService, User newUser, List<UserRole> lista){
		
		user_RolesService.deletePrivilegesByUser(lista);
		
		LOG.info("Nombre del nuevo Usuario  "+ newUser.getUsername() );
		String typeRol=privilegeByUserModel.getTypeRol();
		
		if(privilegeByUserModel.isNewUser() ){
		//	LOG.info("(Nombre del Item en Front -> ) Nuevo Usuario, (Nombre del menu en Front ) Administracion, (Nombre de la ruta) altaUsuario" );
			user_RolesService.addNewUserRole(new UserRole("altaUsuario", "Nuevo Usuario", "Administracion", newUser, typeRol));
		}
		if(privilegeByUserModel.isFindUser()){
			//LOG.info("(Nombre del Item en Front -> ) Consultar Usuario, (Nombre del menu en Front ) Administracion, (Nombre de la ruta) consultarUsuario" );
			user_RolesService.addNewUserRole(new UserRole("consultarUsuario", "Consultar Usuario", "Administracion", newUser, typeRol));
		}
		if( privilegeByUserModel.isReports()){
		//	LOG.info("(Nombre del Item en Front -> ) , (Nombre del menu en Front ) Reportes, (Nombre de la ruta) AunNoExiste" );
			user_RolesService.addNewUserRole(new UserRole("reportes", "", "Reportes", newUser, typeRol));
		}
		if(privilegeByUserModel.isMetrics()){
			//LOG.info("(Nombre del Item en Front -> ) , (Nombre del menu en Front ) Metricas, (Nombre de la ruta) AunNoExiste" );
			user_RolesService.addNewUserRole(new UserRole("metricas", "", "Metricas", newUser, typeRol));
		}
		if( privilegeByUserModel.isAddConsultor()){
		//	LOG.info("(Nombre del Item en Front -> ) Nuevo Consultor , (Nombre del menu en Front ) Contratacion, (Nombre de la ruta) nuevoConsultor" );
			user_RolesService.addNewUserRole(new UserRole("nuevoConsultor", "Nuevo Consultor", "Contratacion", newUser, typeRol));
		}
		if(privilegeByUserModel.isFindConsultor()){
		//	LOG.info("(Nombre del Item en Front -> ) Busqueda de Consultor , (Nombre del menu en Front ) Contratacion, (Nombre de la ruta) buscaConsultor" );
			user_RolesService.addNewUserRole(new UserRole("buscaConsultor", "Busqueda de Consultor", "Contratacion", newUser, typeRol));
		}
		if(privilegeByUserModel.isAddContract()){
			//LOG.info("(Nombre del Item en Front -> ) Agrega un Contrato , (Nombre del menu en Front ) Contratacion, (Nombre de la ruta) AunNoExiste" );
			user_RolesService.addNewUserRole(new UserRole("nuevoContrato", "Agrega un Contrato", "Contratacion", newUser, typeRol));
		}
		if(privilegeByUserModel.isFindContract()){
			//LOG.info("(Nombre del Item en Front -> ) Busqueda de un Contrato , (Nombre del menu en Front ) Contratacion, (Nombre de la ruta) AunNoExiste" );
			user_RolesService.addNewUserRole(new UserRole("buscaContrato", "Busqueda de un Contrato", "Contratacion", newUser, typeRol));

		}
	}
}

