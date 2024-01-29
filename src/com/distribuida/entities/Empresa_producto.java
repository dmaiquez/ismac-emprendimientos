package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "empresa_producto")
public class Empresa_producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idempresa_producto")
	private int idempresa_producto;
	@Column(name = "producto")
	private String producto;
	@Column(name = "descripcion")
	private String descripcion;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "idEmpresa")
	private Empresa empresa; 
	
	public Empresa_producto() {}
	
	public Empresa_producto(int idempresa_producto, String producto, String descripcion, Empresa empresa) {
		this.idempresa_producto = idempresa_producto;
		this.producto = producto;
		this.descripcion = descripcion;
		this.empresa = empresa;
	}

	public int getIdempresa_producto() {
		return idempresa_producto;
	}

	public void setIdempresa_producto(int idempresa_producto) {
		this.idempresa_producto = idempresa_producto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}




	@Override
	public String toString() {
		return "Empresa_producto [idempresa_producto=" + idempresa_producto + ", producto=" + producto
				+ ", descripcion=" + descripcion + ", empresa=" + empresa + ", productos=" + "]";
	}
	
	
	
	
}
