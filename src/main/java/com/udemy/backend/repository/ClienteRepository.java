package com.udemy.backend.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backend.entity.Cliente;
@Repository("clienteRepository")
public interface ClienteRepository extends JpaRepository<Cliente, Serializable>{

	
}
