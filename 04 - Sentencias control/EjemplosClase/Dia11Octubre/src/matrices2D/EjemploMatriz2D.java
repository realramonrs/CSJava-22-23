package matrices2D;

import java.util.Random;

public class EjemploMatriz2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Matrices 2D --> Organizar los datos
		//   0 0 0 0 0
		//   0 0 0 0 0
		int [][] Pepe = new int[3][5];
		
		Pepe[0][0] = 9;
		
		//Pepe.length -> Devuelve el n�mero de filas de la Pepe
		System.out.println("N�mero de filas: " + Pepe.length);
		System.out.println("N�mero de columnas: " + Pepe[0].length);
		//Llenar la Pepe con n�meros aleatorios
		//Empezamos por la primera fila
		etiqueta:
	for(int indiceFila = 0;indiceFila<Pepe.length;indiceFila++) {
		for(int indiceColumna = 0;indiceColumna<Pepe[indiceFila].length;indiceColumna++) {
			Random aleatorio = new Random();
			Pepe[indiceFila][indiceColumna] = aleatorio.nextInt(20);
		}
		}
	}

}
