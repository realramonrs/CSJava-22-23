
package Ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dni = null;
		boolean correcto = true;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un dni");
		dni = lector.nextLine();
		lector.close();
		
		//Primero comprobamos que tiene 9 caracteres
		if(dni.length()!=9) {
			System.out.println("Número de caracteres incorrecto");
			correcto = false;
		}
		else {
			//Recorremos el string y comprobamos que las 8 primeras posiciones solo tienen numeros
			for(int i = 0;i<8;i++) {
				if(!Character.isDigit(dni.charAt(i))) {
					correcto = false;
					System.out.println("Hay letras en el número del dni");
				}
			}
			
			if(!Character.isLetter(dni.charAt(8))){
				correcto = false;
				System.out.println("No hay una letra al final");
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
