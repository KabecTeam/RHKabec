package com.udemy.backend.component;

import org.springframework.stereotype.Component;

import com.udemy.backend.entity.DatosFamiliares;
import com.udemy.backend.entity.Personas;
import com.udemy.backend.model.DatosFamiliaresModel;

@Component("datosFamiliaresConverter")
public class DatosFamiliaresConverter {

	
	public DatosFamiliares converterDatosFamiliaresModel2DatosFamiliares(DatosFamiliaresModel datosFamiliaresModel,Personas personas){
     DatosFamiliares datosFamiliares=new DatosFamiliares();
     
     datosFamiliares.setIdDatosFam(datosFamiliaresModel.getIdDatosFam());
     datosFamiliares.setEdad(datosFamiliaresModel.getEdad());
	 datosFamiliares.setNomFamiliar(datosFamiliaresModel.getNomFamiliar());
	 datosFamiliares.setOcupacion(datosFamiliaresModel.getOcupacion());
	 datosFamiliares.setParentesco(datosFamiliaresModel.getParentesco());
	 datosFamiliares.setEdad2(datosFamiliaresModel.getEdad2());
	 datosFamiliares.setNomFamiliar2(datosFamiliaresModel.getNomFamiliar2());
	 datosFamiliares.setOcupacion2(datosFamiliaresModel.getOcupacion2());
	 datosFamiliares.setParentesco2(datosFamiliaresModel.getParentesco2());
	 datosFamiliares.setEdad3(datosFamiliaresModel.getEdad3());
	 datosFamiliares.setNomFamiliar3(datosFamiliaresModel.getNomFamiliar3());
	 datosFamiliares.setOcupacion3(datosFamiliaresModel.getOcupacion3());
	 datosFamiliares.setParentesco3(datosFamiliaresModel.getParentesco3());
	 datosFamiliares.setEdad4(datosFamiliaresModel.getEdad4());
	 datosFamiliares.setNomFamiliar4(datosFamiliaresModel.getNomFamiliar4());
	 datosFamiliares.setOcupacion4(datosFamiliaresModel.getOcupacion4());
	 datosFamiliares.setParentesco4(datosFamiliaresModel.getParentesco4());
	 datosFamiliares.setPersonas(personas);
	 
     return datosFamiliares;	
	}

     public DatosFamiliaresModel converterDatosFamiliares2DatosFamiliaresModel(DatosFamiliares datosFamiliares,Personas personas){
     DatosFamiliaresModel datosFamiliaresModel=new DatosFamiliaresModel();	 
     datosFamiliaresModel.setIdDatosFam(datosFamiliares.getIdDatosFam());
     datosFamiliaresModel.setEdad(datosFamiliares.getEdad());
     datosFamiliaresModel.setNomFamiliar(datosFamiliares.getNomFamiliar());
     datosFamiliaresModel.setOcupacion(datosFamiliares.getOcupacion());
     datosFamiliaresModel.setParentesco(datosFamiliares.getParentesco());
     datosFamiliaresModel.setEdad2(datosFamiliares.getEdad2());
     datosFamiliaresModel.setNomFamiliar2(datosFamiliares.getNomFamiliar2());
     datosFamiliaresModel.setOcupacion2(datosFamiliares.getOcupacion2());
     datosFamiliaresModel.setParentesco2(datosFamiliares.getParentesco2());
     datosFamiliaresModel.setEdad3(datosFamiliares.getEdad3());
     datosFamiliaresModel.setNomFamiliar3(datosFamiliares.getNomFamiliar3());
     datosFamiliaresModel.setOcupacion3(datosFamiliares.getOcupacion3());
     datosFamiliaresModel.setParentesco3(datosFamiliares.getParentesco3());
     datosFamiliaresModel.setEdad4(datosFamiliares.getEdad4());
     datosFamiliaresModel.setNomFamiliar4(datosFamiliares.getNomFamiliar4());
     datosFamiliaresModel.setOcupacion4(datosFamiliares.getOcupacion4());
     datosFamiliaresModel.setParentesco4(datosFamiliares.getParentesco4());
     datosFamiliaresModel.setPersonas(personas.toString());
    	 return datosFamiliaresModel;
     }
	
}
