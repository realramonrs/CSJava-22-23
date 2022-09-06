package Ejemplos;

public class _09BucleForRecorrerArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[] = {9,0,5,4,1,2,3};
		
		//Bucle que recorre la matriz y muestra por consola los valores
		
		for(int i = 0; i <matriz.length;i++) {
			System.out.print(matriz[i] + " ");
		}
		
		System.out.println();
		//Mostrar los números pares
		System.out.println("Números pares guardados en la matriz: ");
		for(int i = 0;i<matriz.length;i++) {
			if (matriz[i]%2 == 0) {
				System.out.print(matriz[i] + " ");
			}
		}

	}

}
