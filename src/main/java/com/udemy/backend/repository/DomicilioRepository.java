package com.udemy.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backend.entity.Domicilio;


@Repository("domicilioRepository")
public interface DomicilioRepository extends CrudRepository<Domicilio, Integer>{

}
