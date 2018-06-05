package com.udemy.backend.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.udemy.backend.entity.GerentesArea;

@Repository("gerentesAreaRepository")
public interface GerentesAreaRepository extends JpaRepository<GerentesArea, Serializable> {

}
