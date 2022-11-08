package repaso;

import java.util.Random;

public class Matrices2D {

	//Método que recibe una matriz 2D y la llena de valores aleatorios
	//entre 1 y 20
	
	public static void llenarMatriz(int m[][]) {
		Random aleatorio = new Random();
		int filas = m.length;
		int columnas = m[0].length;
		for(int i = 0;i<filas;i++) {
			for(int j = 0;j<columnas;j++) {
				m[i][j] = aleatorio.nextInt(20) + 1;
			}
		}		
	}
	
	public static void printar(int m[][]) {
		int filas = m.length;
		int columnas = m[0].length;
		for(int i = 0;i<filas;i++) {
			for(int j = 0;j<columnas;j++) {
			   System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}		
	}
	
	//Método que reciba una matriz 2D y escriba un 0 en todos los elementos
	//de la diagonal principal (si es una matriz cuadrada) si no guarda un cero
	//en la primera posición de cada fila
	
	public static void modificarMatriz(int m[][]) {
		//Verificar si la matriz es cuadrada
		int filas = m.length;
		int columnas = m[0].length;
		if(filas==columnas) {
			for(int i = 0;i<filas;i++) {
				for(int j = 0;j<columnas;j++) {
					if(i==j) {
						m[i][j] = 0;
					}
				} //Cierre for interno
					
				}//Cierre for externo
		} //Cierre if filas == columnas
		else {
			for(int z = 0;z<filas;z++) {
				m[z][0] = 0;
			}
		}
		
	} //cierre método modificar
	
	public static boolean isPrimo(int n) {
		boolean primo = true;
		for(int j = 2;j<=n/2;j++) {
			if(n%j == 0) {
				primo = false;
				break;
			}
		}
		return primo;
	}
	public static void eliminarPrimos(int m[][]) {
		int filas = m.length;
		int columnas = m[0].length;
		
		for(int i = 0;i<filas;i++) {
			for(int j = 0;j<columnas;j++) {		
				
				
				if(isPrimo(m[i][j])) {
					m[i][j] = 0;
				}
				
				
		}
		}
	}
	
	//Método que busca un valor en una matriz 2d y devuelve la posición
	
	public static int[] buscarValor(int matriz[][],int valor) {
		int filas = matriz.length;
		int columnas = matriz[0].length;
		int posicion[] = new int[2];
		boolean salidaPrecipitada = false;
		pepe:
		for(int i = 0;i<filas;i++) {
			
			for(int j = 0;j<columnas;j++) {	
				
				if(matriz[i][j]==valor) {
					posicion[0] = i;
					posicion[1] = j;
					salidaPrecipitada = true;
					 break pepe ;
					}
				}
				
		}
		
		return posicion;
	}
	
	
	
} //Cierre de la clase
