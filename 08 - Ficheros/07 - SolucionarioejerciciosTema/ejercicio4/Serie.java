package ejercicio2;

public class Serie {

	// Atributos
	private String titulo;
	private String plataforma;
	private int valoracion;
	private int capitulos;
	private String genero;
	private int anho;
	
	// Constructores
	public Serie() {
		
	}
	public Serie(String titulo, String plataforma, int capitulos, String genero, int anho) {
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.capitulos = capitulos;
		this.genero = genero;
		this.anho = anho;
		this.valoracion = 0;
	}
	
	// Métodos de acceso
	// Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}	
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setAnho(int anho) {
		this.anho = anho;
	}
	// Getters
	public String getTitulo() {
		return titulo;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public int getValoracion() {
		return valoracion;
	}
	public int getCapitulos() {
		return capitulos;
	}
	public String getGenero() {
		return genero;
	}
	public int getAnho() {
		return anho;
	}
	
	// Método toString()
	@Override
	public String toString() {
		return titulo + "#" + plataforma + "#" + valoracion + "#" + capitulos + "#" + genero + "#" + anho;
	}
	
}
