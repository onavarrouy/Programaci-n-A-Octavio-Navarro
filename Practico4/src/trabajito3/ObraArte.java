package trabajito3;

public abstract class ObraArte {

	private String autor;
	private String estilo;
	private String nombre;
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ObraArte(String autor, String estilo, String nombre) {
		super();
		this.autor = autor;
		this.estilo = estilo;
		this.nombre = nombre;
	}
	
	
}
