package ejercicio02;

public class Estadio {

	private String nombre;
	private int capacidad;
	private String ciudad;
	
	//Apartado A : Constructor.
	public Estadio(String nombre, int capacidad, String ciudad) {
		
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", capacidad=" + capacidad + ", ciudad=" + ciudad + "]";
	}
	
	//
	
	
}
