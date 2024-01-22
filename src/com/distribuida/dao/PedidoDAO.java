package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Pedido;

public interface PedidoDAO {

	public List<Pedido> findAll();
	
	public Pedido findOne(int id);
	
	public void add(Pedido pedido);
	
	public void up(Pedido pedido);
	
	public void del(int id);
}
