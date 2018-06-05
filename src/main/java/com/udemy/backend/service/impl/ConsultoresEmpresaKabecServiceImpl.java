package com.udemy.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backend.entity.ConsultoresEmpresaKabec;
import com.udemy.backend.repository.ConsultoresEmpresaKabecRepository;
import com.udemy.backend.service.ConsultoresEmpresaKabecService;

@Service("consultoresEmpresaKabecServiceImpl")
public class ConsultoresEmpresaKabecServiceImpl implements ConsultoresEmpresaKabecService{

	@Autowired
	@Qualifier("consultoresEmpresaKabecRepository")
	private ConsultoresEmpresaKabecRepository consultoresEmpresaKabecRepository;
	
	
	@Override
	public ConsultoresEmpresaKabec findByIdConsultoresEmpresaKabec(Integer id) {
		return consultoresEmpresaKabecRepository.findOne(id);
	}

	@Override
	public ConsultoresEmpresaKabec addConsultorEmpresaKabec(ConsultoresEmpresaKabec consultoresEmpresaKabec) {
		return consultoresEmpresaKabecRepository.save(consultoresEmpresaKabec);
	}

	@Override
	public void deleteConsultorEmpresaKabec(Integer id) {
    consultoresEmpresaKabecRepository.delete(id);		
	}

	@Override
	public Iterable<ConsultoresEmpresaKabec> ListAllConsultores() {
		return consultoresEmpresaKabecRepository.findAll();
	}

}
