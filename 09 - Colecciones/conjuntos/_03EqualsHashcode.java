package conjuntos;

import java.util.HashSet;

import clases.Pelicula;

public class _03EqualsHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula p1 = new Pelicula("HE345","Interestellar",9.75);
		Pelicula p2 = new Pelicula("HE345","Interestellar",9.75);
		
//		p1 = p2;
		System.out.println("p1.equals(p2) = " + p1.equals(p2));
		System.out.println("p1==p2) = " + (p1==p2));
		System.out.println("p1.getHAshCode() " + p1.hashCode());
		System.out.println("p2.hashCode() " + p2.hashCode());
		
		HashSet<Pelicula> videoclub = new HashSet<Pelicula>();
		videoclub.add(new Pelicula("QWE","Ciudadano Kane",9));
		videoclub.add(new Pelicula("QWE","123 Berlin",8));
		
		for(Pelicula p : videoclub) {
			System.out.println(p);
		}
	}

}
