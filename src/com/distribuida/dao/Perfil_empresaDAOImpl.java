package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Perfil_empresa;

@Repository
public class Perfil_empresaDAOImpl implements Perfil_empresaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Perfil_empresa> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Perfil_empresa", Perfil_empresa.class).getResultList();
	}

	@Override
	@Transactional
	public Perfil_empresa findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Perfil_empresa.class, id);
	}

	@Override
	@Transactional
	public void add(Perfil_empresa perfil_empresa) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(perfil_empresa);
	}

	@Override
	@Transactional
	public void up(Perfil_empresa perfil_empresa) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(perfil_empresa);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
