package com.idat.HospedajeMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.HospedajeMS.model.Hospedaje;
import com.idat.HospedajeMS.service.HospedajeService;

@Controller
@RequestMapping("/api/hospedaje/v1")
public class HospedajeController {
	@Autowired
	private HospedajeService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Hospedaje hospedaje) {
		service.guardar(hospedaje);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignar() {
		service.asignarTuristaHospedaje();
	}
}
