
package ejercicios;

public class PruebaMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 1 : Prueba metodo Printar
		MetodosTema5.imprime("Probando métodos Tema 5");
		MetodosTema5.imprime(3.4);
		double matriz[] = {9,8,7,6};
		MetodosTema5.imprime(matriz);
		
		//Ejercicio 2: 
		int masAlto = MetodosTema5.maximo(3,2,6,7,1,2,9);
		System.out.println("El maximo es: " + masAlto);
		
		//Ejercicio 3:
		
		System.out.println();
		int m[] = new int[20];
		
		MetodosTema5.llenar(m);
		
		MetodosTema5.imprime("La matriz del apartado 3 es : ");
		MetodosTema5.imprime(m);
		System.out.println();
		//Ejercicio 4
		int matriz2D[][] = new int[3][3];
		MetodosTema5.llenar(matriz2D[0]);
		MetodosTema5.llenar(matriz2D[1]);
		MetodosTema5.llenar(matriz2D[2]);
		
		System.out.println();
		System.out.println("Matriz 2D apartado 4");
		System.out.println();
		//Printamos las filas que son arraus 1d
		MetodosTema5.imprime(matriz2D[0]);
		MetodosTema5.imprime(matriz2D[1]);
		MetodosTema5.imprime(matriz2D[2]);
		
		//Comprobamos si tiene primos 
		System.out.println();
		for(int i = 0;i<matriz2D.length;i++) {
			for(int j = 0;j<matriz2D[i].length;j++) {
				if(MetodosTema5.numeroPrimo(matriz2D[i][j])) {
					System.out.println("Numero primo : " + matriz2D[i][j]);
					System.out.println("En posicion: " + i + " , " + j);
				}
			}
		}
		
		System.out.println();
		//Ejercicio 5:
		MetodosTema5.imprime("Ejercicio 5: ");
		
		int palabras = MetodosTema5.contarPalabras("Programar es muy divertido");
		
		MetodosTema5.imprime("La frase tiene " + palabras + " palabras");
		
		System.out.println();
		
		//Ejercicio 6
		MetodosTema5.imprime("Ejercicio 6: ");
		int matrizEj6[] = {4,5,6,3,1};
		int otraMatriz[] = MetodosTema5.doblar(matrizEj6);
		
		MetodosTema5.imprime("Matriz original : ");
		MetodosTema5.imprime(matrizEj6);
		MetodosTema5.imprime("Matriz copia : ");
		MetodosTema5.imprime(otraMatriz);
		
		
	}

}
