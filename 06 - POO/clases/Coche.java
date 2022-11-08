package clases;

public class Coche {

	private String marca;
	private String modelo;
	private float precio;
	private Motor motor;
	
	
	
	public Coche(String marca, String modelo, float precio, Motor motor) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.motor = motor;
	}
	
public Coche(String marca, String modelo, float precio,float aceite, float temp , float revoluciones) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.motor = new Motor(aceite,temp,revoluciones);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Coche [" + (marca != null ? "marca=" + marca + ", " : "")
				+ (modelo != null ? "modelo=" + modelo + ", " : "") + "precio=" + precio + ", "
				+ (motor != null ? "motor=" + motor : "") + "]";
	}
	
	
	
	
}
