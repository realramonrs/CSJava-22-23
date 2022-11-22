package ejercicio5;

public class Circulo implements Relationable {

	private float radio;
	private float area;
	public Circulo(float radio) {
		super();
		this.radio = radio;
		calcularArea();
	}
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	public float getArea() {
		return area;
	}
	
	private void calcularArea() {
		this.area = (float)Math.PI*radio*radio;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", area=" + area + "]";
	}
	@Override
	public boolean esMayorQue(Object o2) {
		// TODO Auto-generated method stub
		return this.area>((Circulo)o2).getArea();
	}
	@Override
	public boolean esMenorQue(Object o2) {
		// TODO Auto-generated method stub
		return this.area<((Circulo)o2).getArea();
	}
	@Override
	public boolean esIgualQue(Object o2) {
		// TODO Auto-generated method stub
		return this.area==((Circulo)o2).getArea();
	}
	
	
}
