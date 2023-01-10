package listas;

import java.util.LinkedList;

public class _03LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> pelis = new LinkedList<String>();
    	pelis.add("Matar a un ruiseñor");
    	pelis.add("El resplandor");
    	pelis.add("Interstellar");
    	
    	
    	System.out.println(pelis.getLast());
    	System.out.println(pelis.getFirst());
    	
    
    	pelis.offerFirst("Speed");
    	pelis.offerLast("Regreso al Futuro");
    	
    	System.out.println(pelis);

	}

}
