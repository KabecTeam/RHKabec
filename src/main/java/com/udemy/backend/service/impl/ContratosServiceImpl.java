package com.udemy.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backend.component.RegistroContratoConverter;
import com.udemy.backend.entity.ContratoNomina;
import com.udemy.backend.entity.EmpresaComplemento;
import com.udemy.backend.entity.Personas;
import com.udemy.backend.entity.RegistroContrato;
import com.udemy.backend.model.RegistroContratoModel;
import com.udemy.backend.repository.ContratoNominaRepository;
import com.udemy.backend.repository.EmpresaComplementoRepository;
import com.udemy.backend.repository.RegistroContratoRepository;
import com.udemy.backend.service.ContratosService;

@Service("contratosServiceImpl")
public class ContratosServiceImpl implements ContratosService{

	@Autowired
	@Qualifier("contratoNominaRepository")
	private ContratoNominaRepository contratoNominaRepository;
	
	@Autowired
	@Qualifier("empresaComplementoRepository")
	private EmpresaComplementoRepository empresaComplementoRepository;
	
	@Autowired
	@Qualifier("registroContratoRepository")
	private RegistroContratoRepository registroContratoRepository;
	
	@Autowired
	@Qualifier("registroContratoConverter")
	private RegistroContratoConverter registroContratoConverter; 
	
	@Override
	public Iterable<ContratoNomina> listAllContrato() {
		return contratoNominaRepository.findAll();
	}

	@Override
	public Iterable<EmpresaComplemento> listAllComplemento() {
		return empresaComplementoRepository.findAll();
	}

	@Override
	public RegistroContratoModel addRegistroContrato(RegistroContratoModel registromodel, Personas personas,ContratoNomina contratonomina,EmpresaComplemento empresaComplemeto) {
		RegistroContrato registroContrato=registroContratoRepository.save(registroContratoConverter.RegistroContratoModel2Contrato(registromodel, personas,contratonomina,empresaComplemeto));
	  return registroContratoConverter.RegistroContrato2ContratoModel(registroContrato, personas, contratonomina, empresaComplemeto);
	//return registroContratoRepository.save(registroContratoConverter.RegistroContratoModel2Contrato(registromodel, personas,contratonomina,empresaComplemeto));
	}
	/*
	@Override
	public RegistroContratoModel addRegistroContrato(RegistroContratoModel registromodel,Personas personas) {
	   RegistroContrato registro=registroContratoRepository.save(registroContratoConverter.RegistroContratoModel2Contrato(registromodel,personas));
		return registroContratoConverter.RegistroContrato2ContratoModel(registro, personas);
	}
	*/
	
}
