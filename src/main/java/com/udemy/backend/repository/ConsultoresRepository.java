package com.udemy.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.udemy.backend.entity.Personas;

@Repository("consultoresRepository")
public interface ConsultoresRepository extends CrudRepository<Personas, Integer>{

	//public abstract EstadoCivil finByidEC(int id); 
	
}
