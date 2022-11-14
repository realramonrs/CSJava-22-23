package objetosCompuestos;

public class Motor {

	private int cilindrada;
	private int nivelAceite;
	private boolean diesel;
	
	
	public Motor() {
		
		// TODO Auto-generated constructor stub
	}


	public Motor(int cilindrada, int nivelAceite, boolean diesel) {
		
		this.cilindrada = cilindrada;
		this.nivelAceite = nivelAceite;
		this.diesel = diesel;
		
	}


	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	public int getNivelAceite() {
		return nivelAceite;
	}


	public void setNivelAceite(int nivelAceite) {
		this.nivelAceite = nivelAceite;
	}


	public boolean isDiesel() {
		return diesel;
	}


	public void setDiesel(boolean diesel) {
		this.diesel = diesel;
	}


	@Override
	public String toString() {
		return "Motor [cilindrada=" + cilindrada + ", nivelAceite=" + nivelAceite + ", diesel=" + diesel + "]";
	}
	
	
	
	
}
