package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Perfil_empresa;


public interface Perfil_empresaDAO {

public List<Perfil_empresa> findAll();
	
	public Perfil_empresa findOne(int id);
	
	public void add(Perfil_empresa perfil_empresa);
	
	public void up(Perfil_empresa perfil_empresa);
	
	public void del(int id);
}
