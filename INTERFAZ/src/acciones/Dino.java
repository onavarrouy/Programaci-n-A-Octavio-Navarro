package acciones;

public class Dino implements ACCIONES {

	String nombreDino;
	
	
	public String getNombreDino() {
		return nombreDino;
	}

	public void setNombreDino(String nombreDino) {
		this.nombreDino = nombreDino;
	}

	@Override
	public void comer() {
	System.out.println("El Dino esta comiendo 5 toneladas de milanesa");
		
	}

	@Override
	public void dormir() {
	System.out.println("El Dino esta durmiendo 48hrs...");
		
	}

	public Dino(String nombreDino) {
		super();
		this.nombreDino = nombreDino;
	}

}
