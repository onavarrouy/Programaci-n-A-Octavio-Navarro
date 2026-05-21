package paquete;

public class circulo extends FiguraGeo {
	
	private double radio;
	private double diametro;
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public circulo(double area, double perimetro, double radio, double diametro) {
		super(area, perimetro);
		this.radio = radio;
		this.diametro = diametro;
	}
	

}
