package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="seccion")
public class Seccion {
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idSeccion")
	private int idSeccion;
	@Column(name="seccion")
	private String Seccion;
	@Column(name="descripcion")
	private String Descripcion;
	
	
	//Constructor Vacio
	public Seccion() {
		
	}
	
	
	//Constructor SET Y GET

	public Seccion(int idSeccion, String seccion, String descripcion) {
	
		this.idSeccion = idSeccion;
		Seccion = seccion;
		Descripcion = descripcion;
	}
	
	//METODOS SET Y GET

	public int getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}

	public String getSeccion() {
		return Seccion;
	}

	public void setSeccion(String seccion) {
		Seccion = seccion;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	//MOSTRAR DATOS POR TO STRING
	
	@Override
	public String toString() {
		return "Seccion [idSeccion=" + idSeccion + ", Seccion=" + Seccion + ", Descripcion=" + Descripcion + "]";
	}
	
	
	

}






















