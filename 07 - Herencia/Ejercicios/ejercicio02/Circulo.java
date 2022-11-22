/**
 * 
 */
package ejercicio1;

/**
 * @author Ramon RS
 *
 */
public class Circulo extends Figura{

	private double radio;

	public Circulo(double radio) {
		super("Circulo", 2*Math.PI*radio);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
