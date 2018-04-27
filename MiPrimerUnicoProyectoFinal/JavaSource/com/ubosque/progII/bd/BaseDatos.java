package com.ubosque.progII.bd;

import java.util.ArrayList;
import java.util.Calendar;

import com.ubosque.progII.modelo.Equipo;
import com.ubosque.progII.modelo.Jugador;


public class BaseDatos {

	private static BaseDatos bdLocal;
	private static ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
	private static ArrayList<Jugador> listaJugador = new ArrayList<Jugador>();

	public BaseDatos() {
		Calendar cal = Calendar.getInstance();
		cal.set(1920, 0, 1);
		Equipo equipo1 = new Equipo(1, "Colombia", "Jose Pequerman", cal.getTime());
		cal.set(1900, 7, 20);
		Equipo equipo2 = new Equipo(2, "Argentina", "Jorge San Paoli", cal.getTime());
		cal.set(1910, 4, 10);
		Equipo equipo3 = new Equipo(2, "Brasil", "Dunga", cal.getTime());
		listaEquipos.add(equipo1);
		listaEquipos.add(equipo2);
		listaEquipos.add(equipo3);
		// Sección datos jugadores
		cal.set(1980, 0, 1);
		//listaJugador.add(new Jugador(1, "Falcao Garcia", "Colombia", cal.getTime(), "10515484", "Delantero"));
		cal.set(1991, 0, 1);
		//listaJugador.add(new Jugador(2, "James", "Colombia", cal.getTime(), "10515484", "Delantero"));
		cal.set(1980, 0, 1);
		///listaJugador.add(new Jugador(3, "Messi", "Argentina", cal.getTime(), "10515484", "Volante"));
		cal.set(1981, 0, 1);
		//listaJugador.add(new Jugador(4, "Cristiano Ronaldo", "Argentina", cal.getTime(), "10515484", "Delantero"));
	}

	// permite verificar si la base de datos esta instanciada o no
	public static BaseDatos getInstance() {

		if (bdLocal == null) {

			bdLocal = new BaseDatos();
		}
		return bdLocal;
	}

	public ArrayList<Equipo> getListaEquipos() {
		return listaEquipos;
	}
	public ArrayList<Jugador> getlistaJugador() {
		return listaJugador;
	}

}
