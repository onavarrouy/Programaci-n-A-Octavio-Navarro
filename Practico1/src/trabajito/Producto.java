package trabajito;

public abstract class Producto {

	private int ID;
	private String nombre;
	private double precio;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Producto(int ID, String nombre, double precio) {
		super();
		this.ID= ID;
		this.nombre = nombre;
		this.precio = precio;
	}
	
}
	

