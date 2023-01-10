/**
 * 
 */
package ejercicios;

/**
 * @author Ramon RS
 *
 */
public class Contacto implements Comparable<Contacto>{
	private String nombre;
	private String correo;
	private String telefono;
	
	public Contacto() {
		
	}
	public Contacto(String nombre, String telefono, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//Si comparo a un objeto consigo mismo
		if (this == obj)
			return true;
		if (obj == null)
			//Si lo comparo con el valor null
			return false;
		if (getClass() != obj.getClass())
			//Si comparo objetos de clases diferentes
			return false;
		//En cualquier otro caso
		Contacto other = (Contacto) obj;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Contacto arg0) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(arg0.nombre);
	}
	
	
}
