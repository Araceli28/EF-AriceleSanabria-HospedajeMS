package com.idat.HospedajeMS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "hospedaje")
@Getter
@Setter
public class Hospedaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHospedaje;
	private String nombre;
}
