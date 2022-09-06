package ejemplos;
import java.util.Arrays;

public class _02Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {3,2,-5,9,1};
		
		//Número de elementos de un array
		System.out.println(x.length);
		
		//Para acceder a un determinado elemento ponemos el índice al que queremos acceder.
		x[0] = 9;
		x[1] = 1;
		
		Arrays.sort(x);
		
		System.out.println("Matriz ordenada: ");
		System.out.println(x[0] + " " + x[1] + " " + x[2] + " " + x[3] + " " + x[4]);
		int posicion = Arrays.binarySearch(x, 3);
		System.out.println("El 3 está en la posición " + posicion);
		int copia[] = Arrays.copyOf(x, 5);
		
		System.out.println(copia[0] + " " + copia[1] + " " + copia[2] + " " + copia[3] + " " + copia[4]);
		
		boolean iguales = Arrays.equals(x, copia);
		
		System.out.println("Son iguales ? " + iguales);
		
		
		
		//Igualando referencias
		int matriz1[] = {9,0,9,0,7};
		int matriz2[];
		
		matriz2 = matriz1; //matriz2 y matriz1 apuntan a la misma matriz
		
		matriz2[0] = 2;
		System.out.println(matriz1[0]);
		
		
		
		
	}

}
