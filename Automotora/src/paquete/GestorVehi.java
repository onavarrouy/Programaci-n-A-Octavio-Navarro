package paquete;

public class GestorVehi {

	public static void main(String[] args) {
	
		Moto moto1 = new Moto ("Kawasaki", "Ninja", 20.000, "Deportiva", 280, "4 tiempos");
		System.out.println(moto1.getMarca());
		System.out.println(moto1.getModelo());
		System.out.println(moto1.getKilometraje());
		System.out.println(moto1.getTipoMoto());
		System.out.println(moto1.getVelocidadMax());
		System.out.println(moto1.getTipoMotor());
		
		Auto auto1 = new Auto ("Chevrolet", "Onix", 20.000, "Urbano", 4, 2);
		System.out.println(auto1.getMarca());
		System.out.println(auto1.getModelo());
		System.out.println(auto1.getKilometraje());
		System.out.println(auto1.getTipoAuto());
		System.out.println(auto1.getCantidadAsientos());
		System.out.println(auto1.getCantidadAirbags());

	}

}
