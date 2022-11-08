/**
 * 
 */
package tarea;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[] = new int[10];
		
		//a. Posicion cero = Numero aleatorio entre 1 y 10
			matriz[0] = (int) (Math.random() * 10) + 1; //0,25 ptos
			
		//b. Posicion uno = Posici√≥n cero + 20
			matriz[1] = matriz[0] + 20;   //0,25 ptos
			
		//c. Posicion dos = posicion[0] posicion[1]
			matriz[2] = (int)Math.sqrt(Math.pow(matriz[0], 3) + Math.pow(matriz[1], 2));
			//0,25 ptos
		//d. Posicion tres = La media de las anteriores
			matriz[3] = (matriz[0] + matriz[1] + matriz[2]) / 3; //0,25 ptos
			
		//e. Posicion cuatro = Se le solicita al usuario que la introduzca por teclado utilizando la clase JOptionPane
			matriz[4] = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero para la posicion 5"));
			//0,25 ptos
		//f. Los cinco siguientes a los valores que quer√°is.
			matriz[5] = 5;
			matriz[6] = 1;
			matriz[7] = 7;
			matriz[8] = 8;
			matriz[9] = 9;
			
			
			
		// g. Realizar una copia del array en otro array.
			int nuevaMatriz[];
			nuevaMatriz = Arrays.copyOf(matriz, matriz.length);
			
		//h. Ordenar la copia de menor a mayor.
			Arrays.sort(nuevaMatriz);
			//0,5 ptos
		
			//i. Buscar en que posicion esta el valor 1 en los dos arrays (original y copia) , y mostrarla por pantalla.
			int posOriginal = Arrays.binarySearch(matriz, 1);
			int posCopiaOrdenada = Arrays.binarySearch(nuevaMatriz, 1);
			
			if(posCopiaOrdenada < 0) {
				System.out.println("El 1 no se encuentra en la matriz");
			}
			else {
				System.out.println("El 1 est· en la matriz ordenada en la posiciÛn : " + posCopiaOrdenada);
				System.out.println("En la matriz original est· en la posiciÛn : " + posOriginal);
				System.out.println("En la original no hay garantÌas de que estÈ bien ya que el mÈtodo "
						+ "binarySearch necesita que estÈ ordenada");
			}
			
			//j. Utilizar el metodo equals para mostrar true por pantalla si son iguales ambos arrays.
			boolean iguales = Arrays.equals(matriz, nuevaMatriz);
			System.out.println("Son iguales : ?" + iguales);
			
			//0,5 ptos
		//k. Mostrar por pantalla los dos arrays.
			//Mostramos la matriz original:
			System.out.println();
			System.out.println("La matriz original es : ");
			System.out.println(matriz[0] + " " + matriz[1] + " " + matriz[2] + " " + 
					matriz[3] + " " + matriz[4] + " " + matriz[5] + " " +
					matriz[6] + " " + matriz[7] + " " +matriz[8] + " " + matriz[9]);
			
			//Mostramos la matriz ordenada:
			System.out.println();
			System.out.println("La matriz ordenada es : ");
			System.out.println(nuevaMatriz[0] + " " + nuevaMatriz[1] + " " + nuevaMatriz[2] + " " + 
					nuevaMatriz[3] + " " + nuevaMatriz[4] + " " + nuevaMatriz[5] + " " +
					nuevaMatriz[6] + " " + nuevaMatriz[7] + " " +nuevaMatriz[8] + " " + nuevaMatriz[9]);
	}
	

}
