package matrices;

import java.util.Arrays;
import java.util.Random;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[] = new int[10];
		matriz[0] = 9;
		matriz[1] = 5;
		
		//Guardar valores aleatorios en las posiciones de la 2 a la 100
		Random aleatorio = new Random();
		for(int i = 2;i<matriz.length;i++) {
			matriz[i] = aleatorio.nextInt(50);
		}		
		System.out.println(Arrays.toString(matriz));
		
		for(int i = 0;i<matriz.length;i++) {
			System.out.print(matriz[i] + " ");
		}
		System.out.println();
		//for mejorado--> sólo lectura
		for(int valor : matriz) {
			System.out.print(valor + " ");
			valor = 20;
		}
		System.out.println();
		for(int i = 0;i<matriz.length;i++) {
			System.out.print(matriz[i] + " ");
		}
		
		//Calcular la media: 
		
	}

}
