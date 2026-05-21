package paquete;

public class Director extends Persona {

	private double sueldo;
	private int horario;
	private int docentesACargo;

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public int getDocentesACargo() {
		return docentesACargo;
	}

	public void setDocentesACargo(int docentesACargo) {
		this.docentesACargo = docentesACargo;
	}

	public Director(String nombre, String apellido, int cI, double sueldo, int horario, int docentesACargo) {
		super(nombre, apellido, cI);
		this.sueldo = sueldo;
		this.horario = horario;
		this.docentesACargo = docentesACargo;

	}

}
