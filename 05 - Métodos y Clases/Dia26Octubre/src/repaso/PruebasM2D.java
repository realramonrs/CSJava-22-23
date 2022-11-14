package repaso;

public class PruebasM2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[4][8];
		Matrices2D.llenarMatriz(matriz);
		System.out.println("Matriz generada : ");
		Matrices2D.printar(matriz);
		Matrices2D.modificarMatriz(matriz);
		System.out.println("Matriz modificada : ");
		Matrices2D.printar(matriz);
		
		System.out.println("Matriz sin nºs primos : ");
		Matrices2D.eliminarPrimos(matriz);
		Matrices2D.printar(matriz);
		
		int valorBuscado = 10;
		int matrizBusqueda[][] = {{10,4,10},{8,10,1},{5,1,2}};
		int posicion[] = Matrices2D.buscarValor(matrizBusqueda, valorBuscado);
		Matrices2D.printar(matrizBusqueda);
		System.out.println("El 10 está en la posición: ");
		System.out.println("Fila " + posicion[0]);
		System.out.println("Columna : " + posicion[1]);
	}

}
