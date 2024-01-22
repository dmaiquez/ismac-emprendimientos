package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.entities.cliente;

public class ClienteDAOImpl implements ClienteDAO {


		
		@Autowired
		private SessionFactory sessionFactory;
		
		@Override
		@Transactional
		public List<cliente> findAll() {
			// TODO Auto-generated method stub
			
			Session session = sessionFactory.getCurrentSession();
			return session.createQuery("from Clientes", cliente.class).getResultList();
			

		}

		@Override
		@Transactional
		public cliente findOne(int id) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			
			return session.get(cliente.class, id);
			
		}

		@Override
		@Transactional
		public void add(cliente cliente) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			//cliente cliente1 = new cliente();
			//Actulizar
			//cliente cliente2 = new cliente();
			session.saveOrUpdate(cliente);
		}

		@Override
		@Transactional
		public void up(cliente cliente) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(cliente);
		}

		@Override
		@Transactional
		public void del(int id) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(findOne(id));
			
		}


	}




