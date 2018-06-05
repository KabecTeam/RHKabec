package com.udemy.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue
	@Column(name = "idcontact")
	private int idcontact;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "city")
	private String city;
	@Column(name="mail")
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

	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	public Contact(int idcontact,String firstname, String lastname, String telephone,String mail, String city) {
		super(); 
		this.idcontact = idcontact;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.mail=mail;
		this.city = city;
	}
	
	public Contact() {

	}
}