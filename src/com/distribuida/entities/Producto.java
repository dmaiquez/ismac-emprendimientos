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
@Table(name="producto")
public class Producto {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProducto")
	private int idProducto;
	@Column(name="numeroProducto")
	private String numeroProducto;
	@Column(name="descripcion")
	private String Descripcion;
	@Column(name="precioProducto")
	private double precioProducto;
	@Column(name="stock")
	private int stock;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="fk_idCategoria")		
	//GENERAMOS Categoria ***********
//	@Autowired
	private Categoria categoria;  //Categoria

	
	//Constructor Vacio
		public Producto() {
			
		}
		
	//CONSTRUCTOR PARAMETROS
		public Producto(int idProducto, String numeroProducto, String descripcion, double precioProducto, int stock,
				Categoria categoria) {
			this.idProducto = idProducto;
			this.numeroProducto = numeroProducto;
			Descripcion = descripcion;
			this.precioProducto = precioProducto;
			this.stock = stock;
			this.categoria = categoria;
		}


	// METODOS GET Y SET
		public int getIdProducto() {
			return idProducto;
		}



		public void setIdProducto(int idProducto) {
			this.idProducto = idProducto;
		}


		public String getNumeroProducto() {
			return numeroProducto;
		}


		public void setNumeroProducto(String numeroProducto) {
			this.numeroProducto = numeroProducto;
		}


		public String getDescripcion() {
			return Descripcion;
		}


		public void setDescripcion(String descripcion) {
			Descripcion = descripcion;
		}


		public double getPrecioProducto() {
			return precioProducto;
		}


		public void setPrecioProducto(double precioProducto) {
			this.precioProducto = precioProducto;
		}


		public int getStock() {
			return stock;
		}


		public void setStock(int stock) {
			this.stock = stock;
		}


		public Categoria getCategoria() {
			return categoria;
		}


		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		
		//TO STRING
		@Override
		public String toString() {
			return "Producto [idProducto=" + idProducto + ", numeroProducto=" + numeroProducto + ", Descripcion="
					+ Descripcion + ", precioProducto=" + precioProducto + ", stock=" + stock + ", categoria="
					+ categoria + "]";
		}
		
	
		
	
	
	

}
