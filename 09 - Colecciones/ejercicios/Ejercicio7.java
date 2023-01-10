/**
 * 
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,ArrayList<Integer>> mapa = new HashMap<String,ArrayList<Integer>>();
		ArrayList<Integer> notas1 = new ArrayList<Integer>();
		ArrayList<Integer> notas2 = new ArrayList<Integer>();
		
		
		Ejercicio1.llenarColeccion(notas1, 10, 10);
		Ejercicio1.llenarColeccion(notas2, 10, 10);
		
		//Comprobamos notas primer arraylist
		System.out.println("El primer arraylist : ");
		Ejercicio1.mostrarColeccion(notas1);
		System.out.println();
		//Comprobamos notas primer arraylist
		System.out.println("El segundo arraylist : ");
		Ejercicio1.mostrarColeccion(notas2);
		
		//Asociamos las notas a dos dnis
		mapa.put("11111111S", notas1);
		mapa.put("12345678A",notas2);
		System.out.println();
		//Obtener las notas de un dni
		ArrayList<Integer> notasDNI = mapa.get("11111111S");
		
		System.out.println("Las notas del dni 111111111S son : ");
		Ejercicio1.mostrarColeccion(notasDNI);
		System.out.println();
		
		//Calcular la media de todas las entradas:
		
		Collection<ArrayList<Integer>> listasDeNotas = mapa.values();
		
		for(ArrayList<Integer> lista : listasDeNotas) {
			int suma = 0;
			float media = 0;
			for(Integer nota : lista) {
				suma+=nota;
			}
			media = suma/lista.size();
			System.out.println("La media es de : " + media);
		}
		
		
		
		
		
		
	}

}
