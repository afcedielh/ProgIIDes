package com.ubosque.progII.dao;
import java.util.ArrayList;
import com.ubosque.progII.modelo.Equipo;

public interface IEquipoDAO {

	public boolean createEquipo(Equipo equipoACrear);
	
	public ArrayList<Equipo> readEquipo();
	
	public boolean updateEquipo(Equipo equipoAModificar);
	
	public boolean deleteEquipo(Equipo equipoAEliminar);
	
}
