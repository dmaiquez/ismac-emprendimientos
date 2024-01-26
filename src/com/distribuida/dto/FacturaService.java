package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;

public interface FacturaService {

	public List<FacturaDetalle> findAll();
	public Factura findOne(int id);
	
	public void add(int idFactura, String numFactura, Date fechaFactura, double totalNeto, double iva, double total,
			int idCliente , int idPedido , int idFormaPago);
	public void add(int idFacturaDetalle, String producto, int cantidad, double preUnidad, double subTotal,
			double descuento1, double descuento2, int idFactura, int idEmpresaProducto);

	public int findMax();
	public int findOne(String numFactura);
	
}
