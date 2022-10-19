package bucles;

import java.util.Scanner;

public class EjemploDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ejercicio,contador= 0;
		do {
		
			if(contador == 0) {
				System.out.println("Escoja una opcion: ");
			}
			else if(contador == 1) {
				System.out.println("Escoja una opcion: Te quedan 2 intentos! ");
			}
			else  {
				System.out.println("Escoja una opcion: �ltimo intento.");
			}
			
		System.out.println("1. Calcular si un n�mero es primo.");
		System.out.println("2. Identificar n�meros perfectos.");
		System.out.println("3. Identificar n�meros amigos.");
		
		Scanner lector = new Scanner(System.in);
		ejercicio = lector.nextInt();
		
		contador++;
			
		}
		while((ejercicio>=4 || ejercicio<1) && contador<3);
		
		if(contador==3) {
			System.out.println("Buff nada no vales para meter n�meros.");
		}
		else {
			//QUe ejercicio escogi� el usuario
			switch(ejercicio) {
			case 1:
				//Calcular si un n�mero es primo
				//Un n�mero es primo cuando solo es divisible por 1 y por si mismo
				int numero;
				System.out.println("Introduzca un n�mero y te digo si es primo: ");
				Scanner lector2 = new Scanner(System.in);
				numero = lector2.nextInt();
				
				//Para saber si es primo trato de detectar divisores entre el 2 y n-1 o n/2
				boolean primo = true;
				
				for(int i = 2;i<numero;i++) {
					if(numero % i == 0) {
						primo = false;
						break; //Salimos del bucle pq ya no me interesa seguir encontrando divisores
					} //Fin del if interior
				} //Fin del bucle for
				
				if(primo) {
					System.out.println("El n�mero es primo");
				}
				else {
					System.out.println("El n�mero no es primo.");
				}
				
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
			
			}
		}
		
	}

}
