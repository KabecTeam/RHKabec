package com.udemy.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backend.entity.RefPersonales;

@Repository("refPersonalesRepository")
public interface RefPersonalesRepository extends CrudRepository<RefPersonales, Integer>{

}
