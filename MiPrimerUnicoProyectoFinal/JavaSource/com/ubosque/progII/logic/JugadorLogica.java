package com.ubosque.progII.logic;

import java.util.ArrayList;

import com.ubosque.progII.facade.JugadorFacade;
import com.ubosque.progII.modelo.Jugador;

public class JugadorLogica 
{
	
	private JugadorFacade facade = new JugadorFacade();
	
	public boolean createJugador(Jugador JugadorACrear) 
	{
		return facade.getDao().createJugador(JugadorACrear);
	}
	
	public ArrayList<Jugador> readEquipo()
	{
		return facade.getDao().readJugador();
		
	}
	
	public boolean updateJugador(Jugador JugadorAModificar)
	{
		return facade.getDao().updateJugador(JugadorAModificar);
	}
	
	public boolean deleteJugador(Jugador JugadorAEliminar) 
	{
		return facade.getDao().deleteJugador(JugadorAEliminar);		
	}
}
