package ejemplos;

import java.util.Arrays;

public class _07MetodosConArrays {
	
	static void mostrarArray(int x[]) {
		for(int i:x) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	static void mostrarArray(float x[]) {
		for(float i:x) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	static void mostrarArray (int x[][]) {
		
		for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<x[i].length;j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	static int[] doblar(int x[]) {
		int copia[] = Arrays.copyOf(x, x.length);
		
		for(int i = 0;i<copia.length;i++) {
			copia[i] = x[i] * 2;
		}
		return copia;
	}
	
	static void doblar2(int x[]) {
		for(int i = 0;i<x.length;i++) {
			x[i] *= 2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[] = {1,2,3,4,5};
		matriz = doblar(matriz);
		mostrarArray(matriz);
		doblar2(matriz);
		mostrarArray(matriz);
		
	}

}
