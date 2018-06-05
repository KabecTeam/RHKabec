package com.udemy.backend.model;

public class UserCredential {

	public String username;
	public String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserCredential(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "UserCredential [username=" + username + ", password=" + password + "]";
	}
	
	public UserCredential(){
		
	}
	
}
