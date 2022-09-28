
package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = null;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce una frase : ");
		frase = lector.nextLine();
		
		//Contar palabras
		int cantidadPalabras = frase.split(" ").length;
		int pos0a = frase.split(" ")[0].indexOf('a');
		int pos1a = frase.split(" ")[1].indexOf('a');
		//... Como no podemos escribir n veces lo mismo (necesitamos un bucle
		//Vamos a suponer que tenemos sólo 3 palabras
		int pos2a = frase.split(" ")[2].indexOf('a');
		
		//El apartado anterior estaría mejor resuelto así:
		String []palabras = frase.split(" ");
		pos0a = palabras[0].indexOf('a');
		pos1a = palabras[1].indexOf('a');
		//...
		
	}

}
