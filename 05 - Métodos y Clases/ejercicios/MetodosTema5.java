/**
 * 
 */
package ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Ramon RS
 *
 */
public class MetodosTema5 {

	//Ejercicio 1: Método para printar un String por pantalla
	
	public static void imprime(String mensaje) {
		System.out.println(mensaje);
	}
//	Aunque no lo pide el ejercicio , voy a sobrecargarlo para printar más cosas
	//Métodos para printar por pantalla :
	//Printar numeros
	public static void imprime(double n) {
		System.out.println(n);
	}
	//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
	//Printar una matriz
	
		public static void imprime(int n[]) {
			for(int numero : n) {
				System.out.print(numero + " ");
			}
			System.out.println();
		}
		
		//Printar una matriz de double
		
	public static void imprime(double n[]) {
		for(double numero : n) {
			System.out.print(numero + " ");
		}
		System.out.println();
	}
	
	//Ejercicio 2: Encontrar el valor más alto de los recibidos
	public static int maximo(int ...numeros) {
		int max = numeros[0];
		
		for(int n : numeros) {
			if(max < n) {
				max = n;
			}
		}
		
		return max;
	}
	
	//Lo sobrecargamos para double
	public static double maximo(double ...numeros) {
		double max = numeros[0];
		
		for(double n : numeros) {
			if(max < n) {
				max = n;
			}
		}
		
		return max;
	}
	
	//Ejercicio 3: Llenar una matriz con numeros aleatorios
	
	public static void llenar(int []x) {
		Random aleatorio = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = aleatorio.nextInt(50);
		}
	}
	//Sobrecargar para que funcione con double
	public static void llenar(float []x) {
		Random aleatorio = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = aleatorio.nextFloat();
		}
	}
	
	//Ejercicio 4: Numero primo
	
	public static boolean numeroPrimo(int n) {
		
		boolean primo = true;
		
		for(int i = 2 ; i<n;i++) {
			if(n%i==0) {
				//i es divisor -->n ya no es primo
				primo = false;
				break;
			}
		}
		
		return primo;
		
	}
	
	//Ejercicio 5:
	public static int contarPalabras(String palabras) {
		return palabras.split(" ").length;
	}
	
	//Ejercicio 6: doblar matriz
	public static int[] doblar(int x[]) {
		int copia[] = new int[x.length*2];
		copia = Arrays.copyOf(x, copia.length);
		return copia;
	}
	
	
	
	
	
	
}
