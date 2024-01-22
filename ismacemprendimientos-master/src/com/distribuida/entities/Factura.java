package com.distribuida.entities;

import java.util.Date;

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
@Table(name = "facturacion")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFactura")
	private int idFactura;
	@Column(name = "NumeroFactura")
	private String numFactura;
	@Column(name = "Fechafactura")
	private Date fechaFactura;
	@Column(name = "totalNeto")
	private double totalNeto;
	@Column(name = "Iva")
	private double iva;
	@Column(name = "total")
	private double total;
	
	public Factura() {}
	
	public Factura(int idFactura, String numFactura, Date fechaFactura, double totalNeto, double iva, double total,
			Cliente cliente, Pedido pedido, FormaPago formaPago) {
		this.idFactura = idFactura;
		this.numFactura = numFactura;
		this.fechaFactura = fechaFactura;
		this.totalNeto = totalNeto;
		this.iva = iva;
		this.total = total;
		this.cliente = cliente;
		this.pedido = pedido;
		this.formaPago = formaPago;
	}

	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="fk_idCliente")
	private Cliente cliente;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="fk_idPedido")
	private Pedido pedido;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="fk_idFormaPago")
	private FormaPago formaPago;
	
	public Factura (Cliente cliente){
		this.cliente = cliente;
	}
	public Factura (Pedido pedido) {
		this.pedido = pedido; 
	}
	public Factura (FormaPago formaPago) {
		this.formaPago = formaPago;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public double getTotalNeto() {
		return totalNeto;
	}

	public void setTotalNeto(double totalNeto) {
		this.totalNeto = totalNeto;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public FormaPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numFactura=" + numFactura + ", fechaFactura=" + fechaFactura
				+ ", totalNeto=" + totalNeto + ", iva=" + iva + ", total=" + total + "]";
	}
	
}
