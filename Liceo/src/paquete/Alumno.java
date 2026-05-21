package paquete;

public class Alumno extends Persona {
	
	private int inasistencias;
	private int calificacion;
	private String asignaturas;
	public int getInasistencias() {
		return inasistencias;
	}
	public void setInasistencias(int inasistencias) {
		this.inasistencias = inasistencias;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public String getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String asignaturas) {
		this.asignaturas = asignaturas;
	}
	public Alumno(String nombre, String apellido, int cI, int inasistencias, int calificacion, String asignaturas) {
		super(nombre, apellido, cI);
		this.inasistencias = inasistencias;
		this.calificacion = calificacion;
		this.asignaturas = asignaturas;
	}
	
	
	
	
	
	
	
	}
