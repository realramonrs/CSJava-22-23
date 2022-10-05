package sentenciasSeleccion;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que me clasifique un número en los siguientes rangos
		//[0-20] -> Grupo A
		//[21-50] -> Grupo B
		//[51-70] -> Grupo C
		// Resto -> Grupo D
		
		int numero = 515;
		if(numero<0) {
			System.out.println("Error");
		}
		else if(numero <=20) {
			System.out.println("Grupo A");
		}
		else if(numero<=50) {
			System.out.println("Grupo B");
		}
		else if(numero <= 70) {
			System.out.println("Grupo C");
		}
		else {
			System.out.println("Grupo D");
		}
		
		//Programa que me detecte si un número es múltiplo de 3 y de 5
		
		int numero2 = 13;
		
		if(numero2 % 3 == 0 && numero2 % 5 == 0) {
			System.out.println("Múltiplo de 3 y 5");
		}
		
		else if(numero2 % 3 == 0 ) {
			System.out.println("Múltiplo de 3 y no de 5");
		}
		else if(numero2 %5 == 0) {
			System.out.println("Múltiplo de 5 y no de 3");
		}
		else {
			System.out.println("No es ni múltiplo de 5 ni de 3");
		}
		
		
		
		
		
		
	}

}
