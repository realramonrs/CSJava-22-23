package buclesAnidados;

import java.util.Scanner;

public class ForAndidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int suma = 1,n;
		System.out.println("Introduce un número y te muestros los números perfectos que hay por debajo: ");		
		n = lector.nextInt();
		
		for(int numero = 6;numero<=n;numero++) {
			//Resetear la variable suma
			suma = 1;
				for(int i = 2;i<=numero/2;i++) {
						if(numero % i == 0) {
								suma = suma + i;
							}
						} //Cierre el bucle i
					
						if(suma == numero) {
							System.out.println(numero + " Es perfecto");
						}						
		
		} //Cierre del bucle numero
	}

}
