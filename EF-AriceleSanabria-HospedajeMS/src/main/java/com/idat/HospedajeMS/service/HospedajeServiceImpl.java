package com.idat.HospedajeMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.HospedajeMS.cliente.OpenFeignClient;
import com.idat.HospedajeMS.dto.TuristaDTO;
import com.idat.HospedajeMS.model.TuristaHospedajeFK;
import com.idat.HospedajeMS.model.HospedajeDetalle;
import com.idat.HospedajeMS.model.Hospedaje;
import com.idat.HospedajeMS.repository.HospedajeRepository;
import com.idat.HospedajeMS.repository.DetalleHospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService{
	@Autowired
	private HospedajeRepository repository;
	
	@Autowired
	private DetalleHospedajeRepository detalleRepo;
	
	@Autowired
	private OpenFeignClient client;
	
	@Override
	public void guardar(Hospedaje hospedaje) {
		
		Hospedaje hos = new Hospedaje();
		hos.setIdHospedaje(hospedaje.getIdHospedaje());
		hos.setNombre(hospedaje.getNombre());
		
		repository.save(hos);
	}
	
	@Override
	public void asignarTuristaHospedaje() {
	
		List<TuristaDTO> listado = client.listarTuristas();
		TuristaHospedajeFK fk = null;
		HospedajeDetalle detalle = null;
		
		for (TuristaDTO turistaDTO : listado) {
			fk = new TuristaHospedajeFK();
			fk.setIdTurista(turistaDTO.getCodigo());
			fk.setIdHospedaje(1);
			
			detalle = new HospedajeDetalle();
			detalle.setFk(fk);			
			detalleRepo.save(detalle);
	   }	
	}
}
