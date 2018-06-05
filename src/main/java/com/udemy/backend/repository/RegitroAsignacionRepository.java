package com.udemy.backend.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.udemy.backend.entity.RegistroAsignacion;
@Repository("regitroAsignacionRepository")
public interface RegitroAsignacionRepository extends JpaRepository<RegistroAsignacion, Serializable> {

}
