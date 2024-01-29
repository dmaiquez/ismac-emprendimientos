package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.distribuida.entities.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO {


		
		@Autowired
		private SessionFactory sessionFactory;
		
		@Override
		@Transactional

		public List<Cliente> findAll() {
			// TODO Auto-generated method stub			
			Session session = sessionFactory.getCurrentSession();
			return session.createQuery("from Clientes", Cliente.class).getResultList();
			
		}

		@Override
		@Transactional
		public Cliente findOne(int id) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			
			return session.get(Cliente.class, id);			
		}

		@Override
		@Transactional

    public void add(Cliente cliente) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
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




