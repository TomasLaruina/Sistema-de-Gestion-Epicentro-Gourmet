package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Festival {
	private int idFestival;
	private String nombre;
	private Temporada temporada;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Costo costosLocales;
	private List<UnidadDeVenta> lstUnidadesDeVentas;

	public Festival(int idFestival, String nombre, Temporada temporada, LocalDate fechaInicio, LocalDate fechaFin, Costo costosLocales) {
		this.idFestival = idFestival;
		this.nombre = nombre;
		this.temporada = temporada;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.costosLocales = costosLocales;
		this.lstUnidadesDeVentas = new ArrayList<UnidadDeVenta>();
	}

	public int getIdFestival() {
		return idFestival;
	}

	public void setIdFestival(int idFestival) {
		this.idFestival = idFestival;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Costo getCostosLocales() {
		return costosLocales;
	}

	public void setCostosLocales(Costo costosLocales) {
		this.costosLocales = costosLocales;
	}

	public List<UnidadDeVenta> getLstUnidadesDeVentas() {
		return lstUnidadesDeVentas;
	}
	
	public boolean agregarUnidadDeVenta(UnidadDeVenta unidad) {

		if(traerUnidadDeVenta(unidad.getCodigoUnico()) != null) {
			throw new IllegalArgumentException("Error: ya existe una unidad con ese codigo en el festival");
		}

		return lstUnidadesDeVentas.add(unidad);
	}
	
	public boolean eliminarUnidadDeVenta(String codigoUnico) {
		UnidadDeVenta encontrado = traerUnidadDeVenta(codigoUnico);

		if(encontrado == null) {
			return false;
		}

		return lstUnidadesDeVentas.remove(encontrado);
	}


	@Override
	public String toString() {
		return "Festival [idFestival=" + idFestival + ", nombre=" + nombre + ", temporada=" + temporada
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", costosLocales="
				+ costosLocales + ", unidadesDeVentas=" + lstUnidadesDeVentas + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Festival other = (Festival) obj;
		return idFestival == other.idFestival;
	}
}

