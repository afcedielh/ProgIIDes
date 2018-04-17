package com.ubosque.progII.dao.imp;

import java.util.ArrayList;
import com.ubosque.progII.bd.BaseDatos;
import com.ubosque.progII.dao.IEquipoDAO;
import com.ubosque.progII.modelo.Equipo;

public class EquipoDAO_BDLocal implements IEquipoDAO {

	@Override
	public boolean createEquipo(Equipo equipoACrear) 
	{
		BaseDatos .getInstance().getListaEquipos().add(equipoACrear);		
		return true;
	}

	@Override
	public ArrayList<Equipo> readEquipo()
	{
		
		return BaseDatos.getInstance().getListaEquipos();
	}

	@Override
	public boolean updateEquipo(Equipo equipoAModificar) 
	{
		
		ArrayList<Equipo> listaTemporal = BaseDatos.getInstance().getListaEquipos();
		
		for(int i = 0;i<listaTemporal.size();i++) 
		{
			
			Equipo actual = listaTemporal.get(i);
			
			if(equipoAModificar.getId() == actual.getId()) 
			{
				
				listaTemporal.set(i, equipoAModificar);
				
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteEquipo(Equipo equipoAEliminar) 
	{
		
		ArrayList<Equipo> listaTemporal = BaseDatos.getInstance().getListaEquipos();
		
		for(int i = 0;i<listaTemporal.size();i++) 
		{
			Equipo actual = listaTemporal.get(i);
			
			if(equipoAEliminar.getId() == actual.getId())
			{
				
				listaTemporal.remove(i);
				
				return true;
			}
		}
		
		return false;
	}

}
