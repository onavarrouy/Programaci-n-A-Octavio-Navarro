package paquete;

public class Moto extends Vehiculo {

	private String tipoMoto;
	private int velocidadMax;
	private String tipoMotor;
	public String getTipoMoto() {
		return tipoMoto;
	}
	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}
	public int getVelocidadMax() {
		return velocidadMax;
	}
	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public Moto(String marca, String modelo, double kilometraje, String tipoMoto, int velocidadMax, String tipoMotor) {
		super(marca, modelo, kilometraje);
		this.tipoMoto = tipoMoto;
		this.velocidadMax = velocidadMax;
		this.tipoMotor = tipoMotor;
	}
	
	
	
	
	
	
	
	
	
}
