package com.ubosque.progII.dao.imp;

import java.util.ArrayList;
import com.ubosque.progII.bd.BaseDatos;
import com.ubosque.progII.dao.IJugadorDAO;
import com.ubosque.progII.modelo.Jugador;

public class JugadorDAO_BDLocal implements IJugadorDAO {

	@Override
	public boolean createJugador(Jugador JugadorACrear) 
	{
		BaseDatos .getInstance().getlistaJugador().add(JugadorACrear);		
		return true;
	}

	@Override
	public ArrayList<Jugador> readJugador()
	{		
		return BaseDatos.getInstance().getlistaJugador();
	}

	@Override
	public boolean updateJugador(Jugador JugadorAModificar) 
	{		
		ArrayList<Jugador> listaTemporal = BaseDatos.getInstance().getlistaJugador();		
		for(int i = 0;i<listaTemporal.size();i++) 
		{
			
			Jugador actual = listaTemporal.get(i);
			
			if(JugadorAModificar.getId() == actual.getId()) 
			{				
				listaTemporal.set(i, JugadorAModificar);				
				return true;
			}
		}		
		return false;
	}

	@Override
	public boolean deleteJugador(Jugador JugadorAEliminar) 
	{
		
		ArrayList<Jugador> listaTemporal = BaseDatos.getInstance().getlistaJugador();
		
		for(int i = 0;i<listaTemporal.size();i++) 
		{
			Jugador actual = listaTemporal.get(i);
			
			if(JugadorAEliminar.getId() == actual.getId())
			{
				
				listaTemporal.remove(i);
				
				return true;
			}
		}
		
		return false;
	}

}
