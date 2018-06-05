package com.udemy.backend.model;

public class CertificacionesModelo {

	  private int idCertificacion;
	  private String nombreCertificacion;
	  private int anioCertificacion;
	  private int anioValidez;
	  private String nombreCertificacion2;
	  private int anioCertificacion2;
	  private int anioValidez2;
	  
	  
	  private String personas;
	  
	  public CertificacionesModelo(){
		  
	  }

	public CertificacionesModelo(int idCertificacion, String nombreCertificacion, int anioCertificacion,
			int anioValidez, String nombreCertificacion2, int anioCertificacion2, int anioValidez2, String personas) {
		super();
		this.idCertificacion = idCertificacion;
		this.nombreCertificacion = nombreCertificacion;
		this.anioCertificacion = anioCertificacion;
		this.anioValidez = anioValidez;
		this.nombreCertificacion2 = nombreCertificacion2;
		this.anioCertificacion2 = anioCertificacion2;
		this.anioValidez2 = anioValidez2;
		this.personas = personas;
	}



	public int getIdCertificacion() {
		return idCertificacion;
	}

	public void setIdCertificacion(int idCertificacion) {
		this.idCertificacion = idCertificacion;
	}

	public String getNombreCertificacion() {
		return nombreCertificacion;
	}

	public void setNombreCertificacion(String nombreCertificacion) {
		this.nombreCertificacion = nombreCertificacion;
	}

	public int getAnioCertificacion() {
		return anioCertificacion;
	}

	public void setAnioCertificacion(int anioCertificacion) {
		this.anioCertificacion = anioCertificacion;
	}

	public int getAnioValidez() {
		return anioValidez;
	}

	public void setAnioValidez(int anioValidez) {
		this.anioValidez = anioValidez;
	}

	public String getPersonas() {
		return personas;
	}

	public void setPersonas(String personas) {
		this.personas = personas;
	}
	
	
	public String getNombreCertificacion2() {
		return nombreCertificacion2;
	}

	public void setNombreCertificacion2(String nombreCertificacion2) {
		this.nombreCertificacion2 = nombreCertificacion2;
	}

	public int getAnioCertificacion2() {
		return anioCertificacion2;
	}

	public void setAnioCertificacion2(int anioCertificacion2) {
		this.anioCertificacion2 = anioCertificacion2;
	}

	public int getAnioValidez2() {
		return anioValidez2;
	}

	public void setAnioValidez2(int anioValidez2) {
		this.anioValidez2 = anioValidez2;
	}

	@Override
	public String toString() {
		return "CertificacionesModelo [idCertificacion=" + idCertificacion + ", nombreCertificacion="
				+ nombreCertificacion + ", anioCertificacion=" + anioCertificacion + ", anioValidez=" + anioValidez
				+ ", nombreCertificacion2=" + nombreCertificacion2 + ", anioCertificacion2=" + anioCertificacion2
				+ ", anioValidez2=" + anioValidez2 + ", personas=" + personas + "]";
	}
	
}
