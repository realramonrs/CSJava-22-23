package ejemplos;

public class _03OperadoresAritméticos {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Operador asignación 
		int c,d,e;
		c = 110;
		d = e = 20;
		
		//Operador + : Dos funciones : Suma y concatenación (cadenas)
		d = c + 5;
		String frase = "La variable d vale " + 5;
		String numero = "234" + 10;
		
		System.out.println(frase);
		System.out.println("Numero = " + numero);
		
		//Operador resto
		int x  =10;
		int resto = x % 2;
		//La variable resto almacena el resto de la división x / 2;
		
		//Operador +=
		
		x+=10; // Esto es equivalente a x = x + 10
		
		//Operadores postincremento  y post-decremento
		x = 1;
		x = x++;
		System.out.println("x vale después de  x = x++ " + x);
		x++;
		System.out.println("x vale después de x++ " + x);
		x=++x;
		System.out.println("x vale después de ++x " + x);
		
		
		
	}

}
