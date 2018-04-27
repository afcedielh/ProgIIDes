package com.ubosque.progII.facade;

import java.util.ResourceBundle;

import com.ubosque.progII.dao.IProductoDAO;
import com.ubosque.progII.dao.imp.ProductoDAO_BDMariaDB_JDBC;

public class ProductoFacade {
	
	private IProductoDAO dao;
	
	public ProductoFacade()
	{
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String tipoBD = rb.getString("tipoBaseDatos");
		if(tipoBD != null && tipoBD.equals("1")) {
			dao = new ProductoDAO_BDMariaDB_JDBC();
		}else if(tipoBD != null && tipoBD.equals("2")) {
			dao = new ProductoDAO_BDMariaDB_JDBC();
		}
	}

	public IProductoDAO getDao()
	{
		return dao;
	}
	
	
}
