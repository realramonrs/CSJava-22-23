
public class Triangulo extends Poligono {

	private float base;
	private float altura;
	public Triangulo(float base,float altura) {
		super("Triangulo");
		this.base = base;
		this.altura = altura;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularAnguloMaximo() {
		// TODO Auto-generated method stub
		return 90;
	}
	
	public float calcularArea() {
		// TODO Auto-generated method stub
		return base*altura/2;
	}
	
	

	
}
