package com.ubosque.progII.facate;

import com.ubosque.progII.dao.IEquipoDAO;
import com.ubosque.progII.dao.imp.EquipoDAO_BDLocal;

public class EquipoFacade {
	
	private IEquipoDAO dao;
	
	public EquipoFacade()
	{
		
		dao = new EquipoDAO_BDLocal();
	}

	public IEquipoDAO getDao()
	{
		return dao;
	}	
}
