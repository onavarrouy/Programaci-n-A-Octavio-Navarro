package trabajito3;

public class Escultura extends ObraArte {

	private String tipoMaterial;
	private String ubicacionEscultura;
	private double peso;

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public String getUbicacionEscultura() {
		return ubicacionEscultura;
	}

	public void setUbicacionEscultura(String ubicacionEscultura) {
		this.ubicacionEscultura = ubicacionEscultura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Escultura(String autor, String estilo, String nombre, String tipoMaterial, String ubicacionEscultura,
			double peso) {
		super(autor, estilo, nombre);
		this.tipoMaterial = tipoMaterial;
		this.ubicacionEscultura = ubicacionEscultura;
		this.peso = peso;
	}

}