
public class Rectangulo extends Figura {

	private float lMayor;
	private float lMenor;
	public Rectangulo(float lMayor,float lMenor) {
		super("Rectangulo");
		this.lMayor = lMayor;
		this.lMenor = lMenor;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return lMayor*lMenor;
	}

	
}
