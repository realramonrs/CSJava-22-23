package Ejemplos;

public class _16BuclesConStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Donde está un determinado caracter:
		
		String cadena = "En un lugar de la Mancha";
		char caracter = 'a';
		
		System.out.println("La letra " + caracter + " esté en las posiciones: ");
		for(int i = 0;i<cadena.length();i++) {
			if(cadena.charAt(i)=='a') {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//Buscar palabras que contengan el substring "lu"
		String [] palabras = cadena.split(" ");
		
		System.out.println("Palabras que tienen 'lu'");
		for(String palabra:palabras) {
			if(palabra.contains("lu")) {
				System.out.println(palabra);
			}
		}
		
		//Buscar primera posición vacía de una matriz de strings
		
		String [] cadenas = new String[10];
		cadenas[0] = "Cordoba";
		cadenas[1] = "Teruel";
		cadenas[2] = "Ceuta";
		
		for(int i = 0; i<cadenas.length;i++) {
			if(cadenas[i]==null) {
				cadenas[i] = "Pontevedra";
				break;
			}
		}
		
		
		
	}

}
