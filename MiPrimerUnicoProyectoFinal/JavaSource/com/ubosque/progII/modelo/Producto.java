package com.ubosque.progII.modelo;

public class Producto {
	private int id, cantidad, ValorUnitario, ValorTotal;
	private String nombre;
	private Unidad unidad;	
	
	public Producto() {
		super();
	}

	public Producto(int id, int cantidad, int valorUnitario, int valorTotal, String nombre, Unidad unidad) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		ValorUnitario = valorUnitario;
		ValorTotal = valorTotal;
		this.nombre = nombre;
		this.unidad = unidad;
	}

	public int getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(int valorTotal) {
		ValorTotal = valorTotal;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getValorUnitario() {
		return ValorUnitario;
	}

	public void setValorUnitario(int valorUnitario) {
		ValorUnitario = valorUnitario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", cantidad=" + cantidad + ", ValorUnitario=" + ValorUnitario + ", nombre="
				+ nombre + ", unidad=" + unidad + ", getId()=" + getId() + ", getCantidad()=" + getCantidad()
				+ ", getValorUnitario()=" + getValorUnitario() + ", getNombre()=" + getNombre() + ", getUnidad()="
				+ getUnidad() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
