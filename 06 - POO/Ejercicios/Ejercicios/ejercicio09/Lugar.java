/**
 * 
 */
package ejercicio09;

/**
 * @author Ramon RS
 *
 */
public class Lugar {
	
	private String nombre;
	private String direccion;
	private GeoPunto posicion;
	private String telefono;
	private String comentario;
	private float valoracion;
	public Lugar(String nombre, String direccion, GeoPunto posicion, String telefono, String comentario,
			float valoracion) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.posicion = posicion;
		this.telefono = telefono;
		this.comentario = comentario;
		this.valoracion = valoracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public GeoPunto getPosicion() {
		return posicion;
	}
	public void setPosicion(GeoPunto posicion) {
		this.posicion = posicion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public float getValoracion() {
		return valoracion;
	}
	public void setValoracion(float valoracion) {
		this.valoracion = valoracion;
	}
	@Override
	public String toString() {
		return "Lugar [nombre=" + nombre + ", direccion=" + direccion + ", posicion=" + posicion + ", telefono="
				+ telefono + ", comentario=" + comentario + ", valoracion=" + valoracion + "]";
	}
	
	public static double calcularDistacia(Lugar l1 , Lugar l2) {
		return l1.getPosicion().distancia(l2.getPosicion());
	}
	
	
}
