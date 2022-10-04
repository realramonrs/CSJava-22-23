
package Ejercicios;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Encontrar el valor más alto de una matriz y su posición
		
		int matriz[] = {2,5,6,1,8,4,2,3,0,-5};
		
		int maximo = matriz[0]; 
		int posicion = -1;
		//Comparamos el valor almacenado en maximo con el resto de 
		//elementos de la matriz y si hay alguno más alto sobreescribimos la variable maximo
		//al nuevo valor
		
		for(int i = 1;i<matriz.length;i++) {
			if(matriz[i]>maximo) {
				maximo = matriz[i];
				//Guardamos la posicion
				posicion = i;
			}
		}
		
		System.out.println("Valor más alto " + maximo);
		System.out.println("Posición : " + posicion);
		
		
		
		
		
	}

}
