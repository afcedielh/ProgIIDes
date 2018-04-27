package com.ubosque.progII.dao;
import java.util.ArrayList;
import com.ubosque.progII.modelo.Producto;

public interface IProductoDAO {

	public boolean createProducto(Producto producto);
	
	public ArrayList<Producto> readProducto();
	
	public boolean updateProducto(Producto producto);
	
	public boolean deleteProducto(Producto producto);
	
}
