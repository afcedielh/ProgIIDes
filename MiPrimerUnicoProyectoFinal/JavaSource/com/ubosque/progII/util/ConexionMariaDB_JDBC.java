package com.ubosque.progII.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author afced
 *
 */
public class ConexionMariaDB_JDBC {

	/**
	 * 
	 */
	public  ConexionMariaDB_JDBC() {
		// TODO Auto-generated constructor stub
	}

	public static Connection GetConnection() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/mi_primera_base_de_datos","root","123456");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
