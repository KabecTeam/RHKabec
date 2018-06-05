package com.udemy.backend.model;

public class PrivilegeByUserModel {

	@Override
	public String toString() {
		return "PrivilegeByUserModel [newUser=" + newUser + ", findUser=" + findUser + ", reports=" + reports
				+ ", metrics=" + metrics + ", addConsultor=" + addConsultor + ", findConsultor=" + findConsultor
				+ ", addContract=" + addContract + ", findContract=" + findContract + ", typeRol=" + typeRol
				+ ", userName=" + userName + "]";
	}

	private boolean newUser;
	private boolean findUser;
	private boolean reports;
	private boolean metrics;
	private boolean addConsultor;
	private boolean findConsultor;
	private boolean addContract;
	private boolean findContract;
	public PrivilegeByUserModel() {
	}
	
	public PrivilegeByUserModel(String userName,boolean newUser, boolean findUser, boolean reports, boolean metrics,
			boolean addConsultor, boolean findConsultor, boolean addContract, boolean findContract,String typeRol) {
		super();
		this.userName=userName;
		this.newUser = newUser;
		this.findUser = findUser;
		this.reports = reports;
		this.metrics = metrics;
		this.addConsultor = addConsultor;
		this.findConsultor = findConsultor;
		this.addContract = addContract;
		this.findContract = findContract;
		this.typeRol=typeRol;
	}
	
	
	public String getTypeRol() {
		return typeRol;
	}

	public void setTypeRol(String typeRol) {
		this.typeRol = typeRol;
	}

	String typeRol;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String userName;


	public boolean isNewUser() {
		return newUser;
	}

	public void setNewUser(boolean newUser) {
		this.newUser = newUser;
	}

	public boolean isFindUser() {
		return findUser;
	}

	public void setFindUser(boolean findUser) {
		this.findUser = findUser;
	}

	public boolean isReports() {
		return reports;
	}

	public void setReports(boolean reports) {
		this.reports = reports;
	}

	public boolean isMetrics() {
		return metrics;
	}

	public void setMetrics(boolean metrics) {
		this.metrics = metrics;
	}

	public boolean isAddConsultor() {
		return addConsultor;
	}

	public void setAddConsultor(boolean addConsultor) {
		this.addConsultor = addConsultor;
	}

	public boolean isFindConsultor() {
		return findConsultor;
	}

	public void setFindConsultor(boolean findConsultor) {
		this.findConsultor = findConsultor;
	}

	public boolean isAddContract() {
		return addContract;
	}

	public void setAddContract(boolean addContract) {
		this.addContract = addContract;
	}

	public boolean isFindContract() {
		return findContract;
	}

	public void setFindContract(boolean findContract) {
		this.findContract = findContract;
	}

}
