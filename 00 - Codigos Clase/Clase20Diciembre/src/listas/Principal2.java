package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listaNumerica;
		ArrayList<Float> listaNumerica2;
		ArrayList<Character> caracteres;
		
		ArrayList<Libro> biblioteca = new ArrayList<Libro>();
		Libro biblio2[] = new Libro[3];
		biblioteca.add(new Libro("Los Pilares de la Tierra","Ken Follet",30,9));
		biblioteca.add(new Libro("La conjura de los necios","Que dices",25,7));
		biblioteca.add(new Libro("El temor de un hombre sabio","Patrick Rothfuss",19,8));
		
		biblio2[0] = biblioteca.get(0);
		biblio2[1] = biblioteca.get(1);
		biblio2[2] = biblioteca.get(2);
		Arrays.sort(biblio2);
		Arrays.sort(biblio2, new ComparadorLibros());
		
		for(Libro l : biblioteca) {
			if(l.getValoracion()>=9) {
				System.out.println(l);
			}
		}
	
		//Ordenar la lista --> Biblioteca por autor
		biblioteca.sort(new ComparadorLibros());
		
		for(Libro l : biblioteca) {
			System.out.println(l.getAutor());
		}
		
		//Ordenar la lista por titulo
		biblioteca.sort(new CompararLibrosPorTitulo());
		
		//Ordenar la lista por valoracion
		//Clase anónima
		
		biblioteca.sort(new Comparator<Libro>()
		{ //Inicio clase anónima

			@Override
			public int compare(Libro o1, Libro o2) {
				// TODO Auto-generated method stub
				Float v1 = o1.getValoracion();
				Float v2 = o2.getValoracion();
				
				return v1.compareTo(v2);
			}			
			
		}//Final de la clase anónima
		);
		
		System.out.println("Best sellers : Ordenados por valoracion:");
		
		for(Libro l : biblioteca) {
			System.out.println(l);
		}
		
		
		
		
		
		
		
	}

}
