package com.ubosque.progII.dao;
import java.util.ArrayList;
import com.ubosque.progII.modelo.Jugador;

public interface IJugadorDAO {

	public boolean createJugador(Jugador JugadorACrear);
	
	public ArrayList<Jugador> readJugador();
	
	public boolean updateJugador(Jugador JugadorAModificar);
	
	public boolean deleteJugador(Jugador JugadorAEliminar);	
}
