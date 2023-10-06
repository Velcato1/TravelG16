package models;

public class Ciudad {
	private Integer idCiudad;
	private String nombre;
	private String provincia;
	private String pais;
	private Boolean estado;

	public Ciudad(){}

	public Ciudad(Integer idCiudad, String nombre, String provincia, String pais) {
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.provincia = provincia;
		this.pais = pais;
		this.estado = true;
	}


	public Ciudad(String nombre, String provincia, String pais) {
		this.nombre = nombre;
		this.provincia = provincia;
		this.pais = pais;
		this.estado = true;
	}

	public Integer getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return """
				ID: %d
				Nombre: %s
				Provincia: %s
				Pais: %s
				Estado: %s
				""".formatted(idCiudad, nombre, provincia, pais, estado);
	}
}
