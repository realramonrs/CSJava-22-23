/**
 * 
 */
package ejercicio2;

/**
 * @author Ramon RS
 *
 */
public class Cama extends Mueble {

	int alto , ancho;

	public Cama(double precio,int alto , int ancho) {
		super("Cama", precio);
		this.alto = alto;
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	@Override
	public String toString() {
		return "Cama [alto=" + alto + ", ancho=" + ancho + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
