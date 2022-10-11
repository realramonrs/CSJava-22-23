package bucles;

import java.util.Scanner;

public class RepasoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Número perfecto: Es igual a la suma de sus divisores , sin contar al propio número
		// 6 = 3 + 2 + 1 --> Perfecto
		// 28 = 14 + 7 + 4 + 2 +1 
		
		int n = 0 , suma = 1;
		boolean error = false;
		int contador = 0;
		Scanner lector = new Scanner(System.in);
		
		do {
		try {
			error = false;
			
		System.out.println("Introduce un número: ");		
		n = lector.nextInt();
		
		
		for(int i = 2;i<=n/2;i++) {
			if(n % i == 0) {
				suma = suma + i;
			}
		}
		System.out.println("La suma de los divisores es : " + suma);
		
		if(suma == n) {
			System.out.println("Es perfecto");
		}
		else {
			System.out.println("No es perfecto.");
		}
		
		
		}
		catch(Exception e) {
			System.out.println("Error en el número introducido,");
			error = true;
			
			System.out.println(lector.next());
			System.out.println(n);
			contador++;
		}
		
		
		}// Cierro la llave del do while
		
		while(error && contador < 3);
		
		if(contador == 3) {
			System.out.println("consumiste tus oportunidades.");
		}
	}

}
