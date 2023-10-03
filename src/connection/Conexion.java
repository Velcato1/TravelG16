
import java.sql.*;
import javax.swing.*;


public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "paqueteturistico";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
    private Conexion() {}
    
    public static Connection getConexion(){
        
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
                JOptionPane.showMessageDialog(null, "Conectado");
            } catch(ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "Error al cargar los drivers " + ex.getMessage());
            } catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la DB " + ex.getMessage());
            }
        }
        return connection;
    }         
}





