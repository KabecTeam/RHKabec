package com.udemy.backend.service;


import com.udemy.backend.entity.ConsultoresEmpresaKabec;

public interface ConsultoresEmpresaKabecService {

	public abstract ConsultoresEmpresaKabec findByIdConsultoresEmpresaKabec(Integer id);
	
	public abstract Iterable<ConsultoresEmpresaKabec> ListAllConsultores();
	
	public abstract ConsultoresEmpresaKabec addConsultorEmpresaKabec(ConsultoresEmpresaKabec consultoresEmpresaKabec); 
	
	public void deleteConsultorEmpresaKabec(Integer id);
	
}
