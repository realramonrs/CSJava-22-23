package ejercicio6;

import java.time.LocalDate;

public class PasswordFree extends Password {

	public PasswordFree(String cadena) {
		super(cadena);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validar(String s) {
		if(s.length()>=1) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean validar(int x) {
		// TODO Auto-generated method stub
		return false;
	}

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
	protected void setCadena(String cadena) {
		// TODO Auto-generated method stub
		if(validar(cadena)) {
			super.cadena = cadena;
		}
	}
	
	@Override
	public String getFortaleza() {
		if(this.cadena.length()<5) {
			return "débil";
		}
		else {
			return "fuerte";					
				}	
			}
		}
