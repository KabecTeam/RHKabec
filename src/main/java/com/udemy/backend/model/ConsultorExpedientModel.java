package com.udemy.backend.model;

public class ConsultorExpedientModel {

	private boolean fotoInfantil;
	private boolean actaNacimiento;
	private boolean platicaInduccion;
	private boolean cuentaAfore;
	private boolean ine;
	private boolean comprobanteDomicilio;
	private boolean cartaRetencionInfonavit;
	private boolean cartaAntecedentesNoPenales;
	
	private boolean cedulaProfesionalOComprobanteEstudios;
	private boolean numeroSeguridadSocial;
	private boolean cartaRecomendacion;
	private boolean cartaDatosBancariosOEstadoDeCuenta;
	private boolean fonacot;
	private boolean pesionAlimenticia;
	private boolean curp;
	private boolean rfc;
	
	public ConsultorExpedientModel(){
		
	}
	
	public ConsultorExpedientModel(boolean fotoInfantil, boolean actaNacimiento, boolean platicaInduccion,
			boolean cuentaAfore, boolean ine, boolean comprobanteDomicilio, boolean cartaRetencionInfonavit,
			boolean cartaAntecedentesNoPenales, boolean cedulaProfesionalOComprobanteEstudios,
			boolean numeroSeguridadSocial, boolean cartaRecomendacion, boolean cartaDatosBancariosOEstadoDeCuenta,
			boolean fonacot, boolean pesionAlimenticia, boolean curp, boolean rfc) {
		super();
		this.fotoInfantil = fotoInfantil;
		this.actaNacimiento = actaNacimiento;
		this.platicaInduccion = platicaInduccion;
		this.cuentaAfore = cuentaAfore;
		this.ine = ine;
		this.comprobanteDomicilio = comprobanteDomicilio;
		this.cartaRetencionInfonavit = cartaRetencionInfonavit;
		this.cartaAntecedentesNoPenales = cartaAntecedentesNoPenales;
		this.cedulaProfesionalOComprobanteEstudios = cedulaProfesionalOComprobanteEstudios;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.cartaRecomendacion = cartaRecomendacion;
		this.cartaDatosBancariosOEstadoDeCuenta = cartaDatosBancariosOEstadoDeCuenta;
		this.fonacot = fonacot;
		this.pesionAlimenticia = pesionAlimenticia;
		this.curp = curp;
		this.rfc = rfc;
	}
	public boolean isFotoInfantil() {
		return fotoInfantil;
	}

	public void setFotoInfantil(boolean fotoInfantil) {
		this.fotoInfantil = fotoInfantil;
	}

	public boolean isActaNacimiento() {
		return actaNacimiento;
	}

	public void setActaNacimiento(boolean actaNacimiento) {
		this.actaNacimiento = actaNacimiento;
	}

	public boolean isPlaticaInduccion() {
		return platicaInduccion;
	}

	public void setPlaticaInduccion(boolean platicaInduccion) {
		this.platicaInduccion = platicaInduccion;
	}

	public boolean isCuentaAfore() {
		return cuentaAfore;
	}

	public void setCuentaAfore(boolean cuentaAfore) {
		this.cuentaAfore = cuentaAfore;
	}

	public boolean isIne() {
		return ine;
	}

	public void setIne(boolean ine) {
		this.ine = ine;
	}

	public boolean isComprobanteDomicilio() {
		return comprobanteDomicilio;
	}

	public void setComprobanteDomicilio(boolean comprobanteDomicilio) {
		this.comprobanteDomicilio = comprobanteDomicilio;
	}

	public boolean isCartaRetencionInfonavit() {
		return cartaRetencionInfonavit;
	}

	public void setCartaRetencionInfonavit(boolean cartaRetencionInfonavit) {
		this.cartaRetencionInfonavit = cartaRetencionInfonavit;
	}

	public boolean isCartaAntecedentesNoPenales() {
		return cartaAntecedentesNoPenales;
	}

	public void setCartaAntecedentesNoPenales(boolean cartaAntecedentesNoPenales) {
		this.cartaAntecedentesNoPenales = cartaAntecedentesNoPenales;
	}

	public boolean isCedulaProfesionalOComprobanteEstudios() {
		return cedulaProfesionalOComprobanteEstudios;
	}

	public void setCedulaProfesionalOComprobanteEstudios(boolean cedulaProfesionalOComprobanteEstudios) {
		this.cedulaProfesionalOComprobanteEstudios = cedulaProfesionalOComprobanteEstudios;
	}

	public boolean isNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(boolean numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public boolean isCartaRecomendacion() {
		return cartaRecomendacion;
	}

	public void setCartaRecomendacion(boolean cartaRecomendacion) {
		this.cartaRecomendacion = cartaRecomendacion;
	}

	public boolean isCartaDatosBancariosOEstadoDeCuenta() {
		return cartaDatosBancariosOEstadoDeCuenta;
	}

	public void setCartaDatosBancariosOEstadoDeCuenta(boolean cartaDatosBancariosOEstadoDeCuenta) {
		this.cartaDatosBancariosOEstadoDeCuenta = cartaDatosBancariosOEstadoDeCuenta;
	}

	public boolean isFonacot() {
		return fonacot;
	}

	public void setFonacot(boolean fonacot) {
		this.fonacot = fonacot;
	}

	public boolean isPesionAlimenticia() {
		return pesionAlimenticia;
	}

	public void setPesionAlimenticia(boolean pesionAlimenticia) {
		this.pesionAlimenticia = pesionAlimenticia;
	}

	public boolean isCurp() {
		return curp;
	}

	public void setCurp(boolean curp) {
		this.curp = curp;
	}

	public boolean isRfc() {
		return rfc;
	}

	public void setRfc(boolean rfc) {
		this.rfc = rfc;
	}
	
	@Override
	public String toString() {
		return "ConsultorExpedientModel [fotoInfantil=" + fotoInfantil + ", actaNacimiento=" + actaNacimiento
				+ ", platicaInduccion=" + platicaInduccion + ", cuentaAfore=" + cuentaAfore + ", ine=" + ine
				+ ", comprobanteDomicilio=" + comprobanteDomicilio + ", cartaRetencionInfonavit="
				+ cartaRetencionInfonavit + ", cartaAntecedentesNoPenales=" + cartaAntecedentesNoPenales
				+ ", cedulaProfesionalOComprobanteEstudios=" + cedulaProfesionalOComprobanteEstudios
				+ ", numeroSeguridadSocial=" + numeroSeguridadSocial + ", cartaRecomendacion=" + cartaRecomendacion
				+ ", cartaDatosBancariosOEstadoDeCuenta=" + cartaDatosBancariosOEstadoDeCuenta + ", fonacot=" + fonacot
				+ ", pesionAlimenticia=" + pesionAlimenticia + ", curp=" + curp + ", rfc=" + rfc + "]";
	}
	
}

