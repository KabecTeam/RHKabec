package com.udemy.backend.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backend.entity.DatosFamiliares;

@Repository("datosFamiliaresRepository")
public interface DatosFamiliaresRepository extends JpaRepository<DatosFamiliares, Serializable>{

}
