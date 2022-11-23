package ejercicio04;

public class SospechosoCoronavirus extends Paciente {

	boolean infectado;
	boolean realizadoTest;

	public SospechosoCoronavirus(String dni, String nombre, int edad) {
		super(dni, nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public boolean isInfectado() {
		return infectado;
	}

	public void setInfectado(boolean infectado) {
		this.infectado = infectado;
	}

	public boolean isRealizadoTest() {
		return realizadoTest;
	}

	public void setRealizadoTest(boolean realizadoTest) {
		this.realizadoTest = realizadoTest;
	}

	@Override
	public String toString() {
		return "SospechosoCoronavirus [infectado=" + infectado + ", realizadoTest=" + realizadoTest + ", toString()="
				+ super.toString() + "]";
	}
	
	public void realizarTest() {
		this.realizadoTest = true;
		int aleatorio =(int)Math.round(Math.random());
		if(aleatorio==1) {
			infectado = true;
		}
	}
	
	public void curar() {
		this.infectado = false;
	}
	
	

}
