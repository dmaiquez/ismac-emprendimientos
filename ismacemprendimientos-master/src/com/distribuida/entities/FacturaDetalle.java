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
@Table(name = "factura_detalles")
public class FacturaDetalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_factura")
	private int idFacturaDetalle;
	@Column(name = "Producto")
	private String producto;
	@Column(name = "Cantidad")
	private int cantidad;
	@Column(name = "preciounidad")
	private double preUnidad;
	@Column(name = "subtotal")
	private double subTotal;
	@Column(name = "descuento1")
	private double descuento1;
	@Column(name = "descuento2")
	private double descuento2;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="fk_idFactura")
	private Factura factura;
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="fk_idEmpresaProducto")
	private EmpresaProducto empresaProducto;
	
	public FacturaDetalle () {}
	
	public FacturaDetalle(int idFacturaDetalle, String producto, int cantidad, double preUnidad, double subTotal,
			double descuento1, double descuento2, Factura factura, EmpresaProducto empresaProducto) {
		this.idFacturaDetalle = idFacturaDetalle;
		this.producto = producto;
		this.cantidad = cantidad;
		this.preUnidad = preUnidad;
		this.subTotal = subTotal;
		this.descuento1 = descuento1;
		this.descuento2 = descuento2;
		this.factura = factura;
		this.empresaProducto = empresaProducto;
	}

	public FacturaDetalle (Factura factura) {
		this.factura = factura;
	}
	
	public FacturaDetalle (EmpresaProducto empresaProducto) {
		this.empresaProducto = empresaProducto;
	}

	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}

	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPreUnidad() {
		return preUnidad;
	}

	public void setPreUnidad(double preUnidad) {
		this.preUnidad = preUnidad;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getDescuento1() {
		return descuento1;
	}

	public void setDescuento1(double descuento1) {
		this.descuento1 = descuento1;
	}

	public double getDescuento2() {
		return descuento2;
	}

	public void setDescuento2(double descuento2) {
		this.descuento2 = descuento2;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public EmpresaProducto getEmpresaProducto() {
		return empresaProducto;
	}

	public void setEmpresaProducto(EmpresaProducto empresaProducto) {
		this.empresaProducto = empresaProducto;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", producto=" + producto + ", cantidad="
				+ cantidad + ", preUnidad=" + preUnidad + ", subTotal=" + subTotal + ", descuento1=" + descuento1
				+ ", descuento2=" + descuento2 + ", factura=" + factura + "]";
	}

}
