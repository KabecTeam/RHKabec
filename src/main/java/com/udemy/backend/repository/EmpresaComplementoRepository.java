package com.udemy.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backend.entity.EmpresaComplemento;

@Repository("empresaComplementoRepository")
public interface EmpresaComplementoRepository extends CrudRepository<EmpresaComplemento, Integer>{

}
