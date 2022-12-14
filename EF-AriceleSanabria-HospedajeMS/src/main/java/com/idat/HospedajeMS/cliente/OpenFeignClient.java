package com.idat.HospedajeMS.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.HospedajeMS.dto.TuristaDTO;

@FeignClient(name = "turista-microservicio", url="localhost:8080" )
public interface OpenFeignClient {
	@GetMapping("/api/turista/v1/listar") 
	public List<TuristaDTO> listarTuristas();
}
