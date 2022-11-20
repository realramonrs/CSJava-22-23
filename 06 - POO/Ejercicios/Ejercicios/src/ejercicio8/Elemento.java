package ejercicio8;

public class Elemento {
	private String nombre;
	private String simbolo;
	private float densidad;
	private float temperaturaFusion;
	private float temperaturaEbullicion;
	
	public Elemento(String nombre, String simbolo, float densidad, float temperaturaFusion, float temperaturaEbullicion) {
		
		setNombre(nombre);
		this.simbolo = simbolo;
		this.densidad = densidad;
		this.temperaturaFusion = temperaturaFusion;
		this.temperaturaEbullicion = temperaturaEbullicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase(); //Lo pasamos a mayúsculas
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		
		this.simbolo = simbolo.toUpperCase();
	}

	public float getDensidad() {
		return densidad;
	}

	public void setDensidad(float densidad) {
		this.densidad = densidad;
	}

	public float getTemperaturaFusion() {
		return temperaturaFusion;
	}

	public void setTemperaturaFusion(float temperaturaFusion) {
		this.temperaturaFusion = temperaturaFusion;
	}

	public float getTemperaturaEbullicion() {
		return temperaturaEbullicion;
	}

	public void setTemperaturaEbullicion(float temperaturaEbullicion) {
		this.temperaturaEbullicion = temperaturaEbullicion;
	}

	@Override
	public String toString() {
		return "Mezcla [nombre=" + nombre + ", simbolo=" + simbolo + ", densidad=" + densidad + ", temperaturaFusion="
				+ temperaturaFusion + ", temperaturaEbullicion=" + temperaturaEbullicion + "]";
	}

}
