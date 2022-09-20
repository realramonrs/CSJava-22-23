
package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[] = new int[5];
		int copia[] = new int[numeros.length];
		
		//Dar valores aleatorios
		
		numeros[0] = (int)(Math.random()*10); //Número entre 0 y 9
		Random aleatorio = new Random();
		numeros[1] = aleatorio.nextInt(20);
		numeros[2] = aleatorio.nextInt(20);
		numeros[3] = aleatorio.nextInt(20);
		numeros[4] = aleatorio.nextInt(20);
		
		//Mostrar primera y  última posición
		
		System.out.println("Primera posicion : " + numeros[0]);
		System.out.println("Última posicion : " + numeros[numeros.length - 1]);
		
		//Crear copia
		
		copia = Arrays.copyOf(numeros, numeros.length);
		Arrays.sort(copia);
		
		//Mostramos la matriz original para comprobar
		System.out.println(numeros[0] + " " + numeros[1] + " " + 
				numeros[2] + " " +numeros[3] + " " + numeros[4]);
		
		//Mostramos la matriz copia para comprobar , esta vez utilizando el método Arrays.toString
				System.out.println(Arrays.toString(copia));
		
		//Solicitar al usuario que introduzca un valor para buscarlo
				//en la copia 
		
		int numeroABuscar;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un valor : ");
		
		numeroABuscar = lector.nextInt();
		int posicion = Arrays.binarySearch(copia, numeroABuscar);
		System.out.println(numeroABuscar + " está en la posicion " + posicion);
		
		
		
		
		
	}

}
