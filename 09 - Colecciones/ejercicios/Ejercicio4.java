/**
 * 
 */
package ejercicios;

import java.util.ArrayList;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio4 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda a = new Agenda();
		a.addContacto(new Contacto("Pedro Rios","675453123","pedrorios@hotmail.com"));
		a.addContacto(new Contacto("Luis Santiago Molinez","6444424242","luissan@yahoo.es"));
		a.addContacto(new Contacto("Maria Sanchez","677712342","mariasanchez@gmail.com"));
		a.addContacto(new Contacto("Luis Ranchez","789675432","luisran@gmail.com"));
		a.addContacto(new Contacto("Sancho Panza","600010101","sanchopanza@gmail.com"));
		a.addContacto(new Contacto("Marcos Gulianci","613454322","marcosguli@outlook.es"));
		
		ArrayList<Contacto> c = a.getCs();
		System.out.println("Contactos almacenados :");
		
		a.imprimeContactos();
		System.out.println();
		//Recuperar un contacto por el número de teléfono
		Contacto c2 = a.getContacto("677712342");
		if(c2!=null)
		System.out.println(c2);
		
		else
			System.out.println("No existe el contacto");
		System.out.println();
		//Obtener posicion de un contacto
		int posicion = a.getPosicionContacto("677712342");
		if(posicion>0) {
			System.out.println("Posicion : " + posicion);
		}
		else {
			System.out.println("No existe el contacto");
		}
		System.out.println();
		System.out.println("Eliminamos el contacto Maria Sanchez");
		a.eliminarContacto("677712342");
		System.out.println();
		System.out.println("Mostramos los contactos otra vez");
		a.imprimeContactos();
		System.out.println();
		
		//Buscar contactos por el nombre
		ArrayList<Contacto> contactos = a.buscarContactos("San");
		System.out.println("Contactos con substring San");
		
		for(Contacto con:contactos) {
			System.out.println(con);
		}
		
		System.out.println();
		//Modificar contacto a partir de número de teléfono
		a.modificarContacto("675453123", "Marta Vieitez", "martavi@gmail.com");
		System.out.println("Contactos modificando a Pedro Ríos de la pos cero");
		
		a.imprimeContactos();
	}

}
