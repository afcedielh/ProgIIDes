package com.ubosque.progII.facade;

import java.util.ResourceBundle;

import com.ubosque.progII.dao.IEquipoDAO;
import com.ubosque.progII.dao.imp.EquipoDAO_BDLocal;
import com.ubosque.progII.dao.imp.EquipoDAO_BDMariaDB_JDBC;

public class EquipoFacade {
	
	private IEquipoDAO dao;
	
	public EquipoFacade()
	{
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String tipoBD = rb.getString("TipoBaseDatos");
		if(tipoBD != null && tipoBD.equals("1"))		
			dao = new EquipoDAO_BDLocal();
		else
			dao = new EquipoDAO_BDMariaDB_JDBC();
	}

	public IEquipoDAO getDao()
	{
		return dao;
	}
	
	
}
