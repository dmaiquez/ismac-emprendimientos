package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Empresa;


@Repository
public class EmpresaDAOImpl implements EmpresaDAO {

	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	@Transactional
	public List<Empresa> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Empresa", Empresa.class).getResultList();
	}

	@Override
	@Transactional
	public Empresa findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Empresa.class, id);
	}

	@Override
	@Transactional
	public void add(Empresa empresa) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(empresa);
	}

	@Override
	@Transactional
	public void up(Empresa empresa) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(empresa);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
