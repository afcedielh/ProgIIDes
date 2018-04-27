package com.ubosque.progII.dao.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
		try {
			Connection con = ConexionMariaDB_JDBC.GetConnection();
			PreparedStatement pstm = con
					.prepareStatement("INSERT INTO equipo  (nombre, tecnico, fecha_fundacion) VALUES (?, ?, ?)");
			pstm.setString(1, equipoACrear.getNombre());
			pstm.setString(2, equipoACrear.getTecnico());
			java.sql.Date date = new java.sql.Date(equipoACrear.getFechaFundacion().getTime());
			pstm.setDate(3, date);
			pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
				Equipo equipo = new Equipo();
				equipo.setId(rs.getInt(1));
				equipo.setNombre(rs.getString(2));
				equipo.setTecnico(rs.getString(3));
				equipo.setFechaFundacion(rs.getDate(4));
				listaEquipos.add(equipo);
			}
			return listaEquipos;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateEquipo(Equipo equipoAModificar) {
		Connection con = ConexionMariaDB_JDBC.GetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("UPDATE mi_primera_base_de_datos.equipo SET "
					+ "nombre = ?, " + "tecnico = ?," + " fecha_fundacion = ? " + "where id = ?");
			pstmt.setString(1, equipoAModificar.getNombre());
			pstmt.setString(2, equipoAModificar.getTecnico());
			java.sql.Date date = new java.sql.Date(equipoAModificar.getFechaFundacion().getTime());
			pstmt.setDate(3, date);
			pstmt.setInt(4, equipoAModificar.getId());
			int rs = pstmt.executeUpdate();
			if (rs > 0) {
				con.close();
				return true;
			} else {
				con.close();
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteEquipo(Equipo equipoAEliminar) {
		Connection con = ConexionMariaDB_JDBC.GetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM mi_primera_base_de_datos.equipo where id = ?");
			pstmt.setInt(1, equipoAEliminar.getId());
			int rs = pstmt.executeUpdate();
			if (rs > 0) {
				con.close();
				return true;
			} else {
				con.close();
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
