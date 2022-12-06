/**
 * 
 */
package ejerciciosTema;

import java.io.Serializable;

/**
 * @author Ramon RS
 *
 */
public class Serie implements Serializable {

	private String titulo;
	private String plataforma;
	private float valoracion;
	private int capitulos;
	private String genero;
	private int anho;
	
	public Serie() {
		
	}
	public Serie(String titulo, String plataforma, int capitulos, String genero, int anho) {
		super();
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.capitulos = capitulos;
		this.genero = genero;
		this.anho = anho;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public float getValoracion() {
		return valoracion;
	}
	public void setValoracion(float valoracion) {
		this.valoracion = valoracion;
	}
	public int getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAnho() {
		return anho;
	}
	public void setAnho(int anho) {
		this.anho = anho;
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", plataforma=" + plataforma + ", valoracion=" + valoracion + ", capitulos="
				+ capitulos + ", genero=" + genero + ", anho=" + anho + "]";
	}
	
	public String volcarFichero() {
		return titulo + "#" + plataforma + "#" + valoracion + "#" + capitulos + "#" + genero + "#" + anho;
	}
	
	
}
