/**
 * 
 */
package Ejercicios;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio10 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Encontrar vocales en un String
		//Este ejercicio se podría hacer más rápido con expresiones regulares 
		//Pero vamos a realizarlo con los conocimientos del tema , pero los
		//que ya sabeis podríais investigar sobre como utilizar expresiones regulares en Java
		
		String frase ="El murciélago se comió la fruta";
		
		for(int i = 0;i<frase.length();i++) {
			char letra = frase.charAt(i);
			if(letra=='a'||letra=='e'||letra=='i'||
				letra=='o'||letra=='u'){
					//No detecta vocales con acento , tendría que añadírselo en el if 'á' , 'é' ...
					System.out.println("Vocal " + letra + " en posicion : " + i);
				}
		}
		
	}

}
