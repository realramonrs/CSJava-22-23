
public abstract class Figura implements Comparable<Figura> {

	private String nombre;

	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		
		Float area1 = Float.valueOf(o.calcularArea());
		Float area2 = Float.valueOf(this.calcularArea());
		return area2.compareTo(area1);
	}
	
	public abstract float calcularArea();
}
