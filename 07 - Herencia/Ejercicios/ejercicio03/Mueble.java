/**
 * 
 */
package ejercicio2;

/**
 * @author Ramon RS
 *
 */
public class Mueble {

	private String nombre;
	private double precio;
	
	public Mueble(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Mueble [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
}
