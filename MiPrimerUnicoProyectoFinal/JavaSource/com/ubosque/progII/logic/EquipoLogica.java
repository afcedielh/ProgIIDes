package com.ubosque.progII.logic;

import java.util.ArrayList;

import com.ubosque.progII.facade.EquipoFacade;
import com.ubosque.progII.modelo.Equipo;

public class EquipoLogica 
{
	
	private EquipoFacade facade = new EquipoFacade();
	
	public boolean createEquipo(Equipo equipoAInsertar) 
	{
		return facade.getDao().createEquipo(equipoAInsertar);
	}
	
	public ArrayList<Equipo> readEquipo()
	{
		return facade.getDao().readEquipo();
		
	}
	
	public boolean updateEquipo(Equipo equipoACambiar)
	{
		return facade.getDao().updateEquipo(equipoACambiar);
	}
	
	public boolean deleteEquipo(Equipo equipoAEliminar) 
	{
		return facade.getDao().deleteEquipo(equipoAEliminar);		
	}
}
