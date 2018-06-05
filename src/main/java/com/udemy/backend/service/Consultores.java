package com.udemy.backend.service;

import java.util.List;

import com.udemy.backend.entity.Area;
import com.udemy.backend.entity.Bancos;
import com.udemy.backend.entity.Cliente;
import com.udemy.backend.entity.Domicilio;
import com.udemy.backend.entity.Escolaridad;
import com.udemy.backend.entity.EstadoCivil;
import com.udemy.backend.entity.Genero;
import com.udemy.backend.entity.GerenteComercial;
import com.udemy.backend.entity.GerentesArea;
import com.udemy.backend.entity.LideresConsultor;
import com.udemy.backend.entity.Perfil;
import com.udemy.backend.entity.Personas;
import com.udemy.backend.entity.RefPersonales;
import com.udemy.backend.entity.RegistroAsignacion;
import com.udemy.backend.model.CertificacionesModelo;
import com.udemy.backend.model.DatosFamiliaresModel;

public interface Consultores {

public abstract Personas findByIdPersonas(Integer id);

public abstract Iterable<Personas> ListAllPersonas();
	
//public abstract PersonaModel addPersonas(PersonaModel personasModel);

public abstract Personas addPersonas(Personas personas);

public void deletePersonas(Integer id);

public abstract Genero findByIdGenero(Integer id); 

public abstract Iterable<Genero> ListAllGenero(); 

public abstract EstadoCivil findByIdEstadoC(Integer name);

public abstract Iterable<EstadoCivil> LisAllECivil();

public abstract Iterable<Bancos> ListAllBancos();

public abstract Escolaridad addEscolariodad(Escolaridad escolaridad);

public abstract Domicilio addDomicilio(Domicilio domicilio);

public abstract RefPersonales addReferenciaPersona(RefPersonales refPersonales);

public abstract List<Cliente> listAllClients();

public abstract List<Area> listAllAreas();

public abstract List<Perfil> listAllProfiles();

public abstract List<GerentesArea> listAllAreasGerency();

public abstract List<LideresConsultor> listAllLeadersConsultor();

public abstract List<GerenteComercial> listAllComercialGerency();
public abstract Cliente findClient(int idCliente);

public abstract Area findArea(int idArea);

public abstract LideresConsultor findLeader(int idLeader);

public abstract GerentesArea findAreaGerency(int idGerency);

public abstract Perfil findProfile(int idProfile);

public abstract GerenteComercial findComercialGerency(int idComercialGerency);

public abstract RegistroAsignacion addAsignationRegistry(RegistroAsignacion registroAsignacion);

public abstract DatosFamiliaresModel addDatos(DatosFamiliaresModel datosFamiliaresmodel,Personas personas);

public abstract CertificacionesModelo addCertificaciones(CertificacionesModelo certificacionesModelo,Personas personas);

}
