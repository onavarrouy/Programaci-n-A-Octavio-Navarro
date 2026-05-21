package paquete;

public abstract class Vehiculo {
	
	private String marca;
	private String modelo;
	private double kilometraje;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	public Vehiculo(String marca, String modelo, double kilometraje) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.kilometraje = kilometraje;
	}
	
	
	
	
	
	
}
