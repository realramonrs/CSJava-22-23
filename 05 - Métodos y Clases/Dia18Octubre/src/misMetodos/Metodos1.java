package misMetodos;

public class Metodos1 {

	// M�todo que recibe un n�mero y devuelve true si es par
	public static boolean esPar(int n) {
		if(n % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
		//return numero % 2== 0 ;
			
	}
	
	//M�todo que devuelve true si un String empieza por n�mero
	public static boolean validarString(String cadena) {
		
		if(Character.isDigit(cadena.charAt(0))) {
			
			return true;
		}
		else {
			
			return false;
		}
		
	}
	
	//Funci�n que imprimer por pantalla un saludo
	public static void saludar() {
		System.out.println("Hola bienvenido!");
	}
	
	//Funci�n que recibe un valor y le suma 10
	public static int sumar10(int valor) {
		return valor + 10;
	}
	
	//funci�n que recibe un array y le suma 10 al valor que est� en su posici�n cero
	public static void sumar10(int x[]) {
		x[0]+=10;
	}
	
	//funci�n que recibe un array de enteros y genera un nuevo array con la posici�n ceo 
	//incrementada en 10 unidades
	
	public static int[] sumar10bis(int x[]) {
		int nuevo[] = new int[x.length];
		
		for(int i = 0;i<x.length;i++) {
			nuevo[i] = x[i];
		}
		
		nuevo[0]=nuevo[0] + 10;
		
		return nuevo;
	}
	
	
}
