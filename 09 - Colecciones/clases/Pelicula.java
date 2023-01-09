package clases;

import java.util.Comparator;

public class Pelicula implements Comparable<Pelicula> {

	private String codigo;
	private String titulo;
	private double valoracion;
	public Pelicula(String codigo, String titulo, double valoracion) {
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.valoracion = valoracion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getValoracion() {
		return valoracion;
	}
	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}
	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + " valoracion: " + valoracion +"]";
	}
	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
//		return result;
		return this.codigo.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		Pelicula other = (Pelicula) obj;
	
		if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	@Override
	public int compareTo(Pelicula p) {
		// TODO Auto-generated method stub
		Double d = new Double(this.valoracion);
		return d.compareTo(p.valoracion);
	}
	
	public  static ComparaPelis generaComparator() {
		return new ComparaPelis();
	}
	static class ComparaPelis implements Comparator<Pelicula>{

		@Override
		public int compare(Pelicula arg0, Pelicula arg1) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
