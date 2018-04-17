package com.ubosque.progII.dao.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ubosque.progII.dao.IEquipoDAO;
import com.ubosque.progII.modelo.Equipo;
import com.ubosque.progII.util.ConexionMariaDB_JDBC;

public class EquipoDAO_BDMariaDB_JDBC implements IEquipoDAO {

	public EquipoDAO_BDMariaDB_JDBC() {

	}

	@Override
	public boolean createEquipo(Equipo equipoACrear) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Equipo> readEquipo() {
		ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
		Connection con = ConexionMariaDB_JDBC.GetConnection();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM equipo");
			while (rs.next()) {
				Equipo equipo = new Equipo() ;
				equipo.setId(rs.getInt(1));
				equipo.setNombre(rs.getString(2));
				equipo.setTecnico(rs.getString(3));
				equipo.setFechaFundacion(rs.getDate(4));
				listaEquipos.add(equipo);			
			}
			return listaEquipos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateEquipo(Equipo equipoAModificar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEquipo(Equipo equipoAEliminar) {
		// TODO Auto-generated method stub
		return false;
	}

}
