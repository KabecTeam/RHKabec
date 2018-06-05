package com.udemy.backend.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@Column(name="username",unique=true,nullable=false,length=45)
	private String username;
	
	@Column(name="name",nullable=false,length=80)
	private String name;
	
	@Column(name="password",nullable=false,length=60)
	private String password;
	
	@Column(name="enabled",nullable=false)
	private boolean enabled;
	
	
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="user")
	private Set<UserRole> userRole=new HashSet<UserRole>();
	
	
	public User(String username,String name,String password, boolean enabled) {
		super();
		this.username = username;
		this.name=name;
		this.password = password;
		this.enabled = enabled;
	}
	


	public User(String username,String name,String password, boolean enabled, Set<com.udemy.backend.entity.UserRole> userRole) {
		super();
		this.name=name;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.userRole = userRole;
	}
	
	
	public User(){
		
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public Set<UserRole> getUserRole() {
		return userRole;
	}


	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}
}
