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
		
		//Pepe.length -> Devuelve el número de filas de la Pepe
		System.out.println("Número de filas: " + Pepe.length);
		System.out.println("Número de columnas: " + Pepe[0].length);
		//Llenar la Pepe con números aleatorios
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
