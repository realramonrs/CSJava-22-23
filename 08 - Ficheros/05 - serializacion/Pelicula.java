package serializacion;

import java.io.Serializable;

public class Pelicula implements Serializable {

	private String titulo;
	private String director;
	private double valoracion;
	
		
	public Pelicula(String titulo, String director, double valoracion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.valoracion = valoracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getValoracion() {
		return valoracion;
	}
	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}
	@Override
	public String toString() {
		return titulo + " , " + director + " , " + valoracion;
	}
	
	
	
	
}
