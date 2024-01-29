package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Factura;

@Repository
public class FacturaDAOImpl implements FacturaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		Session	 session = sessionFactory.getCurrentSession();	
		return session.createQuery("from facturacion", Factura.class).getResultList();
		
	}

	@Override
	@Transactional
	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Factura.class, id);
		
	}

	@Override
	@Transactional
	public void add(Factura factura) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(factura);

	}

	@Override
	@Transactional
	public void up(Factura factura) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(factura);

	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));

	}

	@Override
	@Transactional
	public int findMax() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("SELECT max(fa.idFactura) FROM facturacion fa");
		return (int) query.getSingleResult();
	}

	@Override
	@Transactional
	public int findOne(String numFactura) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Factura> query = session.createQuery("select fa"
				+ "from facturacion fa"
				+ "Where fa.numFactura like : keyBusqueda ", Factura.class);
		
		return query.getResultList().get(0).getIdFactura();
	}

}
