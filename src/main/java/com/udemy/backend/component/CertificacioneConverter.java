package com.udemy.backend.component;

import org.springframework.stereotype.Component;

import com.udemy.backend.entity.Certificaciones;
import com.udemy.backend.entity.Personas;
import com.udemy.backend.model.CertificacionesModelo;

@Component("certificacioneConverter")
public class CertificacioneConverter {

	public Certificaciones converterCertificacioneModel2Certificaciones(CertificacionesModelo certificacioneModelo,
			Personas personas){
		Certificaciones certificaciones=new Certificaciones();
		certificaciones.setIdCertificacion(certificacioneModelo.getIdCertificacion());
		certificaciones.setAnioCertificacion(certificacioneModelo.getAnioCertificacion());
		certificaciones.setAnioValidez(certificacioneModelo.getAnioValidez());
		certificaciones.setNombreCertificacion(certificacioneModelo.getNombreCertificacion());		
		certificaciones.setAnioCertificacion2(certificacioneModelo.getAnioCertificacion2());
		certificaciones.setAnioValidez2(certificacioneModelo.getAnioValidez2());
		certificaciones.setNombreCertificacion2(certificacioneModelo.getNombreCertificacion2());
		certificaciones.setPersonas(personas);
		return certificaciones;
	}
	
	public CertificacionesModelo converterCertificaciones2CertificacionesModel(Certificaciones certificaciones,
			Personas personas){
		CertificacionesModelo certificacioneModelo=new CertificacionesModelo();
		certificacioneModelo.setIdCertificacion(certificaciones.getIdCertificacion());
		certificacioneModelo.setAnioCertificacion(certificaciones.getAnioCertificacion());
		certificacioneModelo.setAnioValidez(certificaciones.getAnioValidez());
		certificacioneModelo.setNombreCertificacion(certificaciones.getNombreCertificacion());
		certificacioneModelo.setAnioCertificacion2(certificaciones.getAnioCertificacion2());
		certificacioneModelo.setAnioValidez2(certificaciones.getAnioValidez2());
		certificacioneModelo.setNombreCertificacion2(certificaciones.getNombreCertificacion2());
		certificacioneModelo.setPersonas(personas.toString());
		return certificacioneModelo;
	}
	
	
}
