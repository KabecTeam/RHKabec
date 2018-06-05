package com.udemy.backend.service;

import com.udemy.backend.entity.ContratoNomina;
import com.udemy.backend.entity.EmpresaComplemento;
import com.udemy.backend.entity.Personas;
import com.udemy.backend.entity.RegistroContrato;
import com.udemy.backend.model.RegistroContratoModel;

public interface ContratosService {

	public abstract Iterable<ContratoNomina> listAllContrato();
	
	public abstract Iterable<EmpresaComplemento> listAllComplemento();
	
	//public abstract RegistroContratoModel addRegistroContrato(RegistroContratoModel registromodel,Personas personas);

	public abstract RegistroContratoModel addRegistroContrato(RegistroContratoModel registromodel,Personas personas
			,ContratoNomina contratonomina,EmpresaComplemento empresaComplemeto);

	
}
