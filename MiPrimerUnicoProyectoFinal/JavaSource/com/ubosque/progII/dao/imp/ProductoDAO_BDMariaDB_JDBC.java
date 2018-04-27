package com.ubosque.progII.dao.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ubosque.progII.dao.IProductoDAO;
import com.ubosque.progII.modelo.Producto;
import com.ubosque.progII.modelo.Unidad;
import com.ubosque.progII.util.ConexionMariaDB_JDBC;

public class ProductoDAO_BDMariaDB_JDBC implements IProductoDAO {

	@Override
	public boolean createProducto(Producto producto) {
		return false;
	}

	@Override
	public ArrayList<Producto> readProducto() {
		ArrayList<Producto> lista = new ArrayList<Producto>();
		Connection con = ConexionMariaDB_JDBC.GetConnection();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("CALL ConsultarProductos");
			while (rs.next()) {
				Producto producto = new Producto();
				producto.setId(rs.getInt(1));
				producto.setNombre(rs.getString(2));
				producto.setCantidad(rs.getInt(3));
				producto.setValorUnitario(rs.getInt(4));
				producto.setUnidad(new Unidad(0, rs.getString(5)));
				lista.add(producto);
			}
			return lista;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateProducto(Producto producto) {
		return false;
	}

	@Override
	public boolean deleteProducto(Producto producto) {
		return false;
	}

}
