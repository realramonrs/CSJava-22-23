package ejercicio04;

public class Paciente {

	private String dni;
	private String nombre;
	private int edad;
	private String enfermedad;
	public Paciente(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEnfermedad() {
		return enfermedad;
	}
	public void diagnosticar(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	@Override
	public String toString() {
		return "Paciente [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", enfermedad=" + enfermedad + "]";
	}
	
	
	
	
}
