package Ejemplos;

public class _11BucleConBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa que obtiene el primer divisor de un numero n
		
		int n = 15;
		
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				System.out.println("El primer divisor es: " + i);
				break; // Salimos del bucle porque no queremos seguir buscando
			}
		}
		
		//Obtener la posición del primer cero de una matriz
		
		int matriz[] = {5,6,3,0,7,1,9};
		int posicion = -1;
		
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]==0) {
				posicion = i; //Guardamos en la variable posicion el valor de i
				break;
			}
		}
		
		if(posicion == -1) {
			System.out.println("No hay ceros"); //Si posicion == -1 quiere decir que ninca entro en el bucle
		}
		else {
			System.out.println("El primer cero está en la posicion: " + posicion);
		}

	}

}
