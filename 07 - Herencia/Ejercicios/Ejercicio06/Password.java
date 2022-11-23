package ejercicio6;

public abstract class Password implements Validator,Comparable<Password> {

	protected String cadena;

	public Password(String cadena) {
		super();
		setCadena(cadena);
	}

	public String getCadena() {
		return cadena;
	}

	//El método setCadena lo ponemos como abstracto ya que se debe validar el string
	//y enesta clase todavía no sabemos como hacerlo
	protected abstract void setCadena(String cadena);
		
	public abstract String getFortaleza();

	@Override
	public String toString() {
		return "Password [cadena=" + cadena + "] Fortaleza: " + this.getFortaleza();
	}
	
	@Override
	public int compareTo(Password o) {
		// TODO Auto-generated method stub
		return this.cadena.compareTo(o.cadena);
	}
	
}
