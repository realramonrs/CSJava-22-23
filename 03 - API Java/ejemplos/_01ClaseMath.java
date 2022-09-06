package ejemplos;

import java.util.Random;

public class _01ClaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calcular la raiz de un número
		int numero = 9;
		double raiz = Math.sqrt(numero);
		
		//Elevar un número a una potencia
		byte potencia = 4;
		double resultado = Math.pow(numero, potencia);
		
		//Redondear un valor:
		double valor = 4.567789;
		int valorRedondeado = (int)Math.round(valor); //Al recibir un double devuelve un long
		
		
		
		double nAleat = Math.random();
		
		//Otra forma 
		Random r = new Random();
		int nAleatEntero = r.nextInt();
		int aleatEntero2 = r.nextInt(10);
		
		//Calcular el coseno
		System.out.println(Math.round(Math.cos(Math.toRadians(0))));

	}

}
