package com.udemy.backend.model;

public class ContactModel {

	private int idcontact;
	private String firstname;
	private String lastname;
	private String telephone;
	private String city;
    private String mail;
	
	
	public int getIdcontact() {
		return idcontact;
	}

	public void setIdcontact(int idcontact) {
		this.idcontact = idcontact;
	}

	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
	
	public ContactModel(int idcontact,String firstname, String lastname, String telephone,String mail,String city) {
		super();
		this.idcontact = idcontact;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.mail=mail;
		this.city = city;
	}
		
	@Override
	public String toString() {
		return "ContactModel [idcontact=" + idcontact + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", telephone=" + telephone + ", city=" + city + ", mail=" + mail + "]";
	}

	public ContactModel(){
		
	}
	
}
