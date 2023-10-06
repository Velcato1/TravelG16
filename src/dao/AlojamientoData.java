package dao;

import static connect.Conexion.getConexion;
import java.sql.*;
import javax.swing.*;
import models.*;
import static utils.ManejoRecursos.closeConnection;
import static utils.ManejoRecursos.closePreparedStatement;
import static utils.ManejoRecursos.closeResultSet;

public class AlojamientoData {


	public AlojamientoData(){}


	public static void cargarAlojamiento(Alojamiento alojamiento) {
		Connection conexion = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			conexion = getConexion();
			String sql = "INSERT INTO alojamiento (nombre, checkIn, checkOut, servicio, " +
					"importeDiario, ciudadDestino, estado)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
			ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, alojamiento.getNombre());
			ps.setDate(2, java.sql.Date.valueOf(alojamiento.getCheckIn()));
			ps.setDate(3, java.sql.Date.valueOf(alojamiento.getCheckOut()));
			ps.setString(4, alojamiento.getServicio());
			ps.setDouble(5, alojamiento.getImporteDiario());
			Ciudad ciudad = CiudadData.buscarCiudad(alojamiento.getCiudadDestino().getNombre());
			ps.setInt(6, ciudad.getIdCiudad());
			ps.setBoolean(7, alojamiento.getEstado());
			ps.executeUpdate();
			rs =  ps.getGeneratedKeys();
			if (rs.next()) {
				alojamiento.setIdAlojamiento(rs.getInt(1));
				JOptionPane.showMessageDialog (null, "Alojamiento guardado.");
			}
		} catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error de acceso a la tabla alojamiento.");
		} finally {
			closeResultSet(rs);
			closePreparedStatement(ps);
		    closeConnection(conexion);
		}
	}
}
