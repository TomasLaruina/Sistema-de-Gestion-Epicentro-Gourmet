package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.time.Period;

public class Sistema {
	private List<UnidadDeVenta> lstUnidades;
	private List<Festival> lstFestivales;
	private List<Staff> lstStaffs;

	public Sistema() {
		this.lstUnidades = new ArrayList<UnidadDeVenta>();
		this.lstFestivales = new ArrayList<Festival>();
		this.lstStaffs = new ArrayList<Staff>();
	}

	public List<UnidadDeVenta> getUnidades() {
		return lstUnidades;
	}

	public List<Festival> getFestivales() {
		return lstFestivales;
	}

	public List<Staff> getStaff() {
		return lstStaffs;
	}
	
	@Override
	public String toString() {
		return "Sistema [unidades=" + lstUnidades + ", festivales="
				+ lstFestivales + ", staff=" + lstStaffs + "]";
	}

}
