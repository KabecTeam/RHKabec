package com.udemy.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backend.entity.EstadoCivil;

@Repository("eCivilRepository")
public interface ECivilRepository extends CrudRepository<EstadoCivil, Integer>{

}
