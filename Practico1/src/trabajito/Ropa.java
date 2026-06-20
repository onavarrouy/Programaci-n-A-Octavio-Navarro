package trabajito;

public class Ropa extends Producto {

	private String marcaRopa;
	private String tipoTela;
	private String talle;
	public String getMarcaRopa() {
		return marcaRopa;
	}
	public void setMarcaRopa(String marcaRopa) {
		this.marcaRopa = marcaRopa;
	}
	public String getTipoTela() {
		return tipoTela;
	}
	public void setTipoTela(String tipoTela) {
		this.tipoTela = tipoTela;
	}
	public String getTalle() {
		return talle;
	}
	public void setTalle(String talle) {
		this.talle = talle;
	}
	public Ropa(int ID, String nombre, double precio, String marcaRopa, String tipoTela, String talle) {
		super(ID, nombre, precio);
		this.marcaRopa = marcaRopa;
		this.tipoTela = tipoTela;
		this.talle = talle;
	}
	
	
	
	
	
}
