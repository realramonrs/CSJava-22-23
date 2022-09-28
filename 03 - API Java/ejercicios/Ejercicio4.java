
package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emilio = null;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce tu dirección de correo : ");
		emilio = lector.nextLine();
		
		String [] partes = emilio.split("@");
		//El dominio estará guardado en partes[1]
		System.out.println("El dominio es : " + partes[1]);
		
	}

}
