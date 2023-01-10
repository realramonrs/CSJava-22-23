package listas;

import java.util.ArrayList;
import java.util.Random;

public class _02ArrayListNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(3);
		numero.add(new Integer(4));
		numero.add(9);
		
		System.out.println(numero);
		
		
		
		
		
		Random r = new Random();
		
		for(int i = 0;i<10;i++) {
			numero.add(r.nextInt());
		}
		
	}

}
