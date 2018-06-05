package com.udemy.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backend.entity.RegistroContrato;

@Repository("registroContratoRepository")
public interface RegistroContratoRepository extends CrudRepository<RegistroContrato, Integer>{

}
