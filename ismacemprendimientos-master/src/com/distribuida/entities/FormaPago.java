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
@Table(name = "formas_pago")
public class FormaPago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFormaPago")
	private int idFormaPago;
	@Column(name = "FormaPago")
	private String formaspago;
	@Column(name = "Descripcion")
	private String  descripcion;
	
	public FormaPago() {}
	
	

	public FormaPago(int idFormaPago, String formaspago, String descripcion) {
		this.idFormaPago = idFormaPago;
		this.formaspago = formaspago;
		this.descripcion = descripcion;
	}



	public int getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(int idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public String getFormaspago() {
		return formaspago;
	}

	public void setFormaspago(String formaspago) {
		this.formaspago = formaspago;
	}

	public String  getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String  descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "FormaPago [idFormaPago=" + idFormaPago + ", formaspago=" + formaspago + ", descripcion=" + descripcion
				+ "]";
	}
	
	
}
