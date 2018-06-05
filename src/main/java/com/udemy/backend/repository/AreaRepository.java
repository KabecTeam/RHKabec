package com.udemy.backend.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backend.entity.Area;

@Repository("areaRepository")
public interface AreaRepository extends JpaRepository<Area, Serializable> {

}
