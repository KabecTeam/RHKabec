package com.udemy.backend.component;

import org.springframework.stereotype.Component;

import com.udemy.backend.entity.ContratoNomina;
import com.udemy.backend.entity.EmpresaComplemento;
import com.udemy.backend.entity.Personas;
import com.udemy.backend.entity.RegistroContrato;
import com.udemy.backend.model.RegistroContratoModel;


@Component("registroContratoConverter")
public class RegistroContratoConverter {

	public RegistroContrato RegistroContratoModel2Contrato(RegistroContratoModel registromodel, 
			Personas persona,ContratoNomina contratonomina,EmpresaComplemento empresaComplemeto){
		RegistroContrato registrocontrato=new RegistroContrato();
		registrocontrato.setIdRegistroCont(registromodel.getIdRegistroCont());
		registrocontrato.setNumRequerimiento(registromodel.getNumRequerimiento());
		registrocontrato.setTarifa(registromodel.getTarifa());
		registrocontrato.setNumPoliza(registromodel.getNumPoliza());
		registrocontrato.setEstConsultor(registromodel.getEstConsultor());
		registrocontrato.setSueldo(registromodel.getSueldo());
		registrocontrato.setFechAltImss(registromodel.getFechAltImss());
		registrocontrato.setRecontratacion(registromodel.getRecontratacion());
		registrocontrato.setContratoNomina(contratonomina);
		registrocontrato.setFechininomin(registromodel.getFechininomin());
		registrocontrato.setFechfinnomin(registromodel.getFechfinnomin());
		registrocontrato.setEmpresaComplemento(empresaComplemeto);
		registrocontrato.setFechinicomp(registromodel.getFechinicomp());
		registrocontrato.setFechfincomp(registromodel.getFechfincomp());
		registrocontrato.setNumConsultor(registromodel.getNumConsultor());
		registrocontrato.setPersonas(persona);
        return registrocontrato;
	}
	
	public RegistroContratoModel RegistroContrato2ContratoModel(RegistroContrato registrocontrato,
			Personas persona,ContratoNomina contratonomina,EmpresaComplemento empresaComplemeto){
	   RegistroContratoModel registromodel=new RegistroContratoModel();
	    registromodel.setIdRegistroCont(registrocontrato.getIdRegistroCont());
	    registromodel.setNumRequerimiento(registrocontrato.getNumRequerimiento());
	    registromodel.setTarifa(registrocontrato.getTarifa());
		registromodel.setNumPoliza(registrocontrato.getNumPoliza());
		registromodel.setEstConsultor(registrocontrato.getEstConsultor());
		registromodel.setSueldo(registrocontrato.getSueldo());
		registromodel.setFechAltImss(registrocontrato.getFechAltImss());
		registromodel.setRecontratacion(registrocontrato.getRecontratacion());
		registromodel.setContratoNomina(contratonomina.toString());
		registromodel.setFechininomin(registrocontrato.getFechininomin());
		registromodel.setFechfinnomin(registrocontrato.getFechfinnomin());
		registromodel.setEmpresaComplemento(empresaComplemeto.toString());
		registromodel.setFechinicomp(registrocontrato.getFechinicomp());
		registromodel.setFechfincomp(registrocontrato.getFechfincomp());
		registromodel.setNumConsultor(registrocontrato.getNumConsultor());
		registromodel.setPersonas(persona.toString());
		return registromodel;
	}
	
	
}
