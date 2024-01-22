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
@Table(name = "sucursales")
public class Sucursales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSucursales")
	private int idSucursales;
	@Column(name = "sucursal")
	private String sucursal; 
	@Column(name = "descripcion")
	private String descripcion;
	
	public Sucursales() {}
	
	public Sucursales(int idSucursales, String sucursal, String descripcion) {
		this.idSucursales = idSucursales;
		this.sucursal = sucursal;
		this.descripcion = descripcion;
	}
	public int getIdSucursales() {
		return idSucursales;
	}
	public void setIdSucursales(int idSucursales) {
		this.idSucursales = idSucursales;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Sucursales [idSucursales=" + idSucursales + ", sucursal=" + sucursal + ", descripcion=" + descripcion
				+ "]";
	}
	
	
}
