package paquete;

public class triangulo extends FiguraGeo {

	private double ladoA;
	private double ladoB;
	private double ladoC;
	private double altura;
	private double angulo;

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

	public triangulo (double area, double perimetro, double ladoA, double ladoB, double ladoC, double altura, double angulo) {
		super(area, perimetro);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.altura = altura;
		this.angulo = angulo;
	}

}
