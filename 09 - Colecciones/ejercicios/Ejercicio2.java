/**
 * 
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> lista = new ArrayList<Double>();
		//A continuación introducir 10 números 
		//aleatorios entre 0 y 10.
		for(int i = 0;i<10;i++) {
			
			lista.add(new Random().nextDouble()*10);
		}
		
		//Mostramos los números generados
		for(Double d : lista) {
			System.out.printf("%.2f ", d);
		}
		System.out.println();
		//Calcular la media.
		double suma = 0,media = 0;
		
		for(Double d : lista) {
			suma+= d.doubleValue();
		}
		
		media = suma/lista.size();
		
		System.out.printf("La media es: %.2f" , media);
		//Calcular el valor más alto generado.
		System.out.println();
		Collections.sort(lista);
		System.out.println("El valor más alto es: ");
		System.out.printf("%.2f" , lista.get(lista.size()-1));
		//Mostrar por pantalla todos los valores almacenados.
				
		//Eliminar todos aquellos que sean superiores a 7.
		
		Iterator<Double> it = lista.iterator();
		
		while(it.hasNext()) {
			if(it.next()>7) {
				it.remove();
			}
		

		}
		//Volver a mostrar la matriz
		System.out.println();
		System.out.println("Lista con valores > 7 eliminados");
		it= lista.iterator();
		
		while(it.hasNext()) {
			System.out.printf("%.2f " , it.next());
		}
	}

}
