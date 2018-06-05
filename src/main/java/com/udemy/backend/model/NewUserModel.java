package com.udemy.backend.model;

public class NewUserModel {

	
	private String userName;
	private String name;
	private String lastName;
	private String password;
	private String passwordConfirmation;
	
	public NewUserModel(){
		
	}

	public NewUserModel(String userName, String name, String lastName, String password, String passwordConfirmation) {
		super();
		this.userName = userName;
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
		
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	

	@Override
	public String toString() {
		return "NewUserModel [userName=" + userName + ", name=" + name + ", lastName=" + lastName + ", password="
				+ password + ", passwordConfirmation=" + passwordConfirmation + "]";
	}

	
}
