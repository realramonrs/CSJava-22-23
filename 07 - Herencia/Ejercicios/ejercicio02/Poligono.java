/**
 * 
 */
package ejercicio1;

/**
 * @author Ramon RS
 *
 */
public class Poligono extends Figura{

	private int numLados;
	private double longitud;
	public Poligono(String nombre,int nLados,double longitud) {
		super(nombre,nLados*longitud);
		// TODO Auto-generated constructor stub
		this.numLados=nLados;
		this.longitud = longitud;
	}
	public int getNumLados() {
		return numLados;
	}
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	@Override
	public String toString() {
		return "Poligono [numLados=" + numLados + ", longitud=" + longitud + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
