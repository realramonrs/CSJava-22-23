public class Circulo extends Figura {

	float radio;
	public Circulo(float radio) {
		super("Circulo");
		this.radio = radio;
		
	}

	
	public float calcularArea() {
		return (float)Math.PI*radio*radio;
	}
}
