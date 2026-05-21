package paquete;

public class Auto extends Vehiculo {
	
private	String tipoAuto;
private int cantidadAsientos;
private int cantidadAirbags;
public String getTipoAuto() {
	return tipoAuto;
}
public void setTipoAuto(String tipoAuto) {
	this.tipoAuto = tipoAuto;
}
public int getCantidadAsientos() {
	return cantidadAsientos;
}
public void setCantidadAsientos(int cantidadAsientos) {
	this.cantidadAsientos = cantidadAsientos;
}
public int getCantidadAirbags() {
	return cantidadAirbags;
}
public void setCantidadAirbags(int cantidadAirbags) {
	this.cantidadAirbags = cantidadAirbags;
}
public Auto(String marca, String modelo, double kilometraje, String tipoAuto, int cantidadAsientos,
		int cantidadAirbags) {
	super(marca, modelo, kilometraje);
	this.tipoAuto = tipoAuto;
	this.cantidadAsientos = cantidadAsientos;
	this.cantidadAirbags = cantidadAirbags;
}

}
