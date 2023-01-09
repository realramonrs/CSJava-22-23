package conjuntos;

import java.util.TreeSet;

import clases.ComparadorPeliculas;
import clases.Pelicula;

public class _06TreeSetComparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Pelicula> videoclub = new TreeSet<Pelicula>();
		Pelicula p1 = new Pelicula("HE345","Interestellar",9.75);
		Pelicula p2 = new Pelicula("PIUYT","Regreso al Futuro",10);
		Pelicula p3 = new Pelicula("QIWOW","Cadena Perpetua",9.8);
		videoclub.add(p1);
		videoclub.add(p2);
		videoclub.add(p3);
		TreeSet<Pelicula> videoclub2 = new TreeSet<Pelicula>(new ComparadorPeliculas());
		videoclub2.addAll(videoclub);
		
		for(Pelicula p : videoclub) {
			System.out.println(p);
		}
		System.out.println();
		System.out.println("Videoclub alternativo: ");
		for(Pelicula p : videoclub2) {
			System.out.println(p);
		}
}
}
