package com.idat.HospedajeMS.service;

import com.idat.HospedajeMS.model.Hospedaje;

public interface HospedajeService {
	void guardar(Hospedaje hospedaje);
	void asignarTuristaHospedaje();
}
