package objetosCompuestos;

public class Coche {

	private String marca;
	
	private Motor motor;
	
	public Coche(String marca,Motor motor) {
		this.marca = marca;
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", motor=" + motor + "]";
	}
	
	
}
