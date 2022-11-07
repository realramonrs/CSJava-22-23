package clases;

public class Motor {

	private float nivelAceite;
	private float temperatura;
	private float revoluciones;
	
	public Motor(float nivelAceite, float temperatura, float revoluciones) {
		
		this.nivelAceite = nivelAceite;
		this.temperatura = temperatura;
		this.revoluciones = revoluciones;
	}

	public float getNivelAceite() {
		return nivelAceite;
	}

	public void setNivelAceite(float nivelAceite) {
		this.nivelAceite = nivelAceite;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getRevoluciones() {
		return revoluciones;
	}

	public void setRevoluciones(float revoluciones) {
		this.revoluciones = revoluciones;
	}

	@Override
	public String toString() {
		return "Motor [nivelAceite=" + nivelAceite + ", temperatura=" + temperatura + ", revoluciones=" + revoluciones
				+ "]";
	}
	
	
	
	
}
