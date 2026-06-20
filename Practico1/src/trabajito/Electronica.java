package trabajito;

public class Electronica extends Producto {

	private String marcaElec;
	private double potenciaVatios;
	private double maximoVoltaje;
	public String getMarcaElec() {
		return marcaElec;
	}
	public void setMarcaElec(String marcaElec) {
		this.marcaElec = marcaElec;
	}
	public double getPotenciaVatios() {
		return potenciaVatios;
	}
	public void setPotenciaVatios(double potenciaVatios) {
		this.potenciaVatios = potenciaVatios;
	}
	public double getMaximoVoltaje() {
		return maximoVoltaje;
	}
	public void setMaximoVoltaje(double maximoVoltaje) {
		this.maximoVoltaje = maximoVoltaje;
	}
	public Electronica(int ID, String nombre, double precio, String marcaElec, double potenciaVatios, double maximoVoltaje) {
		super(ID, nombre, precio);
		this.marcaElec = marcaElec;
		this.potenciaVatios = potenciaVatios;
		this.maximoVoltaje = maximoVoltaje;
	}
	
	
	
}
