package com.ubosque.progII.mb;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ubosque.progII.logic.EquipoLogica;
import com.ubosque.progII.modelo.Equipo;

@ManagedBean
@SessionScoped
public class EquipoMB {

	private Equipo equipoCreacion;
	private Equipo equipoModificacion;
	private Equipo equipoEliminacion;
	private EquipoLogica logica = new EquipoLogica();
	private ArrayList<Equipo> equipoLista;
	
	public String iniciarEquipoCreacion() {
		equipoCreacion = new Equipo();
		return "/equipo/creaEquipo.xhtml";
	}
	
	public void consultarEquipos() 
	{
	equipoLista = logica.readEquipo();
	}
	
	public String crearEquipo()
	{
		logica.createEquipo(equipoCreacion);
		
		return "/equipo/listaEquipos.xhtml";
	}

	public String actualizarEquipo()
	{
		logica.updateEquipo(equipoModificacion);
		
		return "/equipo/listaEquipos.xhtml";
	}
	
	public String eliminarEquipo() 
	{
		logica.deleteEquipo(equipoEliminacion);
		
		return null;
	}
	
	public Equipo getEquipoCreacion() 
	{
		return equipoCreacion;
	}
	public void setEquipoCreacion(Equipo equipoCreacion) 
	{
		this.equipoCreacion = equipoCreacion;
	}
	public Equipo getEquipoModificacion() 
	{
		return equipoModificacion;
	}
	public void setEquipoModificacion(Equipo equipoModificacion) 
	{
		this.equipoModificacion = equipoModificacion;
	}
	public Equipo getEquipoEliminacion() {
		return equipoEliminacion;
	}
	public void setEquipoEliminacion(Equipo equipoEliminacion) {
		this.equipoEliminacion = equipoEliminacion;
	}
	public EquipoLogica getLogica() {
		return logica;
	}
	public void setLogica(EquipoLogica logica) {
		this.logica = logica;
	}
	public ArrayList<Equipo> getEquipoLista() {
		return equipoLista;
	}
	public void setEquipoLista(ArrayList<Equipo> equipoLista) {
		this.equipoLista = equipoLista;
	}
	
	
	
}
