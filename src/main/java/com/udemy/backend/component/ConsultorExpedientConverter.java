package com.udemy.backend.component;

import org.springframework.stereotype.Component;

import com.udemy.backend.entity.ConsultorExpediente;
import com.udemy.backend.entity.Personas;
import com.udemy.backend.model.ConsultorExpedientModel;

@Component("consultorExpedientConverter")
public class ConsultorExpedientConverter {

	
	public ConsultorExpediente convertConsultorExpedientModelToConsultorExpedient(ConsultorExpedientModel consultorExpedientModel, Personas persona){
		ConsultorExpediente consultorExpediente= new ConsultorExpediente();
		consultorExpediente.setFotoInfantil(consultorExpedientModel.isFotoInfantil());
		consultorExpediente.setActaNacimiento(consultorExpedientModel.isActaNacimiento());
		consultorExpediente.setPlaticaInduccion(consultorExpedientModel.isPlaticaInduccion());
		consultorExpediente.setCuentaAfore(consultorExpedientModel.isCuentaAfore());
		consultorExpediente.setIne(consultorExpedientModel.isIne());
		consultorExpediente.setComprobanteDomicilio(consultorExpedientModel.isComprobanteDomicilio());
		consultorExpediente.setCartaRetencionInfonavit(consultorExpedientModel.isCartaRetencionInfonavit());
		consultorExpediente.setCartaAntecedentesNoPenales(consultorExpedientModel.isCartaAntecedentesNoPenales());
		consultorExpediente.setCedulaProfesionalOComprobanteEstudios(consultorExpedientModel.isCedulaProfesionalOComprobanteEstudios());
		consultorExpediente.setNumeroSeguridadSocial(consultorExpedientModel.isNumeroSeguridadSocial());
		consultorExpediente.setCartaRecomendacion(consultorExpedientModel.isCartaRecomendacion());
		consultorExpediente.setCartaDatosBancariosOEstadoDeCuenta(consultorExpedientModel.isCartaDatosBancariosOEstadoDeCuenta());
		consultorExpediente.setFonacot(consultorExpedientModel.isFonacot());
		consultorExpediente.setPesionAlimenticia(consultorExpedientModel.isPesionAlimenticia());
		consultorExpediente.setCurp(consultorExpedientModel.isCurp());
		consultorExpediente.setRfc(consultorExpedientModel.isRfc());
		consultorExpediente.setPersonas(persona);
		return consultorExpediente;
	}
}
