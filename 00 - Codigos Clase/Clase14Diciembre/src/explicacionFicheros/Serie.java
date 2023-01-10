package explicacionFicheros;

public class Serie {

	private String titulo;
	private float valoracion;
	public Serie(String titulo, float valoracion) {
		super();
		this.titulo = titulo;
		this.valoracion = valoracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getValoracion() {
		return valoracion;
	}
	public void setValoracion(float valoracion) {
		this.valoracion = valoracion;
	}
	
	public String volcarfichero() {
		return titulo + "#" + valoracion;
	}
}
