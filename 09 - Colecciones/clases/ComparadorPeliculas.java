package clases;

import java.util.Comparator;

public class ComparadorPeliculas implements Comparator<Pelicula> {

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		// TODO Auto-generated method stub
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
