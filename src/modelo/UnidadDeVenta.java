package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class UnidadDeVenta {
	protected int idUnidad;
	protected String nombreComercial;
	protected float superficie;
	protected String codigoUnico;
	protected Staff responsable;
	protected List<Staff> lstStaffs;
	protected List<Plato> lstPlatos;
	protected List<Pedido> lstPedidos;

	public UnidadDeVenta(int idUnidad, String nombreComercial, float superficie,
			String codigoUnico, Staff responsable) {
		super();
		this.idUnidad = idUnidad;
		this.nombreComercial = nombreComercial;
		this.superficie = superficie;
		this.codigoUnico = codigoUnico;
		this.responsable = responsable;
		this.lstStaffs = new ArrayList<Staff>();
		this.lstPlatos = new ArrayList<Plato>();
		this.lstPedidos = new ArrayList<Pedido>();
	}

	public int getIdUnidad() {
		return idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	public String getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public Staff getResponsable() {
		return responsable;
	}

	public void setResponsable(Staff responsable) {
		this.responsable = responsable;
	}

	public List<Staff> getLstStaff() {
		return lstStaffs;
	}

	public List<Plato> getLstPlatos() {
		return lstPlatos;
	}

	public List<Pedido> getLstPedidos() {
		return lstPedidos;
	}

	@Override
	public String toString() {
		return " [idUnidad=" + idUnidad + ", nombreComercial=" + nombreComercial
				+ ", superficie=" + superficie + ", codigoUnico=" + codigoUnico
				+ ", responsable=" + responsable + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadDeVenta other = (UnidadDeVenta) obj;
		return codigoUnico.equals(other.codigoUnico);
	}
}
