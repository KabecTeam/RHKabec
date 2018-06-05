package com.udemy.backend.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.udemy.backend.entity.GerenteComercial;

@Repository("gerenteComercialRepository")
public interface GerenteComercialRepository extends JpaRepository<GerenteComercial, Serializable> {

}
