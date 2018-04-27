package com.ubosque.progII.logic;

import java.util.ArrayList;

import com.ubosque.progII.facade.ProductoFacade;
import com.ubosque.progII.modelo.Producto;

public class ProductoLogica {

	private ProductoFacade facade = new ProductoFacade();

	public boolean createProducto(Producto Producto) {
		return facade.getDao().createProducto(Producto);
	}

	public ArrayList<Producto> readProducto() {
		return facade.getDao().readProducto();
	}

	public boolean updateProducto(Producto Producto) {
		return facade.getDao().updateProducto(Producto);
	}

	public boolean deleteProducto(Producto Producto) {
		return facade.getDao().deleteProducto(Producto);
	}
}
