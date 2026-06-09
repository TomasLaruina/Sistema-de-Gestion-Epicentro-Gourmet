package modelo;

import java.time.LocalDate;

public class Cajero extends Staff {
	private Turno turno;

	public Cajero(int idStaff, String nombre, String apellido, long dni, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, Turno turno) {
		super(idStaff, nombre, apellido, dni, fechaNacimiento, fechaIngreso);
		this.turno = turno;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	@Override
	public float calcularHaberes(Costo costo) {
		return costo.getSueldoBase() + (calcularAntiguedad() * costo.getPlusPorAnioAntiguedad());
	}

	@Override
	public String toString() {
		return "Cajero" + super.toString() + "[turno=" + turno + "]";
	}
}
