package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Sucursales;

public interface SucursalesDAO {

public List<Sucursales> findAll();
	
	public Sucursales findOne(int id);
	
	public void add(Sucursales sucursales);
	
	public void up(Sucursales sucurdales);
	
	public void del(int id);
}
