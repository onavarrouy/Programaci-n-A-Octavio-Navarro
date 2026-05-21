package paquete;

public class Profesor extends Persona {

	private double salario;
	private int grado;
	private String materia;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Profesor(String nombre, String apellido, int cI, double salario, int grado, String materia) {
		super(nombre, apellido, cI);
		this.salario = salario;
		this.grado = grado;
		this.materia = materia;
	}

}
