/**
 * 
 */
package ejercicio2;

/**
 * @author Ramon RS
 *
 */
public class Mesa extends Mueble {

	private String forma;
	private int numPlazas;
	public Mesa(double precio,String forma , int plazas) {
		super("Mesa", precio);
		this.forma = forma;
		this.numPlazas = plazas;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	@Override
	public String toString() {
		return "Mesa [forma=" + forma + ", numPlazas=" + numPlazas + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
