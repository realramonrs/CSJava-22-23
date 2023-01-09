/**
 * 
 */
package ejercicios;

import java.util.ArrayList;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
//		Llenarlos con 10 números aleatorios entre 0 y 20. (Podeis utilizar función Ejercicio 1)
		Ejercicio1.llenarColeccion(a1, 10, 20);
		Ejercicio1.llenarColeccion(a2, 10, 20);
//		Crear una tercera lista con los valores de las 2 listas anteriores.
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.addAll(a1);
		a3.addAll(a2);
//		Crear una cuarta lista con los valores de la primera lista que no están en la segunda.
		
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		
		for(Integer i : a1) {
			if(!a2.contains(i)) {
				a4.add(i);
			}
		}
		
//		Mostrar con un iterator los valores de las 4 listas.

		System.out.println("Primera lista:");
		Ejercicio1.mostrarColeccion(a1);
		System.out.println();
		System.out.println("Segunda lista:");
		Ejercicio1.mostrarColeccion(a2);
		System.out.println();
		System.out.println("Tercera lista:");
		Ejercicio1.mostrarColeccion(a3);
		System.out.println();
		System.out.println("Cuarta lista:");
		Ejercicio1.mostrarColeccion(a4);
	}

}
