package clases;

public class Pelicula extends Ocio {

	private String codigo;
	private String director;
	private int tiempo;
	public Pelicula(String codigo, String titulo, double precio,String director) {
		super(titulo, precio);
		this.codigo = codigo;
		this.director = director;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return super.toString() + "Pelicula [codigo=" + codigo + ", director=" + director + "]";
	}	
	

}
