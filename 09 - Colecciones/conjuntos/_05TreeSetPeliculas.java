package conjuntos;

import java.util.TreeSet;

import clases.Pelicula;

public class _05TreeSetPeliculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Pelicula> pelis = new TreeSet<Pelicula>();
		Pelicula p1 = new Pelicula("HE345","Interestellar",9.75);
		Pelicula p2 = new Pelicula("PIUYT","Regreso al Futuro",10);
		Pelicula p3 = new Pelicula("QIWOW","Cadena Perpetua",9.8);
		
		pelis.add(p1);
		pelis.add(p2);
		pelis.add(p3);
		
		for(Pelicula p : pelis) {
			System.out.println(p);
		}
		
		
		
		
	}

}
