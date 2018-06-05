package com.udemy.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="user_roles")
public class UserRole {

	@Id
	@GeneratedValue
	@Column(name="user_role_id",unique=true,nullable=false)
	private Integer userRoleId;
	
	@Column(name="privilege",nullable=false)
	private String privilege;
	
	

	@Column(name="Nameprivilege",nullable=false)
	private String Nameprivilege;
	
	@Column(name="nameMenuPrivilege", nullable=false)
	private String nameMenuPrivilege;
	
	public String getNameMenuPrivilege() {
		return nameMenuPrivilege;
	}

	public void setNameMenuPrivilege(String nameMenuPrivilege) {
		this.nameMenuPrivilege = nameMenuPrivilege;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="username",nullable=false)
	private User user;
	
	@Column(name="role",nullable=false,length=45)
	private String role;
	
	
	public UserRole(String privilege, String nameprivilege, String nameMenuPrivilege, User user, String role) {
		super();
		this.privilege = privilege;
		Nameprivilege = nameprivilege;
		this.nameMenuPrivilege = nameMenuPrivilege;
		this.user = user;
		this.role = role;
	}
	
	public UserRole(User user, String role,String privilege, String Nameprivilege) {
		super();
		this.user = user;
		this.role = role;
		this.privilege=privilege;
		this.Nameprivilege=Nameprivilege;
	}

	  public UserRole(){
		  
	  }

	public Integer getUserRoleId() {
		return userRoleId;
	}


	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getNameprivilege() {
		return Nameprivilege;
	}

	public void setNameprivilege(String nameprivilege) {
		Nameprivilege = nameprivilege;
	}

	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	@Override
	public String toString() {
		return "UserRole [userRoleId=" + userRoleId + ", privilege=" + privilege + ", Nameprivilege=" + Nameprivilege
				+ ", nameMenuPrivilege=" + nameMenuPrivilege + ", user=" + user + ", role=" + role + "]";
	}



}
