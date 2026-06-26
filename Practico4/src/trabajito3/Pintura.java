package trabajito3;

public class Pintura extends ObraArte {

	private String movimientoArtistico;
	private String ubicacionPintura;
	private boolean enExhibicion;

	public String getMovimientoArtistico() {
		return movimientoArtistico;
	}

	public void setMovimientoArtistico(String movimientoArtistico) {
		this.movimientoArtistico = movimientoArtistico;
	}

	public String getUbicacionPintura() {
		return ubicacionPintura;
	}

	public void setUbicacionPintura(String ubicacionPintura) {
		this.ubicacionPintura = ubicacionPintura;
	}

	public boolean getEnExhibicion() {
		return enExhibicion;
	}

	public void setEnExhibicion(boolean enExhibicion) {
		this.enExhibicion = enExhibicion;
	}

	public Pintura(String autor, String estilo, String nombre, String movimientoArtistico, String ubicacionPintura,
			boolean enExhibicion) {
		super(autor, estilo, nombre);
		this.movimientoArtistico = movimientoArtistico;
		this.ubicacionPintura = ubicacionPintura;
		this.enExhibicion = enExhibicion;
	}

}
