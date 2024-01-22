package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Loginuser;

public interface LoginuserDAO {

    public List<Loginuser> findAll();
	
	public Loginuser findOne(int id);
	
	public void add(Loginuser user);
	
	public void up(Loginuser user);
	
	public void del(int id);
	public List<Loginuser> findAll(String busqueda);
}

