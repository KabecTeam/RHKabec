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
@Table(name="bancos")
public class Bancos {
	
	@Id
	@Column(name="idBanco",unique=true,nullable=false)
	private int idBanco;
	@Column(name="nombreBanco",nullable=false,length=80)
	private String nombreBanco;
	@OneToMany(fetch=FetchType.EAGER,mappedBy="bancos")
	private Set<Personas> persona=new HashSet<Personas>(); 
	
	public Bancos(){
		
	}

	public Bancos(int idBanco, String nombreBanco, Set<Personas> persona) {
		super();
		this.idBanco = idBanco;
		this.nombreBanco = nombreBanco;
		this.persona = persona;
	}



	public int getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public Set<Personas> getPersona() {
		return persona;
	}

	public void setPersona(Set<Personas> persona) {
		this.persona = persona;
	}
	
}
