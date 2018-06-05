package com.udemy.backend.model;

import java.util.List;

public class HelperPrivilegeModel {

	/*
	 * Esta clase nos ayudara a sacar un mapa del Nombre del Menu y sus items de ese menu */
	
	//este atributo equivale al nombre del menu que se mostrara en el frontEnd
	private String nameMenuPrivilege;
	//este atributo lista seran los items que contiene cada nombre de menu en el frontEnd la cual tiene dos atributos (nombre para el frontEnd y el nombre de la ruta para ese render)
	//la clase que mapea a esta lista esta colocada en Model
	//mas informacion en su clase respectiva
	private List<HelperPrivilegeNameSubItem> namePrivilege;

	
	public String getNameMenuPrivilege() {

		return nameMenuPrivilege;
	}

	public void setNameMenuPrivilege(String nameMenuPrivilege) {
		this.nameMenuPrivilege = nameMenuPrivilege;
	}

	public List<HelperPrivilegeNameSubItem> getNamePrivilege() {
		return namePrivilege;
	}

	public void setNamePrivilege(List<HelperPrivilegeNameSubItem> namePrivilege) {
		this.namePrivilege = namePrivilege;
	}


	public HelperPrivilegeModel(String nameMenuPrivilege, List<HelperPrivilegeNameSubItem> namePrivilege) {
		super();
		this.nameMenuPrivilege = nameMenuPrivilege;
		this.namePrivilege = namePrivilege;
	}
	
}
