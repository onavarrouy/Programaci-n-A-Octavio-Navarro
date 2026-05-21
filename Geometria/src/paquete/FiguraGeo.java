package paquete;

public abstract class FiguraGeo {
	private double area;
	private double perimetro;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public FiguraGeo(double area, double perimetro) {
		super();
		this.area = area;
		this.perimetro = perimetro;
	}

}
