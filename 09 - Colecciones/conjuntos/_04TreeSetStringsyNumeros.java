package conjuntos;

import java.util.Random;
import java.util.TreeSet;

public class _04TreeSetStringsyNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> alumnos = new TreeSet<String>();
		alumnos.add("Braulio Otero");
		alumnos.add("Alejandro Sánchez");
		alumnos.add("Domingo Duró");
		
		for(String s : alumnos) {
			System.out.println(s);
		}
		
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		Random r = new Random();
		
		for(int i = 1;i<10;i++) {
			numeros.add(r.nextInt(10));
		}
		
		for(Integer f : numeros) {
			System.out.print(f + " ");
		}
	}

}
