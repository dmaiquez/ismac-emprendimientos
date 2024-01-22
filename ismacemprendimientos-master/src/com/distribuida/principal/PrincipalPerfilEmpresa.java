package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.Perfil_empresaDAO;
import com.distribuida.entities.Perfil_empresa;



public class PrincipalPerfilEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Perfil_empresaDAO perfil_empresaDAO = context.getBean("perfil_empresaDAOImpl",Perfil_empresaDAO.class);
		
		// add
	    Perfil_empresa perfil_empresa = new Perfil_empresa(0, "logoEmpresa1.png","#ffff","#ffff","#ffff");
		perfil_empresaDAO.add(perfil_empresa);
		
		// up
		// Perfil_empresa Perfil_empresa = new Perfil_empresa(1, "logoEmpresa1.png","#ffff","#ffff","#ffff",1);
		// perfil_empresaDAO.up(perfil_empresa);
				

		// Delete
		// sucursalesDAO.del(59);
				
		//findAll
		//List<Perfil_empresa> perfil_empresa = perfil_empresaDAO.findAll();
				
		//Impresion
		//for(Perfil_empresa item : perfil_empresa){
		 // 		System.out.println(item.toString());
		//}
				
		// findOne
		// Categoria categoria = categoriaDAO.findOne(30);
		// System.out.println(categoria.toString());
				
		
		context.close();
	}

}
