package com.udemy.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backend.entity.Bancos;

@Repository("bancoRepository")
public interface BancoRepository extends CrudRepository<Bancos, Integer>{

}
