package com.udemy.backend.model;

public class HelperPrivilegeNameSubItem {

	/*
	 * Esta clase nos permite almacenar el nombre del item al frontEnd y el nombre de la ruta a donde apuntara*/
	
	//este atributo representa el nombre de la URL
	private String privilege;
	//este atributo representa elñ nombre del item al frontEnd
	private String privilegeName;
	
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	public String getPrivilegeName() {
		return privilegeName;
	}
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	public HelperPrivilegeNameSubItem(String privilege, String privilegeName) {
		super();
		this.privilege = privilege;
		this.privilegeName = privilegeName;
	}
	
	
}
