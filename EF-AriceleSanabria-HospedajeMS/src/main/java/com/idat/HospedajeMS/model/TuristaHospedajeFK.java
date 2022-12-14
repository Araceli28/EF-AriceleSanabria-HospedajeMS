package com.idat.HospedajeMS.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TuristaHospedajeFK implements Serializable{
 
	private static final long serialVersionUID = -5016506081662693627L;
	
	@Column(name = "id_hospedaje", nullable =  false)
	private Integer idHospedaje;
	
	@Column(name = "id_turista", nullable =  false)
    private Integer idTurista;

	public Integer getIdHospedaje() {
		return idHospedaje;
	}

	public void setIdHospedaje(Integer idHospedaje) {
		this.idHospedaje = idHospedaje;
	}

	public Integer getIdTurista() {
		return idTurista;
	}

	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}
	
}
