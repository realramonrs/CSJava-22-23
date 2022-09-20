package ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calcular el módulo de un vector de 3 componentes
		float a ,b,c;
		double modulo;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce primer valor");
		a = lector.nextFloat();
		System.out.println("Introduce segundo valor");
		b = lector.nextFloat();
		System.out.println("Introduce tercer valor");
		c = lector.nextFloat();
		
		modulo = Math.sqrt(a*a + b*b + c*c);
		
		//Redondeamos a 3 dedimales
		DecimalFormat df = new DecimalFormat("##.###");
		
		System.out.println("El módulo es: " + df.format(modulo));
		
		
		
		
	}

}
