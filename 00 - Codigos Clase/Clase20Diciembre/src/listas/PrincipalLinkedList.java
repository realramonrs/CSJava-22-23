package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class PrincipalLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> listaEnlazada = new LinkedList<String>();
		listaEnlazada.add("Prueba");
		listaEnlazada.add("Ejemplo");
		listaEnlazada.add("Idea");
		listaEnlazada.add(0, "Rotacion");
		listaEnlazada.addFirst("Inicio");
		listaEnlazada.addLast("Fin");
		
		for(String s : listaEnlazada) {
			System.out.println(s);
		}
		
		ArrayList<String> listaNoEnlazada = new ArrayList<String>(listaEnlazada);
		String datos[] = new String[2];
		datos[0] = "Calor";
		datos[1] = "Templado";
		
		listaNoEnlazada = (ArrayList<String>) Arrays.asList(datos);
		listaNoEnlazada.addAll(Arrays.asList(datos));
		
		
		SuperArrayList flipante = new SuperArrayList();
		flipante.addArray(datos);
		
		
		
	}

}
