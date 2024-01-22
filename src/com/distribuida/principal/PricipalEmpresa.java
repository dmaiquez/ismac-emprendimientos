package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.EmpresaDAO;
import com.distribuida.entities.Empresa;



public class PricipalEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		EmpresaDAO empresaDAO = context.getBean("empresaDAOImpl",EmpresaDAO.class);
		
		// add
	    Empresa empresa = new Empresa(0,"https://webEmpresa","Empresa A","Miguel Quipo","Whatsapp","0987654321","correo@com.com","Quito Pifo");
		empresaDAO.add(empresa);
		
		// up
		// Empresa empresa = new Empresa(0,"https://webEmpresa","Empresa A","Miguel Quipo","Whatsapp","0987654321","correo@com.com","Quito Pifo");
		//empresaDAO.up(empresa);
				

		// Delete
		// empresaDAO.del(1);
				
		//findAll
		//List<Empresa> empresa = empresaDAO.findAll();
				
		//Impresion
		//for(Empresa item : empresa){
		//  		System.out.println(item.toString());
		//}
				
		// findOne
		// Empresa empresa = empresaDAO.findOne(30);
		// System.out.println(empresa.toString());
				
		
		context.close();
	}

}
