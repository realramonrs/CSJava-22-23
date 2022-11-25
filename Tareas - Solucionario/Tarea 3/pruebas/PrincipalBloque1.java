package pruebas;
import java.util.Scanner;

import bloqueEjercicios1.MTDNumeros;

public class PrincipalBloque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		int opcion = 0;
		
		do{
			System.out.println("Escoja una opción:1-9");
			opcion = lector.nextInt();
			
			switch(opcion){
			case 1:
				System.out.println("1. Introduce un número para saber si es perfecto:");
				int numero = lector.nextInt();
				
				if(MTDNumeros.isPerfect(numero)){
					System.out.println(numero + " es perfecto.");
				}
				else{
					System.out.println(numero + " no es perfecto.");
				}
				break;
			case 2:
				int n1,n2,n3;
				int mcm=0;
				System.out.println("Vamos a calcular el mínimo común múltiplo de 3 números.");
				System.out.println("Introduzca número 1:");
				n1 = lector.nextInt();
				System.out.println("Introduzca número 2:");
				n2 = lector.nextInt();
				System.out.println("Introduzca número 3:");
				n3 = lector.nextInt();
				
				mcm = MTDNumeros.mcm(n1, n2, n3);
				
				System.out.println("El mcm es : " + mcm);
				
				
				break;
			case 3:
				float r1,r2;
				double rEquivalente;
				
				System.out.println("Vamos a calcular la resistencia equivalente de dos resistencias en serie en 3 unidades");
				System.out.println("Introduzca el valor de la primerar resistencia (ohmnios): ");
				r1 = lector.nextFloat();
				System.out.println("Introduzca el valor de la segunda resistencia: (ohmnios) ");
				r2 = lector.nextFloat();
				
				System.out.println("La resistencia equivalente es: ");
				//En ohmnios
				rEquivalente = MTDNumeros.calculoREquivalente(r1, r2);
				System.out.println(rEquivalente + " ohmnios.");
				
				//En microOhmnios
				rEquivalente = MTDNumeros.calculoREquivalente(r1, r2,1);
				System.out.println(rEquivalente + " microOhmnios.");
				
				//En kiloOhmnios
				rEquivalente = MTDNumeros.calculoREquivalente(r1, r2,2);
				System.out.println(rEquivalente + " kiloOhmnios.");				
				
				break;
			case 4:
				
				int matriz[] = {3,4,5,-1,8,0,-2,-5,7};
				//Mostramos array por pantalla
				
				for(int valor:matriz){
					System.out.print(valor + " ");
				}
				System.out.println();
				//El siguiente método quita los valores negativos y almacena en su lugar la media de los elementos positivos del array.
				
				MTDNumeros.quitarNegativosMatriz(matriz);
				
				//Para comprobarlo visualizaremos la matriz
				
				for(int valor: matriz){
					System.out.print(valor + " ");
				}
				System.out.println();
				break;
			case 5:
				float matrizCaso5[] = {3.4f,5.6f,7.8f,96.0f,2.3f};
				
				float media = MTDNumeros.media2Decimales(matrizCaso5);
				System.out.println("La media es: " + media);
				break;
			case 6:
				float matriz6[] = {1.6f,2.2f,3.7f,4.9f,5.4f,6.6f,7.1f,8.4f,9.7f};
				
				//Declaramos 2 matrices donde guardar la matriz que devuelve el método en ambos casos
				int matrizAbajo[] = MTDNumeros.matrizRedondeada(matriz6, true);
				int matrizArriba[] = MTDNumeros.matrizRedondeada(matriz6, false);
				
				//Mostramos ambas matrices
				System.out.println("Matriz redondeada a la baja:");
				for(int valor:matrizAbajo){
					System.out.print(valor+" ");
				}
				
				System.out.println("La media es : " + MTDNumeros.media2Decimales(matrizAbajo));
				//Mostramos ambas matrices
				System.out.println("Matriz redondeada al alza:");
				for(int valor:matrizArriba){
					System.out.print(valor+" ");
				}
				System.out.println("La media es : " + MTDNumeros.media2Decimales(matrizArriba));
				break;
			case 7:
				double matriz7[][] = {{3.5,6.7,2.1},{3.5,2.9,1.3},{9.1,8.6,4.7}};
				
				MTDNumeros.modificarMatriz2d(matriz7);
				
				//Mostramos la matriz resultado
				
				for(double fila[] : matriz7){
					for(double valor : fila){
						System.out.print(valor + " ");
					}
					System.out.println();
				}
				break;
				
			case 8:
				int matriz8[][] = {{1,4,5,6},{9,2,8,1},{7,5}};
				
				System.out.println(MTDNumeros.getInfoMatriz(matriz8));
				break;
			
			case 9:
				int matriz9[][] = {{1,2,2},{1,3,4},{2,5,1},{0,1,2},{1,0,2}};
				
				System.out.println("Hay filas repetidas? ," + MTDNumeros.getRepetidas(matriz9));
			}
			
		}
		while(opcion!=11);
		
		System.out.println("Adiós , gracias por jugar con nosotros!!.");

	}

}
