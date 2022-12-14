package com.idat.HospedajeMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.HospedajeMS.model.HospedajeDetalle;

@Repository
public interface DetalleHospedajeRepository extends JpaRepository<HospedajeDetalle, Integer>{

}
