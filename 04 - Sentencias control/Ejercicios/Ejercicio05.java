
package Ejercicios;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calcular la desviación media
		int matriz[] = {4,1,3,9,5,1,0,2};
		//Matriz para almacenar las desviaciones del mismo
		//tamaño que la matriz original
		double desviaciones[] = new double[matriz.length];
		double media = 0 , suma = 0 , desviacionMedia = 0;
		short contador = 0;
		
		//Calculamos la media
		for(int i = 0;i<matriz.length;i++) {
			suma = suma + matriz[i];
		}
		media = suma/matriz.length;
		
		//Contamos valores por encima de la media
		for(int valor:matriz) {
			if(valor>media) {
				contador+=1;
			}
		}
		System.out.println("La media es: " + media);
		System.out.println();
		System.out.println("Hay " + contador + " valores por encima de la media");
		System.out.println();
		//Para calcular la desviación media , calculamos la desviación 
		//de cada valor y almacenamos el resultado en la matriz de desviaciones
		
		for(int i = 0;i< matriz.length;i++) {
			desviaciones[i] = Math.abs(matriz[i] - media);
		}
		
		//Mostramos el array desviaciones para comprobar
		for(int i = 0;i< desviaciones.length;i++) {
			System.out.println("Desviación del valor de la posición " + i + " " + desviaciones[i]);
				}
		
		//Cáculo de la desviación media
		
		suma = 0;
				for(int i = 0;i<desviaciones.length;i++) {
					suma = suma + desviaciones[i];
				}
				desviacionMedia = suma/desviaciones.length;
				System.out.println("Desviación media = " + desviacionMedia);
				
		
		
		
		
		
	}

}
