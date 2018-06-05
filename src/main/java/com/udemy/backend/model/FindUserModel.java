package com.udemy.backend.model;

public class FindUserModel {

	private String userName;
	private String completName;

	public FindUserModel() {

	}

	public FindUserModel(String userName, String completName) {
		super();
		this.userName = userName;
		this.completName = completName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCompletName() {
		return completName;
	}

	public void setCompletName(String completName) {
		this.completName = completName;
	}

	@Override
	public String toString() {
		return "FindUserModel [userName=" + userName + ", completName=" + completName + "]";
	}

}
