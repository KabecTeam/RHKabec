package com.udemy.backend.model;

public class AsignationRegistryModel {

	
	private String cliente;
	private String perfil;
	private String perfilAsignacion;
	private String area;
	private String manager;
	private String lider;
	private String gerenteComercial;
	private String ubicacionconsultor;
	private String fechaInicioAsignacion;
	private String fechaFinAsignacion;
	private String fechaInicioAnexoAsignacion;
	private String fechaFinAnexoAsignacion;
	private String fechaInicioAnexoFacturacion;
	private String fechaFinAnexoFacturacion;
	private String horario;
	private String propuestaEconomica;
	private String Anexo;
	
	
	public AsignationRegistryModel(){
		
	}
	
	public AsignationRegistryModel(String cliente, String perfil, String perfilAsignacion, String area, String manager,
			String lider, String gerenteComercial, String ubicacionconsultor, String fechaInicioAsignacion,
			String fechaFinAsignacion, String fechaInicioAnexoAsignacion, String fechaFinAnexoAsignacion,
			String fechaInicioAnexoFacturacion, String fechaFinAnexoFacturacion, String horario,
			String propuestaEconomica, String anexo) {
		super();
		this.cliente = cliente;
		this.perfil = perfil;
		this.perfilAsignacion = perfilAsignacion;
		this.area = area;
		this.manager = manager;
		this.lider = lider;
		this.gerenteComercial = gerenteComercial;
		this.ubicacionconsultor = ubicacionconsultor;
		this.fechaInicioAsignacion = fechaInicioAsignacion;
		this.fechaFinAsignacion = fechaFinAsignacion;
		this.fechaInicioAnexoAsignacion = fechaInicioAnexoAsignacion;
		this.fechaFinAnexoAsignacion = fechaFinAnexoAsignacion;
		this.fechaInicioAnexoFacturacion = fechaInicioAnexoFacturacion;
		this.fechaFinAnexoFacturacion = fechaFinAnexoFacturacion;
		this.horario = horario;
		this.propuestaEconomica = propuestaEconomica;
		Anexo = anexo;
	}

	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getLider() {
		return lider;
	}
	public void setLider(String lider) {
		this.lider = lider;
	}
	public String getGerenteComercial() {
		return gerenteComercial;
	}
	public void setGerenteComercial(String gerenteComercial) {
		this.gerenteComercial = gerenteComercial;
	}
	public String getUbicacionconsultor() {
		return ubicacionconsultor;
	}
	public void setUbicacionconsultor(String ubicacionconsultor) {
		this.ubicacionconsultor = ubicacionconsultor;
	}
	public String getFechaInicioAsignacion() {
		return fechaInicioAsignacion;
	}
	public void setFechaInicioAsignacion(String fechaInicioAsignacion) {
		this.fechaInicioAsignacion = fechaInicioAsignacion;
	}
	public String getFechaFinAsignacion() {
		return fechaFinAsignacion;
	}
	public void setFechaFinAsignacion(String fechaFinAsignacion) {
		this.fechaFinAsignacion = fechaFinAsignacion;
	}
	public String getFechaInicioAnexoAsignacion() {
		return fechaInicioAnexoAsignacion;
	}
	public void setFechaInicioAnexoAsignacion(String fechaInicioAnexoAsignacion) {
		this.fechaInicioAnexoAsignacion = fechaInicioAnexoAsignacion;
	}
	public String getFechaFinAnexoAsignacion() {
		return fechaFinAnexoAsignacion;
	}
	public void setFechaFinAnexoAsignacion(String fechaFinAnexoAsignacion) {
		this.fechaFinAnexoAsignacion = fechaFinAnexoAsignacion;
	}
	public String getFechaInicioAnexoFacturacion() {
		return fechaInicioAnexoFacturacion;
	}
	public void setFechaInicioAnexoFacturacion(String fechaInicioAnexoFacturacion) {
		this.fechaInicioAnexoFacturacion = fechaInicioAnexoFacturacion;
	}
	public String getFechaFinAnexoFacturacion() {
		return fechaFinAnexoFacturacion;
	}
	public void setFechaFinAnexoFacturacion(String fechaFinAnexoFacturacion) {
		this.fechaFinAnexoFacturacion = fechaFinAnexoFacturacion;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getPropuestaEconomica() {
		return propuestaEconomica;
	}
	public void setPropuestaEconomica(String propuestaEconomica) {
		this.propuestaEconomica = propuestaEconomica;
	}
	public String getAnexo() {
		return Anexo;
	}
	public void setAnexo(String anexo) {
		Anexo = anexo;
	}
	
	
	public String getPerfilAsignacion() {
		return perfilAsignacion;
	}

	public void setPerfilAsignacion(String perfilAsignacion) {
		this.perfilAsignacion = perfilAsignacion;
	}

	@Override
	public String toString() {
		return "AsignationRegistryModel [cliente=" + cliente + ", perfil=" + perfil + ", perfilAsignacion="
				+ perfilAsignacion + ", area=" + area + ", manager=" + manager + ", lider=" + lider
				+ ", gerenteComercial=" + gerenteComercial + ", ubicacionconsultor=" + ubicacionconsultor
				+ ", fechaInicioAsignacion=" + fechaInicioAsignacion + ", fechaFinAsignacion=" + fechaFinAsignacion
				+ ", fechaInicioAnexoAsignacion=" + fechaInicioAnexoAsignacion + ", fechaFinAnexoAsignacion="
				+ fechaFinAnexoAsignacion + ", fechaInicioAnexoFacturacion=" + fechaInicioAnexoFacturacion
				+ ", fechaFinAnexoFacturacion=" + fechaFinAnexoFacturacion + ", horario=" + horario
				+ ", propuestaEconomica=" + propuestaEconomica + ", Anexo=" + Anexo + "]";
	}
	
}
