package ejemplos;

public class _03Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "En un lugar de la Mancha...";
				
		int numeroCaracteres = cadena.length(); //Obtiene el número de caracteres
		
		char letra = cadena.charAt(4); //Obtiene el caracter que ocupa la posición 4
		
		int posicionPrimerEspacio = cadena.indexOf(" "); //Índice de la primera aparición de un espacio
		
		System.out.println(posicionPrimerEspacio);
		
		int posPrimerSubstring = cadena.indexOf("lugar"); //Índice de la primera aparición del String lugar
		
		System.out.println(posPrimerSubstring);
		
		String cadena2 = "En un lugar de la Mancha...";
		
		boolean igualesConEquals = cadena.equals(cadena2); //Compara ambos Strings y devuelve true si son iguales.
		
		boolean igualesConOperadorIgual = cadena == cadena2;
		
		System.out.println(igualesConEquals);
		System.out.println(igualesConOperadorIgual);
		
		String subCadena = cadena2.substring(3); //Devuelve la subcadena a partir del índice 3 incluído
		
		String subCadena2 = cadena2.substring(2, 5); //Devuelve la subcadena comprendida entre el índice 2 incluído
		//y el 5 sin incluir
		
		System.out.println(subCadena);
		String trozos[] = cadena.split(" "); //Trocea la cadena en subcadenas y devuelve una matriz con las subcadenas
		String trozoCero = cadena.split(" ")[0];//Obtiene la posición cero de la matriz devuelta por split
	}

}
