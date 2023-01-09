package conjuntos;

import java.util.HashSet;

import clases.Pelicula;

public class _02HashSetPelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula p1 = new Pelicula("HE345","Interestellar",9.75);
		Pelicula p2 = new Pelicula("PIUYT","Regreso al Futuro",10);
		Pelicula p3 = new Pelicula("QIWOW","Cadena Perpetua",9.8);
		
		HashSet<Pelicula> videoclub = new HashSet<Pelicula>();
		videoclub.add(p1);
		videoclub.add(p2);
		videoclub.add(p3);
		videoclub.add(p1);
		
		for(Pelicula p: videoclub) {
			System.out.println(p);
		}
	}

}
