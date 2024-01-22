package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.FacturaDetalle;

public interface FacturaDetalleDAO {

	public List<FacturaDetalle> findAll();
	public FacturaDetalle findOne(int id);
	public void add(FacturaDetalle facturadetalle);
	public void up(FacturaDetalle facturadetalle);
	public void del(int id);
}
