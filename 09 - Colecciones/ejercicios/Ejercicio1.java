/**
 * 
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Ramon RS
 *
 */
	
public class Ejercicio1 {

	//a)Método que reciba un Collection<Integer>  un entero n y un entero límite y 
	//rellene la colección con n números aleatorios entre 0 y el límite.

	public static void llenarColeccion(Collection<Integer>c , int numero , int limite) {
		Random r = new Random();
		for(int i = 0;i<numero;i++) {
			c.add(r.nextInt(limite));
		}
	}
	
	//b.)Método que reciba un Collection<Integer> y muestre por pantallas sus valores.

	public static void mostrarColeccion(Collection<Integer>c) {
		for(Integer i : c) {
			System.out.print(i + " ");
		}
	}
	
	//c.)Método que recibe un Set<Double> y lo llena con 100 números double aleatorios.

	public static void llenarColeccion(Set<Double>c , int numero) {
		Random r = new Random();
		for(int i = 0;i<numero;i++) {
			c.add(r.nextDouble()*10);
		}
	}

	//d.)Método que recibe un Set<Double> y muestra sus valores con una cifra decimal.

	public static void mostrarColeccion(Set<Double>c) {
		for(Double i : c) {
			System.out.printf("%.1f ",i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//e.)Crear un ArrayList con el método del apartado a. 
		//******************************************************//
		ArrayList<Integer> l = new ArrayList<Integer>();
		TreeSet<Integer> tree = new TreeSet<Integer>();
		HashSet<Integer> hash = new HashSet<Integer>();
		llenarColeccion(l, 50, 100);
		
		//A partir de este ArrayList cread un HashSet y un TreeSet
		//utilizando el método addAll
		
		tree.addAll(l);
		hash.addAll(l);
		
		//f.)Mostrar por pantalla las colecciones anteriores
		
		System.out.println("Elementos almacenados en el ArrayList");
		mostrarColeccion(l);
		System.out.println();
		System.out.println();
		System.out.println("Elementos almacenados en el TreeSet");
		mostrarColeccion(tree);
		System.out.println();
		System.out.println();
		System.out.println("Elementos almacenados en el HashSet");
		mostrarColeccion(hash);
		System.out.println();
		System.out.println();
		//g.)Crear ahora un TreeSet con el método del apartado c , 
		//a partir de este crear un Hashset y mostrar ambas colecciones utilizando 
		//el método del apartado e.

		HashSet<Double> hash2 = new HashSet<Double>();
		TreeSet<Double> tree2 = new TreeSet<Double>();
		llenarColeccion(hash2, 50);
		
		System.out.println("Elementos double en el HashSet");
		mostrarColeccion(hash2);
		System.out.println();
	
		tree2.addAll(hash2);
		
		System.out.println();
		System.out.println("Elementos double en el TreeSet");
		mostrarColeccion(tree2);
		System.out.println();
		//h.)Crear ahora un ArrayList de strings y meterle 10 nombres ,
		//alguno de ellos repetidos
		
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Pedro");
		nombres.add("Juan");
		nombres.add("Maria");
		nombres.add("Juan");
		nombres.add("Luis");
		nombres.add("Saul");
		nombres.add("Maria");
		nombres.add("Mario");
		
		//i.)Crear un TreeSet y un HashSet a partir del ArrayList anterior

		TreeSet<String> nombresTree = new TreeSet<String>();
		nombresTree.addAll(nombres);
		HashSet<String> nombresHash = new HashSet<String>();
		nombresHash.addAll(nombres);
		System.out.println();
		System.out.println();
		//j.)Mostrar ambas coleeciones utilizando un Iterator.
		Iterator itNombres = nombres.iterator();
		System.out.println("ArrayList de Strings");
		while(itNombres.hasNext()) {
			System.out.print(itNombres.next() + " ");
		}
		System.out.println();
		System.out.println();
		Iterator itNombresTree = nombresTree.iterator();
		System.out.println("Tree set de Strings");
		while(itNombresTree.hasNext()) {
			System.out.print(itNombresTree.next() + " ");
		}
		System.out.println();
		System.out.println("Hash set de Strings");
		Iterator itNombresHash = nombresHash.iterator();
		while(itNombresHash.hasNext()) {
			System.out.print(itNombresHash.next() + " ");
		}
		
	}

}
