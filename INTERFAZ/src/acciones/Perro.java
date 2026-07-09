package acciones;

public class Perro implements ACCIONES {

	String nombre;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void comer() {
	System.out.println("El perro esta comiendo 5 gramos de pollo");
		
	}

	@Override
	public void dormir() {
	System.out.println("El perro esta durmiendo 9hrs");
	
	}

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

}
