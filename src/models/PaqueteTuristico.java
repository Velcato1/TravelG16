package models;

public class PaqueteTuristico {
	private Integer idPaquete;
	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	private Alojamiento alojamiento;
	private Pasaje pasaje;
	private Temporada temporada; // true = temporada alta || false = temporada baja
	private Integer cantidadPasajeros;
	private Double valorTotal = 0.0;

	private Boolean estado;


	public PaqueteTuristico() {}

	public PaqueteTuristico(Integer idPaquete, Ciudad ciudadOrigen, Ciudad ciudadDestino,
							Alojamiento alojamiento, Pasaje pasaje, Temporada temporada, Integer cantidadPasajeros, Double valorTotal) {
		this.idPaquete = idPaquete;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.alojamiento = alojamiento;
		this.pasaje = pasaje;
		this.temporada = temporada;
		this.cantidadPasajeros = 1;
		this.estado = true;
	}

	public PaqueteTuristico(Ciudad ciudadOrigen, Ciudad ciudadDestino, Alojamiento alojamiento,
							Pasaje pasaje, Temporada temporada) {
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.alojamiento = alojamiento;
		this.pasaje = pasaje;
		this.temporada = temporada;
		this.cantidadPasajeros = 1;
		this.estado = true;
	}

	public Integer getIdPaquete() {
		return idPaquete;
	}

	public void setIdPaquete(Integer idPaquete) {
		this.idPaquete = idPaquete;
	}

	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public Alojamiento getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(Alojamiento alojamiento) {
		this.alojamiento = alojamiento;
	}

	public Pasaje getPasaje() {
		return pasaje;
	}

	public void setPasaje(Pasaje pasaje) {
		this.pasaje = pasaje;
	}

	public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	public Integer getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(Integer cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
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
	}
}
