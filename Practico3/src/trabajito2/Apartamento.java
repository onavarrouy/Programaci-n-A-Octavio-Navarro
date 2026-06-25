package trabajito2;

public class Apartamento extends Edificio {

	private int nroApartamento;
	private int nroHabitaciones;
	private int nroBanios;
	public int getNroApartamento() {
		return nroApartamento;
	}
	public void setNroApartamento(int nroApartamento) {
		this.nroApartamento = nroApartamento;
	}
	public int getNroHabitaciones() {
		return nroHabitaciones;
	}
	public void setNroHabitaciones(int nroHabitaciones) {
		this.nroHabitaciones = nroHabitaciones;
	}
	public int getNroBanios() {
		return nroBanios;
	}
	public void setNroBanios(int nroBanios) {
		this.nroBanios = nroBanios;
	}
	public Apartamento(String nombre, String direccion, int nroApartamento, int nroHabitaciones, int nroBanios) {
		super(nombre, direccion);
		this.nroApartamento = nroApartamento;
		this.nroHabitaciones = nroHabitaciones;
		this.nroBanios = nroBanios;
	}
	
	
	
	
	
	
	
	
}
