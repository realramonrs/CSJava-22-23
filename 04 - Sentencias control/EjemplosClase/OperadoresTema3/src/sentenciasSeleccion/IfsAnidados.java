package sentenciasSeleccion;

public class IfsAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que me detecte si un número es múltiplo de 3 y de 5
		int numero = 15;
		
		if(numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("Múltiplo de 3 y de 5");
		}
		else {
			System.out.println("No es múltiplo de 3 y 5 a la vez");
		}
		
		if(numero%3==0) {
			if(numero%5==0) {
				//Número múltiplo de 3 y de 5
				System.out.println("Múltiplo de 3 y de 5");
			}
			else {
				System.out.println("Multiplo de 3 pero no de 5");
			}
		}
		else {
			if(numero%5==0) {
				System.out.println("Multiplo de 5 pero no de 3");
			}
			else {
				System.out.println("No es multiplo de 3 ni de 5");
			}
		}
		
			
	}

}
