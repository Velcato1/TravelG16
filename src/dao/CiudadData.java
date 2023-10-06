

package dao;


import static connect.Conexion.getConexion;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import models.*;
import static utils.ManejoRecursos.closeConnection;
import static utils.ManejoRecursos.closePreparedStatement;
import static utils.ManejoRecursos.closeResultSet;

public class CiudadData {
	public CiudadData(){}

	public static void cargarCiudad(Ciudad ciudad) {
		Connection conexion = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			conexion = getConexion();
			String sql = "INSERT INTO ciudad (nombre, provincia, pais, estado)"
					+ "VALUES (?, ?, ?, ?)";
			ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, ciudad.getNombre());
			ps.setString(2, ciudad.getProvincia());
			ps.setString(3, ciudad.getPais());
			ps.setBoolean(4, ciudad.getEstado());
			ps.executeUpdate();
			rs =  ps.getGeneratedKeys();
			if (rs.next()) {
				ciudad.setIdCiudad(rs.getInt(1));
				JOptionPane.showMessageDialog (null, "Ciudad guardada");
			}
		} catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "No se permiten ciudades repetidas.");
		} finally {
			closeResultSet(rs);
			closePreparedStatement(ps);
		    closeConnection(conexion);
		}
	}

	public static Ciudad buscarCiudad(String nombre) {
		Connection conexion = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Ciudad ciudad = null;
		try {
			conexion = getConexion();
			String sql = "SELECT idCiudad, nombre, provincia, pais, estado FROM ciudad WHERE nombre = ?";
			ps = conexion.prepareStatement(sql);
			ps.setString(1, nombre);
			rs = ps.executeQuery();
			if(rs.next()){
				ciudad = new Ciudad();
				ciudad.setIdCiudad(rs.getInt("idCiudad"));
				ciudad.setNombre(nombre);
				ciudad.setProvincia(rs.getString("provincia"));
				ciudad.setPais(rs.getString("pais"));
				ciudad.setEstado(rs.getBoolean("estado"));
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog (null, "Error al acceder a la tabla Ciudad.");
		} finally {
			closeResultSet(rs);
			closePreparedStatement(ps);
			closeConnection(conexion);
		}
		return ciudad;
	}

	public static List<Ciudad> listarCiudades() {
		Connection conexion = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		List <Ciudad> ciudades = new ArrayList<>() ;
		try {
			conexion = getConexion();
			String sql = "SELECT idCiudad, nombre, provincia, pais, estado FROM ciudad";
			ps = conexion.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				Ciudad ciudad = new Ciudad();
				ciudad.setIdCiudad(rs.getInt("idCiudad"));
				ciudad.setNombre(rs.getString("nombre"));
				ciudad.setProvincia(rs.getString("provincia"));
				ciudad.setPais(rs.getString("pais"));
				ciudad.setEstado(rs.getBoolean("estado"));
				ciudades.add(ciudad);
			}
		} catch(SQLException ex) {
			JOptionPane.showMessageDialog (null, "Error al acceder a la tabla Ciudad.");
		} finally {
			closeResultSet(rs);
			closePreparedStatement(ps);
		    closeConnection(conexion);
		}
		return ciudades;
	}
}
