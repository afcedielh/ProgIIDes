package com.ubosque.progII.facate;

import com.ubosque.progII.dao.IJugadorDAO;
import com.ubosque.progII.dao.imp.JugadorDAO_BDLocal;

public class JugadorFacade {
	
private IJugadorDAO dao;
	
	public JugadorFacade()
	{
		
		dao = new JugadorDAO_BDLocal();
	}

	public IJugadorDAO getDao()
	{
		return dao;
	}
}
