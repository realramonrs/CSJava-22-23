package bucles;

import java.util.Arrays;
import java.util.Random;

public class EjemplosArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicion = -1;
		do{
		int matriz[] = new int[20];
		//Llenar la primera mitad de las posiciones con valores aleatorios entre 1 y 30
		
		
		for(int i = 0;i<matriz.length/2;i++) {
			Random rnd = new Random();
			matriz[i] = rnd.nextInt(31);
					
		} 
		
		
		
		//Algoritmo que busca un número en un array.
		int valorBuscado = 8;
		
		
		
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i] == valorBuscado) {
				posicion = i;
				break;
			}
		}
		
		/*if(posicion == -1) {
			System.out.println("No está el número en la matriz");
		}*/
		if(posicion != -1) {
			System.out.println(Arrays.toString(matriz));
			System.out.println("Está en la posición: " + posicion);
		
		}
		
		}//Cierro el do
		while(posicion == -1);
		
		
	}

}
