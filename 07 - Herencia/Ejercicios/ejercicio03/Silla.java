/**
 * 
 */
package ejercicio2;

/**
 * @author Ramon RS
 *
 */
public class Silla extends Mueble {

	private String color;

	public Silla(double precio , String color) {
		super("Silla", precio);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Silla [color=" + color + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
