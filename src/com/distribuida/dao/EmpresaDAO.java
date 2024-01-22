package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Empresa;

public interface EmpresaDAO {

public List<Empresa> findAll();
	
	public Empresa findOne(int id);
	
	public void add(Empresa empresa);
	
	public void up(Empresa empresa);
	
	public void del(int id);
}
