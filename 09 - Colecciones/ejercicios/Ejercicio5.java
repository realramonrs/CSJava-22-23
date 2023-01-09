/**
 * 
 */
package ejercicios;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Contacto> contactos = new HashSet<Contacto>();
		contactos.add(new Contacto("Pedro Rios","675453123","pedrorios@hotmail.com"));
		contactos.add(new Contacto("Pedro Rios","675453123","pedrorios@hotmail.com"));
		contactos.add(new Contacto("Luis Santiago Molinez","6444424242","luissan@yahoo.es"));
		contactos.add(new Contacto("Maria Sanchez","677712342","mariasanchez@gmail.com"));
		contactos.add(new Contacto("Luis Ranchez","789675432","luisran@gmail.com"));
		contactos.add(new Contacto("Sancho Panza","600010101","sanchopanza@gmail.com"));
		contactos.add(new Contacto("Sancho Panza","600010101","sanchopanza@gmail.com"));
		
		for(Contacto c : contactos) {
			System.out.println(c);
		}
		
		//Creamos un Treeset con los contactos anteriores
		TreeSet<Contacto> tree = new TreeSet<Contacto>();
		tree.addAll(contactos);
		//Mostramos  los contactos del TreeSet
		System.out.println();
		System.out.println("Contactos del treeset");
		
		for(Contacto c : tree) {
			System.out.println(c);
		}
	}

}
