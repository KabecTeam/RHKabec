package com.udemy.backend.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("consultorExpedienteRepository")
public interface ConsultorExpedienteRepository extends JpaRepository<com.udemy.backend.entity.ConsultorExpediente, Serializable> {

}
