package tests;
import java.util.Arrays;

import misMetodos.Metodos1;
import misMetodos.ParametrosOpcionales;

public class Pruebas {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[] = {2,3,4,5,20,9,1};
	Arrays.sort(matriz);
		System.out.println(Arrays.toString(matriz));
		
		//Prueba M�todo esPar
		int numero = 12;
		//Lamamos a la funci�n esPar:
		boolean par = Metodos1.esPar(numero);
		
		if(par) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
		
		//Prueba m�todo validarString
		
		if(Metodos1.validarString("y3W")) {
			System.out.println("Empieza por d�gito");
		}
		else {
			System.out.println("No empieza por d�gito");
		}
		
		//Prueba m�todo saludar.
		Metodos1.saludar();
		
		//Prueba m�todo sumar10
		int x = 10;
		x = Metodos1.sumar10(x);
		
		System.out.println("Despu�s de sumarle 10 : " + x);
		
		//Prueba m�todo sumar10 con arrays
		int matriz2[] = {7,1,2,3};
		
		Metodos1.sumar10(matriz2);
		
		System.out.println(Arrays.toString(matriz2));
		
		//Prueba m�todo sumar10bis
		int nuevo[] = Metodos1.sumar10bis(matriz2);
		
		System.out.println(Arrays.toString(nuevo));
		
		//Prueba m�todo calcular media
		
		double resultado = ParametrosOpcionales.calcularMedia(4, 9);
		double resultado2 = ParametrosOpcionales.calcularMedia(3, 9,3);
		double resultado3 = ParametrosOpcionales.calcularMedia(1,2,3,4,5,6,7,8,9);
		double resultado4 = ParametrosOpcionales.calcularMedia(2);
		
		
		System.out.println(resultado4);
		
		//Prueba m�todo suma parametros opcionales
		double res1 = ParametrosOpcionales.suma(4);
		double res2 = ParametrosOpcionales.suma(9);
	}

}
