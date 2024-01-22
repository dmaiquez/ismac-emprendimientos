package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.SucursalesDAO;
import com.distribuida.entities.Sucursales;



public class PrincipaleSucursales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		SucursalesDAO sucursalesDAO = context.getBean("sucursalesDAOImpl",SucursalesDAO.class);
		
		// add
	    //Sucursales sucursales = new Sucursales(0, "Quito, Tumbaco","Una categoria mas");
		//sucursalesDAO.add(sucursales);
		
		// up
		// Sucursales sucursales = new Sucursales(1, "Terror","Una categoria mas");
		// sucursalesDAO.up(sucursales);
				

		// Delete
		// sucursalesDAO.del(59);
				
		//findAll
		List<Sucursales> sucursales = sucursalesDAO.findAll();
				
		//Impresion
		for(Sucursales item : sucursales){
		  		System.out.println(item.toString());
		}
				
		// findOne
		// Categoria categoria = categoriaDAO.findOne(30);
		// System.out.println(categoria.toString());
				
		
		context.close();
	}

}
