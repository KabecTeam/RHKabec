package com.udemy.backend.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.udemy.backend.entity.LideresConsultor;

@Repository("lideresConsultoresRespository")
public interface LideresConsultoresRespository extends JpaRepository<LideresConsultor, Serializable> {

}
