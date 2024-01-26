package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.dao.FormaPagoDAO;
import com.distribuida.dao.PedidoDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Empresa_producto;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.FormaPago;
import com.distribuida.entities.Pedido;

@Service
public class FacturaServiceImpl implements FacturaService {

	@Autowired
	private ClienteDAO clienteDAO;
	@Autowired
	private PedidoDAO pedidoDAO;
	@Autowired
	private FormaPagoDAO formapagoDAO;
	@Autowired
	private Empresa_ProductoDAO empresa_productoDAO;
	@Autowired
	private FacturaDAO facturaDAO;
	@Autowired
	private FacturaDetalleDAO facturaDetalleDAO; 
	
	@Override
	public List<FacturaDetalle> findAll() {
		// TODO Auto-generated method stub
		return facturaDetalleDAO.findAll();
	}

	@Override
	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		return facturaDAO.findOne(id);
	}

	@Override
	public void add(int idFactura, String numFactura, Date fechaFactura, double totalNeto, double iva, double total,
			int idCliente, int idPedido, int idFormaPago) {
		// TODO Auto-generated method stub
		Factura factura = new Factura(idFactura, numFactura,  fechaFactura,  totalNeto, iva, total);
		
		Cliente cliente = clienteDAO.findOne(idCliente);
		Pedido pedido = pedidoDAO.findOne(idPedido);
		FormaPago formapago = formapagoDAO.findOne(idFormaPago);
		
		factura.setCliente(cliente);
		factura.setPedido(pedido);
		factura.setFormaPago(formapago);
		
		facturaDAO.add(factura);
	}
	@Override
	public void add(int idFacturaDetalle, String producto, int cantidad, double preUnidad, double subTotal,
			double descuento1, double descuento2, int idFactura, int idEmpresaFactura) {
		// TODO Auto-generated method stub
		FacturaDetalle facturaDetalle = new FacturaDetalle(idFacturaDetalle, producto, cantidad, preUnidad, subTotal,
				descuento1, descuento2);
		
		Factura factura = facturaDAO.findOne(idFactura);
		Empresa_producto empresaproducto = empresa_productoDAO.finOne(idEmpresaFactura);
		
		facturaDetalle.setFactura(factura);
		facturaDetalle.setIdFacturaDetalle(idFacturaDetalle);
		
		facturaDetalleDAO.add(facturaDetalle);
		
	}

	@Override
	public int findMax() {
		// TODO Auto-generated method stub
		return facturaDAO.findMax();
	}

	@Override
	public int findOne(String numFactura) {
		// TODO Auto-generated method stub
		return facturaDAO.findOne(numFactura);
	}





}
