package com.ubosque.progII.modelo;

import java.util.Date;

public class Equipo {
		
		private int id;
		private String nombre;
		private String tecnico;
		private Date fechaFundacion;
		
		public Equipo() {			
		}
		
		public Equipo(int id, String nombre, String tecnico, Date fechaFundacion) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.tecnico = tecnico;
			this.fechaFundacion = fechaFundacion;
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

		public String getTecnico() {
			return tecnico;
		}

		public void setTecnico(String tecnico) {
			this.tecnico = tecnico;
		}

		public Date getFechaFundacion() {
			return fechaFundacion;
		}

		public void setFechaFundacion(Date fechaFundacion) {
			this.fechaFundacion = fechaFundacion;
		}
		
		
}
