package ejercicio6;

import java.time.LocalDate;

public interface Validator {

	boolean validar(String s);
	boolean validar(int x);
	boolean validar(double d);
	boolean validar(LocalDate fecha);
}
