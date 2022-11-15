package ejercicio10;

public class Ingrediente {
	private String nombre;
	private float cantidad;
	private float precioKilo;
	private int calorias;
	
	//Constructores
	public Ingrediente(String nombre, float cantidad, float precioKilo, int calorias) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precioKilo = precioKilo;
		this.calorias = calorias;
	}

	//Métodos de acceso
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioKilo() {
		return precioKilo;
	}

	public void setPrecioKilo(float precioKilo) {
		this.precioKilo = precioKilo;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", cantidad=" + cantidad + " gramos, precioKilo=" + precioKilo + "€/Kg, calorias="
				+ calorias + "\n";
	}
	
	
	
	
	

}
