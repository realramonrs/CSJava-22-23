package Ejemplos;

public class _15Matrices2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz2D[][] = new int[2][2];
		matriz2D[0][0] = 1;
		matriz2D[0][1] = 8;
		matriz2D[1][0] = 3;
		matriz2D[1][1] = 2;
		
		int otraMatriz2D[][] = {{1,3},{2,4},{5,1}};
		
		System.out.println("Número de filas: " + matriz2D.length);
		System.out.println("Número de elementos de la fila 0: " + matriz2D[0].length);
		System.out.println("Número de elementos de la fila 1: " + matriz2D[1].length);
		
		//Mostrar matriz por consola con for tradicional
		for(int i = 0;i<matriz2D.length;i++) {
			for(int j = 0;j<matriz2D[i].length;j++) {
				System.out.print(matriz2D[i][j]+" ");
			}
			System.out.println();
		}
		
		//Utilizando la estructura for each
		for(int x[] : matriz2D) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
