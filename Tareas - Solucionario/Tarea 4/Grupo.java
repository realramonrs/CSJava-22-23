/**
 * 
 */
package tarea;

/**
 * @author Ramon RS
 *
 */
public class Grupo {

	private String nombre;
	int tiempoActuacion;
	int popularidad;
	float coste;
	
	public Grupo() {
		
	}
	public Grupo(String nombre, int tiempoActuacion, int popularidad, float coste) {
		super();
		this.nombre = nombre;
		this.tiempoActuacion = tiempoActuacion;
		setPopularidad(popularidad);
		this.coste = coste;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTiempoActuacion() {
		return tiempoActuacion;
	}
	public void setTiempoActuacion(int tiempoActuacion) {
		this.tiempoActuacion = tiempoActuacion;
	}
	public int getPopularidad() {
		return popularidad;
	}
	public void setPopularidad(int popularidad) {
		if(popularidad>0 && popularidad<10) {
		this.popularidad = popularidad;
		}
		else {
			this.popularidad = 0;
		}
	}
	public float getCoste() {
		return coste;
	}
	public void setCoste(float coste) {
		this.coste = coste;
	}
	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", tiempoActuacion=" + tiempoActuacion + ", popularidad=" + popularidad
				+ ", coste=" + coste + " coste total =" + calcularCosteTotal() + "]";
	}
	
	public float calcularCosteTotal() {
		float costeTotal = coste + (coste*popularidad) / 100.0f;
		return costeTotal;
	}
	
	
	
}
