package com.udemy.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backend.entity.ConsultorExpediente;
import com.udemy.backend.repository.ConsultorExpedienteRepository;
import com.udemy.backend.service.ConsultoresExpedienteService;

@Service("consultoresExpedienteServiceImpl")
public class ConsultoresExpedienteServiceImpl implements ConsultoresExpedienteService {

	 @Autowired
	 @Qualifier("consultorExpedienteRepository")
	 private ConsultorExpedienteRepository consultorExpedienteRepository;	
	
	@Override
	public ConsultorExpediente addNewExpedient(ConsultorExpediente consultorExpediente) {
		
		return consultorExpedienteRepository.save(consultorExpediente);
	}

}
