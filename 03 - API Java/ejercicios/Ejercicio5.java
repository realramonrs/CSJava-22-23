
package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N',
				'J','Z','S','Q','V','H','L','C','K','E'};
		
		String dni = null;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce tu DNI sin letra : ");
		dni = lector.nextLine();
		lector.close();
		
		//Lo pasamos a entero para poder dividir entre 23
		int dniNumero = Integer.parseInt(dni);
		int resto = dniNumero%23;
		char letra = letras[resto];
		
		System.out.println("Su letra es : " + letra);
		
		
		
		
	}

}
