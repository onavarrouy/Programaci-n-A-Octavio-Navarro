package trabajito3;

public class Fotografia extends ObraArte {

	private String idFoto;
	private String tipoCamara;
	private String tipoLente;

	public String getIdFoto() {
		return idFoto;
	}

	public void setIdFoto(String idFoto) {
		this.idFoto = idFoto;
	}

	public String getTipoCamara() {
		return tipoCamara;
	}

	public void setTipoCamara(String tipoCamara) {
		this.tipoCamara = tipoCamara;
	}

	public String getTipoLente() {
		return tipoLente;
	}

	public void setTipoLente(String tipoLente) {
		this.tipoLente = tipoLente;
	}

	public Fotografia(String autor, String estilo, String nombre, String idFoto, String tipoCamara, String tipoLente) {
		super(autor, estilo, nombre);
		this.idFoto = idFoto;
		this.tipoCamara = tipoCamara;
		this.tipoLente = tipoLente;
	}

}
