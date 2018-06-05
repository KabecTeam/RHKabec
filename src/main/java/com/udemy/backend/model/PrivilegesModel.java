package com.udemy.backend.model;

import java.util.List;

import com.udemy.backend.entity.UserRole;

public class PrivilegesModel {

	
	private String menuName;
	private List<UserRole> subMenuName;

	public PrivilegesModel(String menuName, List<UserRole> subMenuName) {
		super();
		this.menuName = menuName;
		this.subMenuName = subMenuName;
	}

	public PrivilegesModel(){
		
	}
		
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public List<UserRole> getSubMenuName() {
		return subMenuName;
	}
	public void setSubMenuName(List<UserRole> subMenuName) {
		this.subMenuName = subMenuName;
	}
	

}
