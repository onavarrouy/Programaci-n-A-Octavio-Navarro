package trabajito;

public class Alimentos extends Producto {

	private String marcaAlimento;
	private double calorias;
	private double peso;
	public String getMarcaAlimento() {
		return marcaAlimento;
	}
	public void setMarcaAlimento(String marcaAlimento) {
		this.marcaAlimento = marcaAlimento;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Alimentos(int ID, String nombre, double precio, String marcaAlimento, double calorias, double peso) {
		super(ID, nombre, precio);
		this.marcaAlimento = marcaAlimento;
		this.calorias = calorias;
		this.peso = peso;
	}
	
	
	
}

