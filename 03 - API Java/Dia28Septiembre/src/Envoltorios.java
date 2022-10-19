
public class Envoltorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Wrappers --> int --> Integer, float-->Float, char-->Character, double-->Double
		
		int numero = 3678952;
		
		String numeroString = Integer.toString(numero);
		int digitos = numeroString.length();
		
		String temperatura = "45.53";
		float temperaturaFloat = Float.parseFloat(temperatura);
		System.out.println("Temperatura float: " + temperaturaFloat);
	//	int temperaturaInt = Integer.parseInt(temperatura);
		
		System.out.println("Mayor número de tipo int: " + Integer.MAX_VALUE);
		
		//CHaracter --> isDigit, isLetter,
		char caracter = '5';
		boolean digito = Character.isDigit(caracter);
		boolean letra = Character.isLetter(caracter);
		System.out.println(digito);
		
		
		//Programa que indica si el último caracter de un String es una letra.
		String dni = "09876542";
		char ultimoCaracter = dni.charAt(dni.length()-1);
		boolean lastCaracter = Character.isLetter(ultimoCaracter);
		boolean lastCaracter2 = Character.isLetter(dni.substring(dni.length()-1).charAt(0));
		System.out.println("Es una letra? " + lastCaracter);
		System.out.println("Es una letra? " + lastCaracter2);
		
		
		
		
		
	}

}
