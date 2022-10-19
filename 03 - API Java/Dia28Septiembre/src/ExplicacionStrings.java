import java.util.Arrays;

public class ExplicacionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter = 'w';
		String mensaje = "Hala caracola";
		String mensaje2 = new String("De una vez!");
		int matriz[] = {1,5,4,3,2};
		int tamanho = matriz.length;
		
		//Métodos : 
		//length()
		int numeroCaracteres = mensaje.length();
		System.out.println("Nº de caracteres: " + numeroCaracteres);
		//charAt(indice) --> caracter que ocupa esa posición:
		char primeraLetra = mensaje.charAt(0);
		System.out.println("La primera letra: " + primeraLetra);
		
		//Programa que obtiene el último caracter de un String
		char ultimo = mensaje.charAt(mensaje.length()- 1) ;
		System.out.println("Ultimo caracter : " + ultimo);
		
		//indexOf(char c), y lastIndexOf(char c)
		
		//Buscar primera aparición de la letra a
		int posicionLetraa = mensaje.indexOf("a");
		System.out.println("La letra a está en la posición: " + posicionLetraa);
		
		int posicionSubstring = mensaje.indexOf("ol");
		
		System.out.println("La subcadena \"ol\" aparece en la posición: " + posicionSubstring);
		
		int posicionLetra2 = mensaje.indexOf("z");
		System.out.println("El caracter z está en la posición: " + posicionLetra2);
		
		//Sobrecarga del indexOf(String c,int fromIndex)
		//Buscar la segunda aparición de un caracter
		//int posicion2LetraA = mensaje.indexOf("a",3);
		mensaje = "HalaCelta";
		int posicion2LetraA = mensaje.indexOf("a",mensaje.indexOf("a")+1);
		System.out.println("Posicion Segunda a: " + posicion2LetraA);
		
		//lastIndexOf(ch c)
		int ultimaPosicion = mensaje.lastIndexOf("a");
		System.out.println("La última posición de la a es: " + ultimaPosicion);
		
		//subString(int indice)
		String subCadena = mensaje.substring(2);
		System.out.println(subCadena);
		
		String subCadena2 = mensaje.substring(2,5);
		System.out.println(subCadena2);
		
		//Obtener la última String
		mensaje ="Otra palabra. Esto es otra cosa";
		String ultimaPalabra = mensaje.substring(mensaje.lastIndexOf(" ") + 1);
		System.out.println(ultimaPalabra);
		
		//split(separador) --> Trocear el string original 
		String trocitos[] = mensaje.split(" ");
		String segundaPalabra = trocitos[1];
		System.out.println("Palabras: " + Arrays.toString(trocitos));
		System.out.println("Segunda palabra: " + trocitos[1]);
		
		//Obtener la segunda palabra de un String
		String primeraPalabra = mensaje.split(" ")[0];
		String segundaPalabra2 = mensaje.split(" ")[1];
		
		//Obtener la primera letra de la segunda palabar de un String
		String ejemplo = "Me gusta Java";
		char primeraLetraSegundaPalabra = mensaje.split(" ")[1].charAt(0);
		
		//replace(char c, char n)
		mensaje = "hala celta";
		mensaje = mensaje.replace('a','o');
		System.out.println("Ejemplo método replace: ");
		
		
		System.out.println(mensaje);
		
		//Concatenar strings
		String a1 = "Hola";
		String a2 = "Adios";
		String union = a1 + " " + a2;
		String union2 = a1.concat(" ".concat(a2));
		String union3 = a1.concat(" " + a2);
		System.out.println(union);
		System.out.println(union2);
		
		//startsWith endsWith
		boolean condicion = mensaje.startsWith("a") || mensaje.startsWith("A");
		
		boolean condicion2 = mensaje.endsWith("a") || mensaje.endsWith("A");
		
		//equals, equalsIgnoreCase
		String c1 = "Pedro";
		String c2 = new String("Pedro");
		
		System.out.println("Iguales? " + c1.equals(c2));
		System.out.println("Iguales ? " + c1.equalsIgnoreCase(c2));
		
		//Operador == , puedo pero no debo
		c1 = c2;
		boolean iguales = c1 == c2;
		
		System.out.println("Iguales ? " + iguales);
		
		
		
		
		
		
		
		
		
	}

}
