package com.udemy.backend.model;


public class DatosFamiliaresModel {

	private int idDatosFam;
	private String nomFamiliar;
	private String parentesco;
	private Integer edad;
	private String ocupacion;	
	private String nomFamiliar2;
	private String parentesco2;
	private Integer edad2;
	private String ocupacion2;
	private String nomFamiliar3;
	private String parentesco3;
	private Integer edad3;
	private String ocupacion3;
	private String nomFamiliar4;
	private String parentesco4;
	private Integer edad4;
	private String ocupacion4;
	
	
	private String personas;
	
	public DatosFamiliaresModel(){
		
	}


	public DatosFamiliaresModel(int idDatosFam, String nomFamiliar, String parentesco, Integer edad, String ocupacion,
			String nomFamiliar2, String parentesco2, Integer edad2, String ocupacion2, String nomFamiliar3,
			String parentesco3, Integer edad3, String ocupacion3, String nomFamiliar4, String parentesco4,
			Integer edad4, String ocupacion4, String personas) {
		super();
		this.idDatosFam = idDatosFam;
		this.nomFamiliar = nomFamiliar;
		this.parentesco = parentesco;
		this.edad = edad;
		this.ocupacion = ocupacion;
		this.nomFamiliar2 = nomFamiliar2;
		this.parentesco2 = parentesco2;
		this.edad2 = edad2;
		this.ocupacion2 = ocupacion2;
		this.nomFamiliar3 = nomFamiliar3;
		this.parentesco3 = parentesco3;
		this.edad3 = edad3;
		this.ocupacion3 = ocupacion3;
		this.nomFamiliar4 = nomFamiliar4;
		this.parentesco4 = parentesco4;
		this.edad4 = edad4;
		this.ocupacion4 = ocupacion4;
		this.personas = personas;
	}




	public int getIdDatosFam() {
		return idDatosFam;
	}

	public void setIdDatosFam(int idDatosFam) {
		this.idDatosFam = idDatosFam;
	}

	public String getNomFamiliar() {
		return nomFamiliar;
	}

	public void setNomFamiliar(String nomFamiliar) {
		this.nomFamiliar = nomFamiliar;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	public String getPersonas() {
		return personas;
	}


	public void setPersonas(String personas) {
		this.personas = personas;
	}
	

	public String getNomFamiliar2() {
		return nomFamiliar2;
	}


	public void setNomFamiliar2(String nomFamiliar2) {
		this.nomFamiliar2 = nomFamiliar2;
	}


	public String getParentesco2() {
		return parentesco2;
	}


	public void setParentesco2(String parentesco2) {
		this.parentesco2 = parentesco2;
	}


	public Integer getEdad2() {
		return edad2;
	}


	public void setEdad2(Integer edad2) {
		this.edad2 = edad2;
	}


	public String getOcupacion2() {
		return ocupacion2;
	}


	public void setOcupacion2(String ocupacion2) {
		this.ocupacion2 = ocupacion2;
	}


	public String getNomFamiliar3() {
		return nomFamiliar3;
	}


	public void setNomFamiliar3(String nomFamiliar3) {
		this.nomFamiliar3 = nomFamiliar3;
	}


	public String getParentesco3() {
		return parentesco3;
	}


	public void setParentesco3(String parentesco3) {
		this.parentesco3 = parentesco3;
	}


	public Integer getEdad3() {
		return edad3;
	}


	public void setEdad3(Integer edad3) {
		this.edad3 = edad3;
	}


	public String getOcupacion3() {
		return ocupacion3;
	}


	public void setOcupacion3(String ocupacion3) {
		this.ocupacion3 = ocupacion3;
	}
	
	

	public String getNomFamiliar4() {
		return nomFamiliar4;
	}


	public void setNomFamiliar4(String nomFamiliar4) {
		this.nomFamiliar4 = nomFamiliar4;
	}


	public String getParentesco4() {
		return parentesco4;
	}


	public void setParentesco4(String parentesco4) {
		this.parentesco4 = parentesco4;
	}


	public Integer getEdad4() {
		return edad4;
	}


	public void setEdad4(Integer edad4) {
		this.edad4 = edad4;
	}


	public String getOcupacion4() {
		return ocupacion4;
	}


	public void setOcupacion4(String ocupacion4) {
		this.ocupacion4 = ocupacion4;
	}


	@Override
	public String toString() {
		return "DatosFamiliaresModel [idDatosFam=" + idDatosFam + ", nomFamiliar=" + nomFamiliar + ", parentesco="
				+ parentesco + ", edad=" + edad + ", ocupacion=" + ocupacion + ", nomFamiliar2=" + nomFamiliar2
				+ ", parentesco2=" + parentesco2 + ", edad2=" + edad2 + ", ocupacion2=" + ocupacion2 + ", nomFamiliar3="
				+ nomFamiliar3 + ", parentesco3=" + parentesco3 + ", edad3=" + edad3 + ", ocupacion3=" + ocupacion3
				+ ", nomFamiliar4=" + nomFamiliar4 + ", parentesco4=" + parentesco4 + ", edad4=" + edad4
				+ ", ocupacion4=" + ocupacion4 + ", personas=" + personas + "]";
	}
	
}
