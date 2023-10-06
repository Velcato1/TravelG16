package dao;

import static connect.Conexion.getConexion;
import java.sql.*;
import javax.swing.*;
import models.*;
import static utils.ManejoRecursos.closeConnection;
import static utils.ManejoRecursos.closePreparedStatement;
import static utils.ManejoRecursos.closeResultSet;

public class PaqueteData {
	
        public PaqueteData(){}
	public static void crearPaquete(PaqueteTuristico paquete) {
		Connection conexion = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			conexion = getConexion();
			String sql = "INSERT INTO pasaje (ciudadOrigen, ciudadDestino, alojamiento, pasaje, temporada, valorTotal, estado)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
			ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, paquete.getCiudadOrigen().getIdCiudad());
			ps.setInt(2, paquete.getCiudadDestino().getIdCiudad());
			ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
			ps.setInt(4, paquete.getPasaje().getIdPasaje());
			ps.setString(5, paquete.getTemporada().toString());
			double valorTotal = paquete.getPasaje().getImporte() + (paquete.getAlojamiento().getImporteDiario() * 10);
            ps.setDouble(6, valorTotal);
			ps.setBoolean(7, paquete.getEstado());
			ps.executeUpdate();
			rs =  ps.getGeneratedKeys();
			if (rs.next()) {
				paquete.setIdPaquete(rs.getInt(1));
				JOptionPane.showMessageDialog (null, "Paquete creado.");
			}
		} catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error al acceso a la base de datos");
		} finally {
			closeResultSet(rs);
			closePreparedStatement(ps);
			closeConnection(conexion);
		}
	}
}
