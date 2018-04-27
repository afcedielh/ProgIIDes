package com.ubosque.progII.mb;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ubosque.progII.logic.JugadorLogica;
import com.ubosque.progII.modelo.Jugador;

@ManagedBean
@SessionScoped
public class JugadorMB {

	private Jugador JugadorCreacion;
	private Jugador JugadorModificacion;
	private Jugador JugadorEliminacion;
	private JugadorLogica logica = new JugadorLogica();
	private ArrayList<Jugador> jugadorLista;
	
	public String iniciarJugadorCreacion() {
		JugadorCreacion = new Jugador();
		return "/Jugadores/creaJugador.xhtml";
	}
	
	public String crearJugador()
	{
		logica.createJugador(JugadorCreacion);
		
		return "/Jugadores/listaJugadores.xhtml";
	}

	public String actualizarJugador()
	{
		logica.updateJugador(JugadorModificacion);
		
		return "/Jugadores/listaJugadores.xhtml";
	}
	
	public String eliminarJugador() 
	{
		logica.deleteJugador(JugadorEliminacion);
		
		return null;
	}
	
	public void consultarJugador() 
	{
		jugadorLista = logica.readEquipo();
	}
	
	public Jugador getJugadorCreacion() {
		return JugadorCreacion;
	}

	public void setJugadorCreacion(Jugador jugadorCreacion) {
		JugadorCreacion = jugadorCreacion;
	}

	public Jugador getJugadorModificacion() {
		return JugadorModificacion;
	}

	public void setJugadorModificacion(Jugador jugadorModificacion) {
		JugadorModificacion = jugadorModificacion;
	}

	public Jugador getJugadorEliminacion() {
		return JugadorEliminacion;
	}

	public void setJugadorEliminacion(Jugador jugadorEliminacion) {
		JugadorEliminacion = jugadorEliminacion;
	}

	public JugadorLogica getLogica() {
		return logica;
	}

	public void setLogica(JugadorLogica logica) {
		this.logica = logica;
	}

	public ArrayList<Jugador> getJugadorLista() {
		return jugadorLista;
	}

	public void setJugadorLista(ArrayList<Jugador> jugadorLista) {
		this.jugadorLista = jugadorLista;
	}

	
	
}
