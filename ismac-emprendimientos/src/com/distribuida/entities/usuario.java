package com.distribuida.entities;

public class usuario {
	  private Long id;
	    private String nombre;
	    private String correo;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		
		@Override
		public String toString() {
			return "Usuario [id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
		}
}
