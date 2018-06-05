package com.udemy.backend.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backend.entity.Genero;

@Repository("generoRepository")
public interface GeneroRepository extends CrudRepository<Genero, Integer>{

}
