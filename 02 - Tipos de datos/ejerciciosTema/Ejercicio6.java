
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir  un programa que permita calcular la media de 5 variables.

		//Declaramos 5 variables de tipo int
		int x1 = 9 , x2 = 4, x3 = 6, x4 = 2,x5 = 8;
		
		//Declaro una variable de tipo float para la media
		//Pasamos el 5 a float para no perder precisión , ya que sino el resultado sería siempre un entero
		float media = (x1 + x2 + x3 + x4 + x5) / 5f;
		
		System.out.println("La media es: " + media);

	}

}
