package com.udemy.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backend.entity.ConsultoresEmpresaKabec;

@Repository("consultoresEmpresaKabecRepository")
public interface ConsultoresEmpresaKabecRepository extends CrudRepository<ConsultoresEmpresaKabec, Integer>{

}
