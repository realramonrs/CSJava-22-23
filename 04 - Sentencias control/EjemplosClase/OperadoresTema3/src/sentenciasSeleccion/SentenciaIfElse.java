package sentenciasSeleccion;
import java.util.Scanner;

public class SentenciaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sentencia if(condicion){
					//     ....
		             // }
					// else{
					//     ....
					//    }
		//Programa que indica si un número es par
		int numero;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca un valor: ");
		numero = lector.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("El número es par.");
		}
		else {
			System.out.println("No es par.");
		}
		
		//Segundo ejemplo : Programa que lee la edad y la altura de una persona
		// y si la edad es menor que 8 o la altura < 1.35 mtrs --> Muestra mensaje
		//que tiene que usar sistema de protección individual (SPI)
		int edad;
		float altura;
		System.out.println("Introduzca la edad: ");
		edad = lector.nextInt();
		System.out.println("Introduzca la altura: ");
		altura = lector.nextFloat();
		
		if(edad < 8 || altura < 1.35) {
			System.out.println("Tiene que utilizar SPI");
		}
		else {
			System.out.println("No tiene que utilizar SPI");
		}
		
		//Programa que determina si un número pertenece al rango [10-20]
		
		int valor ;
		System.out.println("Introduce valor rango [10-20]");
		valor = lector.nextInt();
		
		if(valor>=10 && valor<=20) {
			System.out.println("Si está en el rango [10-20]");
		}
		else {
			System.out.println("No está en el rango [10-20]");
		}
	}

}
