/**
 * 
 */
package Ejercicios;

import java.util.Random;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[4][4];
		Random r = new Random();
		//Lleno la matriz con valores aleatorios  0 o 1
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				matriz[i][j] = r.nextInt(2);
			}
		}


		//Muestro la matriz
		for(int x[] : matriz) {
			for(int y:x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
		//Comprobar que solo tiene 1 en la diagonal principal
		boolean identidad = true;
		
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				if(i==j) {
					//Si coinciden los índices estamos en la diagonal
					if(matriz[i][j]==0){
						identidad = false;
						break;
					}
				}
				else {
					if(matriz[i][j]!=0) {
						identidad = false;
					}
				}
			}

	}
		
		if(identidad) {
			System.out.println("Es la matriz identidad");
		}
		else {
			System.out.println("No es la matriz identidad");
		}
		
		
		/*Otra opción sería utilizar la matriz identidad e ir comparando
		 * posición por posición hasta encontrar una que fuese distinta
		 */
		int[][] matrizIdentidad = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
		boolean esIdentidad = true;
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				if(matriz[i][j]!=matrizIdentidad[i][j]) {
					esIdentidad = false;
					break;
				}
			}
		}
		
		if(esIdentidad) {
			System.out.println("Es la matriz identidad");
		}
		else {
			System.out.println("No es la matriz identidad");
		}
				
	}
}
