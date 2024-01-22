package com.distribuida.entities;


public class clientelogin {
	
	private int idCliente;
	private String correo;
	private int password;
	private int cedula;
	private String nombre;
	private String apellido;
	private int edad;
	private int telefono;
	
	
	public clientelogin() {}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	 
	@Override
	public String toString() {
		return "clientelogin [idCliente=" + idCliente + ", correo=" + correo + ", password=" + password + ", cedula="
				+ cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad +
				 ", telefono=" + telefono + "]";
	///
}

	
	}

