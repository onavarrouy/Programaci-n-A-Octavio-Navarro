package trabajito2;

public class Casa extends Edificio{

	private double metrosCuadrados;
	private int numeroPisos;
	private int codigoPostal;
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public int getNumeroPisos() {
		return numeroPisos;
	}
	public void setNumeroPisos(int numeroPisos) {
		this.numeroPisos = numeroPisos;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public Casa(String nombre, String direccion, double metrosCuadrados, int numeroPisos, int codigoPostal) {
		super(nombre, direccion);
		this.metrosCuadrados = metrosCuadrados;
		this.numeroPisos = numeroPisos;
		this.codigoPostal = codigoPostal;
	}


	
	
	}
	
	
	
	
	
