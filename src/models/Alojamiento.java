package models;

import java.time.*;

public class Alojamiento {
	private Integer idAlojamiento;

	private String nombre;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private String servicio;
	private Double importeDiario;
	private Ciudad ciudadDestino;
	private Boolean estado;

	public Alojamiento() {}

	public Alojamiento(Integer idAlojamiento, String nombre, LocalDate checkIn, LocalDate checkOut,
					   String servicio, Double importeDiario, Ciudad ciudadDestino) {

		this.idAlojamiento = idAlojamiento;
		this.nombre = nombre;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.servicio = servicio;
		this.importeDiario = importeDiario;
		this.ciudadDestino = ciudadDestino;
		this.estado = true;
	}



	public Alojamiento(String nombre, LocalDate checkIn, LocalDate checkOut,
					   String servicio, Double importeDiario, Ciudad ciudadDestino) {

		this.nombre = nombre;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.servicio = servicio;
		this.importeDiario = importeDiario;
		this.ciudadDestino = ciudadDestino;
		this.estado = true;
	}

	public Integer getIdAlojamiento() {
		return idAlojamiento;
	}

	public void setIdAlojamiento(Integer idAlojamiento) {
		this.idAlojamiento = idAlojamiento;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public Double getImporteDiario() {
		return importeDiario;
	}

	public void setImporteDiario(Double importeDiario) {
		this.importeDiario = importeDiario;
	}

	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
return "";
//				ID: %d
//				Nombre: %s
//				Checking: %s
//				Checkout: %s
//				Servicio: %s
//				Diaria: %,.2f
//				Ciudad de Destino: %s
//				""".formatted(idAlojamiento, nombre, checkIn, checkOut,
//				servicio, importeDiario, ciudadDestino.getNombre());
	}
}
