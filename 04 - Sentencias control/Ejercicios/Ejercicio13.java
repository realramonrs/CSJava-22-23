/**
 * 
 */
package Ejercicios;

import java.util.Random;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = {{1,-2,9},{3,0,-1},{1,2,3}};
		int contador = 0;
		//Lleno la matriz con valores aleatorios  0 o 1
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				if(matriz[i][j]<0) {
					contador++;
				}
			}
		}
		int elementosMatriz2D = matriz.length*matriz[0].length;
		
		double porcentaje = ((double)contador/elementosMatriz2D)*100;
		
		System.out.printf("Hay un %.2f %% de números negativos", porcentaje);

	}

}
