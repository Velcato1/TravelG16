
package application;

import models.*;

import java.sql.*;


public class UserApp {

	public static Connection conexion;

	public static void main(String[] args) {
		Ciudad ciudad1 = new Ciudad("Mar del Plata", "Buenos Aires", "Argentina");
		Ciudad ciudad2 = new Ciudad("CABA", "Buenos Aires", "Argentina");
		Ciudad ciudad3 = new Ciudad("Carlos Paz", "Cordoba", "Argentina");
		Ciudad ciudad4 = new Ciudad("Bariloche", "Rio Negro", "Argentina");

//		CiudadData.cargarCiudad(ciudad1);
//		CiudadData.cargarCiudad(ciudad2);
//		CiudadData.cargarCiudad(ciudad3);
//		CiudadData.cargarCiudad(ciudad4);

//		LocalDate checkIn = LocalDate.of(2023, 10, 6);
//		LocalDate checkOut = LocalDate.of(2023, 10, 20);
//		Alojamiento alojamiento1 = new Alojamiento("Hotel Presidente", checkIn, checkOut,
//				"5 Estrellas", 35_000.00, ciudad1);
//
//		AlojamientoData.cargarAlojamiento(alojamiento1);
//
//
//		Pasaje pasaje1 = new Pasaje(TipoTransporte.AVION, 50_000.00, ciudad2, ciudad3);
//		PasajeData.crearPasaje(pasaje1);

//		PaqueteTuristico paquete1 = new PaqueteTuristico(ciudad3, ciudad2,
//				alojamiento1, pasaje1, Temporada.ALTA);
//
//		PaqueteData.crearPaquete(paquete1);

	}
}



