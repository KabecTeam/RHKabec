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
@Table(name="tipopersona")
public class TipoPersona {

	@Id
	@Column(name="idTipoPersona",unique=true,nullable=false)
	private int idTipoPersona;
	
	@Column(name="tipoPersona",nullable=false,length=60)
	private String tipoPersona;

	//@OneToMany(fetch=FetchType.EAGER,mappedBy="tipoPersona")
	//private Set<Personas> personas=new HashSet<Personas>();
	
	

	public TipoPersona(){
		
	}

	public TipoPersona(int idTipoPersona, String tipoPersona) {
		super();
		this.idTipoPersona = idTipoPersona;
		this.tipoPersona = tipoPersona;
	}

	public int getIdTipoPersona() {
		return idTipoPersona;
	}

	public void setIdTipoPersona(int idTipoPersona) {
		this.idTipoPersona = idTipoPersona;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

}
