package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.cliente;

public interface ClienteDAO {

public List<cliente> findAll();
	
	public cliente findOne(int id);
	
	public void add(cliente cliente);
	
	public void up(cliente cliente);
	
	public void del(int id);

	
	

}

