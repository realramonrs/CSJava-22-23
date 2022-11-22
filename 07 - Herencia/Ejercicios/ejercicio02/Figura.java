/**
 * 
 */
package ejercicio1;

/**
 * @author Ramon RS
 *
 */
public class Figura {

	private String nombre;
	private double perimetro;
	
	public Figura(String nombre, double perimetro) {
		super();
		this.nombre = nombre;
		this.perimetro = perimetro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", perimetro=" + perimetro + "]";
	}
	
	
	
	
}
