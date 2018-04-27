package com.ubosque.progII.modelo;

import java.util.Date;

public class Jugador {
		
		private int id;
		private String nombre;
		private Equipo Equipo;
		private Date FechaNacimiento;
		private String Documento;
		private String Posicion;			
		
		public Jugador(int id, String nombre, Equipo equipo, Date fechaNacimiento, String documento, String posicion) {
			super();
			this.id = id;
			this.nombre = nombre;
			Equipo = equipo;
			FechaNacimiento = fechaNacimiento;
			Documento = documento;
			Posicion = posicion;
		}

		public Jugador() {			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Equipo getEquipo() {
			return Equipo;
		}

		public void setEquipo(Equipo equipo) {
			Equipo = equipo;
		}

		public Date getFechaNacimiento() {
			return FechaNacimiento;
		}

		public void setFechaNacimiento(Date fechaNacimiento) {
			FechaNacimiento = fechaNacimiento;
		}

		public String getDocumento() {
			return Documento;
		}

		public void setDocumento(String documento) {
			Documento = documento;
		}

		public String getPosicion() {
			return Posicion;
		}

		public void setPosicion(String posicion) {
			Posicion = posicion;
		}		
		
}
