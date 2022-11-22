package ejercicio5;

public class Linea2D implements Relationable {

	private Punto p1;
	private Punto p2;
	private float distancia;
	
		
	public Linea2D(int x1,int y1,int x2, int y2) {
		p1 = new Punto(x1,y1);
		p2 = new Punto(x2,y2);
		calcularDistancia();
	}
	
	public Linea2D(Punto p1, Punto p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		calcularDistancia();
	}
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	public float getDistancia() {
		return distancia;
	}
	
	public void calcularDistancia() {
		this.distancia = (float)(Math.sqrt(Math.pow(p2.getX()-p1.getX(),2) + Math.pow(p2.getY()-p1.getY(),2)));
	}

	@Override
	public boolean esMayorQue(Object o2) {
		// TODO Auto-generated method stub
		return this.distancia>((Linea2D)o2).distancia;
	}

	@Override
	public boolean esMenorQue(Object o2) {
		// TODO Auto-generated method stub
		return this.distancia<((Linea2D)o2).distancia;
	}

	@Override
	public boolean esIgualQue(Object o2) {
		// TODO Auto-generated method stub
		return this.distancia==((Linea2D)o2).distancia;
	}
	
	
	
}
