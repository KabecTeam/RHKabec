package com.udemy.backend.model;


public class RegistroContratoModel {

	private int idRegistroCont;
	private String numRequerimiento;
	private int tarifa;
	private String numPoliza;
	private String estConsultor;
    private int sueldo;
	private String fechAltImss;
	private Boolean recontratacion;
	private String contratoNomina;
	private String fechininomin;
	private String fechfinnomin;
	private String empresaComplemento; 
	private String fechinicomp;
	private String fechfincomp;
	private String personas;
	private String numConsultor;
	

	public RegistroContratoModel(int idRegistroCont, String numRequerimiento, int tarifa, String numPoliza,
			String estConsultor, int sueldo, String fechAltImss, Boolean recontratacion, String contratoNomina,
			String fechininomin, String fechfinnomin, String empresaComplemento, String fechinicomp, String fechfincomp,
			String personas, String numConsultor) {
		super();
		this.idRegistroCont = idRegistroCont;
		this.numRequerimiento = numRequerimiento;
		this.tarifa = tarifa;
		this.numPoliza = numPoliza;
		this.estConsultor = estConsultor;
		this.sueldo = sueldo;
		this.fechAltImss = fechAltImss;
		this.recontratacion = recontratacion;
		this.contratoNomina = contratoNomina;
		this.fechininomin = fechininomin;
		this.fechfinnomin = fechfinnomin;
		this.empresaComplemento = empresaComplemento;
		this.fechinicomp = fechinicomp;
		this.fechfincomp = fechfincomp;
		this.personas = personas;
		this.numConsultor = numConsultor;
	}

	public RegistroContratoModel(){
		
	}

	public int getIdRegistroCont() {
		return idRegistroCont;
	}

	public void setIdRegistroCont(int idRegistroCont) {
		this.idRegistroCont = idRegistroCont;
	}

	public String getNumRequerimiento() {
		return numRequerimiento;
	}

	public void setNumRequerimiento(String numRequerimiento) {
		this.numRequerimiento = numRequerimiento;
	}

	public int getTarifa() {
		return tarifa;
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

	public String getNumPoliza() {
		return numPoliza;
	}

	public void setNumPoliza(String numPoliza) {
		this.numPoliza = numPoliza;
	}

	public String getEstConsultor() {
		return estConsultor;
	}

	public void setEstConsultor(String estConsultor) {
		this.estConsultor = estConsultor;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getFechAltImss() {
		return fechAltImss;
	}

	public void setFechAltImss(String fechAltImss) {
		this.fechAltImss = fechAltImss;
	}

	public Boolean getRecontratacion() {
		return recontratacion;
	}

	public void setRecontratacion(Boolean recontratacion) {
		this.recontratacion = recontratacion;
	}


	public String getFechininomin() {
		return fechininomin;
	}

	public void setFechininomin(String fechininomin) {
		this.fechininomin = fechininomin;
	}

	public String getFechfinnomin() {
		return fechfinnomin;
	}

	public void setFechfinnomin(String fechfinnomin) {
		this.fechfinnomin = fechfinnomin;
	}

	
	public String getFechinicomp() {
		return fechinicomp;
	}

	public void setFechinicomp(String fechinicomp) {
		this.fechinicomp = fechinicomp;
	}

	public String getFechfincomp() {
		return fechfincomp;
	}

	public void setFechfincomp(String fechfincomp) {
		this.fechfincomp = fechfincomp;
	}

	public String getContratoNomina() {
		return contratoNomina;
	}

	public void setContratoNomina(String contratoNomina) {
		this.contratoNomina = contratoNomina;
	}

	public String getEmpresaComplemento() {
		return empresaComplemento;
	}

	public void setEmpresaComplemento(String empresaComplemento) {
		this.empresaComplemento = empresaComplemento;
	}

	public String getPersonas() {
		return personas;
	}

	public void setPersonas(String personas) {
		this.personas = personas;
	}
		
	
	public String getNumConsultor() {
		return numConsultor;
	}

	public void setNumConsultor(String numConsultor) {
		this.numConsultor = numConsultor;
	}

	@Override
	public String toString() {
		return "RegistroContratoModel [idRegistroCont=" + idRegistroCont + ", numRequerimiento=" + numRequerimiento
				+ ", tarifa=" + tarifa + ", numPoliza=" + numPoliza + ", estConsultor=" + estConsultor + ", sueldo="
				+ sueldo + ", fechAltImss=" + fechAltImss + ", recontratacion=" + recontratacion + ", contratoNomina="
				+ contratoNomina + ", fechininomin=" + fechininomin + ", fechfinnomin=" + fechfinnomin
				+ ", empresaComplemento=" + empresaComplemento + ", fechinicomp=" + fechinicomp + ", fechfincomp="
				+ fechfincomp + ", personas=" + personas + ", numConsultor=" + numConsultor + "]";
	}
	
}
