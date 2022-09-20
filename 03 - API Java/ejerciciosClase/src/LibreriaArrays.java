import java.util.Arrays;

public class LibreriaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sintaxis para declarar Arrays
		//Declarar un array de 100 enteros
		int []matriz = new int[10];
		System.out.println("Posición 0 : " + matriz[0]);
		//Modificar algún valor de la matriz:
		matriz[0] = 9;
		matriz[1] = 19;
		//...
		//Último índice al que podemos acceder tamaño - 1
		matriz[9]  =15;
		
		//matriz[10] = 900; --> ArrayIndexOutOfBoundsException
		
		char []caracteres = new char[10];
		String carac = "QERQWEREWR";
		
		
		//Declarar array e inicializarlo a valores diferentes del por defecto
		double d[] = {4.5,6.7,2.3,7.8,9.1};
		char []letras = {'Q','W','Z','I'};
		String palabras[] = {"telefono","mariposa","murcielago","ordenador"};
		
		//El tamaño de un array : length
		
		int tamanhoMatrizd = d.length;
		
		//Ordenar de menor a mayor un array de enteros
		Arrays.sort(d);
		
		//Visualizar todos los valores guardados en la matriz d
		System.out.println(d[0]+ " , " + d[1]);
		System.out.println(Arrays.toString(d));
		
		//Hacer una copia de un Array.
		int original[] = {5,1,3,0,25,2,8,9,2};
		int copia[] =new int[original.length];
		int copia2[] = original;
		copia = original;
		
		Arrays.sort(original);
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copia));
		
		int original2[] = {9,8,7,6,5,4,3,2,1};
		int copia3[] = Arrays.copyOf(original2, original2.length);
		System.out.println(Arrays.toString(original2));
		Arrays.sort(original2);
		
		System.out.println("*****************************");
		System.out.println("Original2: " + Arrays.toString(original2));
		System.out.println("Copia3: " + Arrays.toString(copia3));
		
		//BinarySearch--> Realizar búsquedas en Arrays Ordenados.
		int array1[] = {8,4,5,7,4,1,4,4,4};
		int valorBuscado  = 4;
		
		Arrays.sort(array1);
		int posicion = Arrays.binarySearch(array1, valorBuscado);
		System.out.println("Posicion : " + posicion);
		
		int a1[] = {1,2};
		int a2[] = {1,2};
		System.out.println(Arrays.equals(a1,a2));
	}

}
