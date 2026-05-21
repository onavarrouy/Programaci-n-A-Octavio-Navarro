package paquete;

public abstract class Persona {

	private String nombre;
	private String apellido;
	private int CI;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCI() {
		return CI;
	}

	public void setCI(int cI) {
		CI = cI;
	}

	public Persona(String nombre, String apellido, int cI) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		CI = cI;
	}

}
