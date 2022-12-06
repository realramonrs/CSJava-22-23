package ejercicio2;

public class Usuario {

	// Atributos
	private String username;
	private String password;
	private String email;
	
	// Constructores
	public Usuario() {
		
	}
	public Usuario(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	// Métodos de acceso
	// Setters
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	public void setEmail(String email) {
		this.email = email;
	}
	// Getters
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	
	// Método toString()
	@Override
	public String toString() {
		return username + "#" + password + "#" + email;
	}
	
}
