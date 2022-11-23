package ejercicio6;

import java.time.LocalDate;

public class PasswordPlus extends Password {

	public PasswordPlus(String cadena) {
		super(cadena);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validar(String s) {
		// TODO Auto-generated method stub
		if(s.length()>=6 && s.matches(".*[0-9].*")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validar(int x) {
		// TODO Auto-generated method stub
		return false;
	}
	//Esta clase como no es abstracta está obligada a implementar todos los métodos de la interfaz Validator
	//Esto se solucionaría utilizando el Patrón de Diseño Adaptador--> Ver Clase PassWordAdapter 
	@Override
	public boolean validar(double d) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validar(LocalDate fecha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCadena(String cadena) {
		// TODO Auto-generated method stub
		if(validar(cadena)) {
			super.cadena = cadena;
		}
		
	}

	@Override
	public String getFortaleza() {
		if(this.cadena.length()<10) {
			return "débil";
		}
		else {
			if(!cadena.matches(".*[A-Z].*")) {
				return "débil";
			}
			else {
				return "fuerte";
			}
		}
		
	}

	
	
	
}
