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
@Table(name = "empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEmpresa")
	private int idEmpresa;
	@Column(name = "CirPago")
	private String CirPago;  
	@Column(name = "nombreempresa")
	private String nombreempresa;  
	@Column(name = "personaCargoEmpresa")
	private String personaCargoEmpresa;
	@Column(name = "personaContacto")
	private String personaContacto;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "correo")
	private String correo;
	@Column(name = "direccion")
	private String direccion;
	


	
	public Empresa(){}
	
	public Empresa(int idEmpresa, String cirPago, String nombreempresa, String personaCargoEmpresa,
	        String personaContacto, String telefono, String correo, String direccion) {
	    this.idEmpresa = idEmpresa;
	    CirPago = cirPago;
	    this.nombreempresa = nombreempresa;
	    this.personaCargoEmpresa = personaCargoEmpresa;
	    this.personaContacto = personaContacto;
	    this.telefono = telefono;
	    this.correo = correo;
	    this.direccion = direccion;
	}




	public int getIdEmpresa() {
		return idEmpresa;
	}


	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}


	public String getCirPago() {
		return CirPago;
	}


	public void setCirPago(String cirPago) {
		CirPago = cirPago;
	}


	public String getNombreempresa() {
		return nombreempresa;
	}


	public void setNombreempresa(String nombreempresa) {
		this.nombreempresa = nombreempresa;
	}


	public String getPersonaCargoEmpresa() {
		return personaCargoEmpresa;
	}


	public void setPersonaCargoEmpresa(String personaCargoEmpresa) {
		this.personaCargoEmpresa = personaCargoEmpresa;
	}


	public String getPersonaContacto() {
		return personaContacto;
	}


	public void setPersonaContacto(String personaContacto) {
		this.personaContacto = personaContacto;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Empresa [idEmpresa=" + idEmpresa + ", CirPago=" + CirPago + ", nombreempresa=" + nombreempresa
				+ ", personaCargoEmpresa=" + personaCargoEmpresa + ", personaContacto=" + personaContacto
				+ ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion + "]";
	}



	
	
}
