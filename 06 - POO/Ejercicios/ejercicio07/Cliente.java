/**
 * 
 */
package ejercicio07;

public class Cliente {

	private String razonSocial;
	private String nif;
	private String direccion;
	private char formaPago;
	private char prioridadPedido;
	private String [] telefonos;
	private String email;
	private String comentarios;
	private char tipoCliente;
	private boolean aplicarRecargo;
	public Cliente(String razonSocial, String nif, String direccion, char formaPago
			, String email) {
		
		this.razonSocial = razonSocial;
		this.nif = nif;
		this.direccion = direccion;
		setFormaPago(formaPago);		
		this.email = email;
		
		
		
	}
	public Cliente() {
		
	}
	
	//Setters y Getters
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public char getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(char formaPago) {
		if(formaPago=='C'||formaPago=='T'||formaPago=='B'||formaPago=='P') {
			this.formaPago = formaPago;
		}
	}
	public char getPrioridadPedido() {
		return prioridadPedido;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "razonSocial=" + razonSocial + ", nif=" + nif + ", direccion=" + direccion + ", formaPago="
				+ formaPago + ", email=" + email;
	}
	
	
	
	
	
	
	
	
}
