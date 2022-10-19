/**
 * 
 */
package tarea;

import javax.swing.JOptionPane;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = JOptionPane.showInputDialog("Escriba una frase");
		
		//a. Número de palabras introducidas.
			System.out.println("Número de palabras introducidas: " + frase.split(" ").length);
			
		//b. Número de caracteres no espacios.
			int caracteres = frase.length();
			int espacios = frase.split(" ").length - 1;
			System.out.println("Número de caracteres no espacios: " + (caracteres - espacios));
			
		//c. Comprobar si el primer caracter es un dígito.
			
			System.out.println("El primer caracter es un dígito?: " + Character.isDigit(frase.charAt(0));
			
		//d. Posición del primer espacio.
			System.out.println("Posición del primer espacio:"  + frase.indexOf(' '));
	}

}
