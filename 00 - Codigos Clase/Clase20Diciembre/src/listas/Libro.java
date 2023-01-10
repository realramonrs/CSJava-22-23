package listas;

public class Libro implements Comparable<Libro> {
	private String titulo;
	private String autor;
	private float precio;
	private float valoracion;
	public Libro(String titulo, String autor, float precio, float valoracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.valoracion = valoracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getValoracion() {
		return valoracion;
	}
	public void setValoracion(float valoracion) {
		this.valoracion = valoracion;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", valoracion=" + valoracion
				+ "]";
	}
	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.titulo.compareTo(o.getTitulo());
	}
	
	
	
	

}
