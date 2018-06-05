package com.udemy.backend.component;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.udemy.backend.entity.Personas;
import com.udemy.backend.entity.RegistroAsignacion;
import com.udemy.backend.model.AsignationRegistryModel;
import com.udemy.backend.service.Consultores;

@Component("registryAsignationConverter")
public class RegistryAsignationConverter {
	
	@Autowired
	@Qualifier("ConsultoresServiceImpl")
	private Consultores consultoresService;
	
	
	public RegistroAsignacion asignationRegistryModelToRegistroAsignacion(AsignationRegistryModel asignationRegistryModel,Personas persona){
		RegistroAsignacion registroAsignacion= new RegistroAsignacion();
		try{
		registroAsignacion.setCliente(consultoresService.findClient(Integer.parseInt(asignationRegistryModel.getCliente())));
		registroAsignacion.setPerfil(consultoresService.findProfile(Integer.parseInt(asignationRegistryModel.getPerfil())));
		registroAsignacion.setPerfilAsignacion(consultoresService.findProfile(Integer.parseInt(asignationRegistryModel.getPerfilAsignacion())));
		registroAsignacion.setArea(consultoresService.findArea(Integer.parseInt(asignationRegistryModel.getArea())));
		registroAsignacion.setGerentesArea(consultoresService.findAreaGerency(Integer.parseInt(asignationRegistryModel.getManager())));
		registroAsignacion.setLider(consultoresService.findLeader(Integer.parseInt(asignationRegistryModel.getLider())));
		registroAsignacion.setGerenteComercial(consultoresService.findComercialGerency(Integer.parseInt(asignationRegistryModel.getGerenteComercial())));
		registroAsignacion.setPersona(persona);
		registroAsignacion.setUbicacionConsultor(asignationRegistryModel.getUbicacionconsultor());
		registroAsignacion.setFechaInicioAsignacion(dateConverter(asignationRegistryModel.getFechaInicioAsignacion()));
		registroAsignacion.setFechaFinAsignacion(dateConverter(asignationRegistryModel.getFechaFinAsignacion()));
		registroAsignacion.setFechaInicioAnexoAsignacion(dateConverter(asignationRegistryModel.getFechaInicioAnexoAsignacion()));
		registroAsignacion.setFechaFinAnexoAsignacion(dateConverter(asignationRegistryModel.getFechaFinAnexoAsignacion()));
		registroAsignacion.setFechaInicioAnexoFacturacion(dateConverter(asignationRegistryModel.getFechaInicioAnexoFacturacion()));
		registroAsignacion.setFechaFinAnexoFacturacion(dateConverter(asignationRegistryModel.getFechaFinAnexoFacturacion()));
		registroAsignacion.setHorario(asignationRegistryModel.getHorario());
		registroAsignacion.setPropuestaEconomica(asignationRegistryModel.getPropuestaEconomica());
		registroAsignacion.setAnexo(asignationRegistryModel.getAnexo());
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return registroAsignacion;
	}
	
	
	public AsignationRegistryModel RegistroAsignacionToAsignationRegistryModel(RegistroAsignacion registroAsignacion){
		AsignationRegistryModel asignationRegistryModel= new AsignationRegistryModel();
		asignationRegistryModel.setCliente(registroAsignacion.getCliente().getNombreCliente());
		asignationRegistryModel.setPerfil(registroAsignacion.getPerfil().getTipoPerfil());
		asignationRegistryModel.setPerfilAsignacion(registroAsignacion.getPerfilAsignacion().getTipoPerfil());
		asignationRegistryModel.setArea(registroAsignacion.getArea().getNombreArea());
		asignationRegistryModel.setManager(registroAsignacion.getGerentesArea().getNombre()+ " "+registroAsignacion.getGerentesArea().getApellidoPaterno()+ " "+registroAsignacion.getGerentesArea().getApellidoMaterno());
		asignationRegistryModel.setLider(registroAsignacion.getLider().getNombre()+" "+registroAsignacion.getLider().getApellidoPaterno()+ " "+registroAsignacion.getLider().getApellidoMaterno());
		asignationRegistryModel.setGerenteComercial(registroAsignacion.getGerenteComercial().getNombre()+ " " +registroAsignacion.getGerenteComercial().getApellidoPaterno() +" "+registroAsignacion.getGerenteComercial().getApellidoMaterno());
		asignationRegistryModel.setUbicacionconsultor(registroAsignacion.getUbicacionConsultor());
		asignationRegistryModel.setFechaInicioAsignacion(registroAsignacion.getFechaInicioAsignacion().toString());
		asignationRegistryModel.setFechaFinAsignacion(registroAsignacion.getFechaFinAsignacion().toString());
		asignationRegistryModel.setFechaInicioAnexoAsignacion(registroAsignacion.getFechaInicioAnexoAsignacion().toString());
		asignationRegistryModel.setFechaFinAnexoAsignacion(registroAsignacion.getFechaFinAnexoAsignacion().toString());
		asignationRegistryModel.setFechaInicioAnexoFacturacion(registroAsignacion.getFechaInicioAnexoFacturacion().toString());
		asignationRegistryModel.setFechaFinAnexoFacturacion(registroAsignacion.getFechaFinAnexoFacturacion().toString());
		asignationRegistryModel.setHorario(registroAsignacion.getHorario());
		asignationRegistryModel.setPropuestaEconomica(registroAsignacion.getPropuestaEconomica());
		asignationRegistryModel.setAnexo(registroAsignacion.getAnexo());
		
		return asignationRegistryModel;
	}
	
	
	private Date dateConverter(String fecha){
		Date parsedDate= null;
		try{
			
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		parsedDate =  dateFormat.parse(fecha);
		}catch(Exception e){
			e.printStackTrace();
		}
		return parsedDate;
	}

}
