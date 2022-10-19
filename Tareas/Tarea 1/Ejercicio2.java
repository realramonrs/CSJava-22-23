/**
 * 
 */
package tarea;

import java.util.Scanner;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ES9820385778983000754892
				Scanner lector = new Scanner(System. in );
				
				System.out.println("Introduzca su IBAN");
				String iban = lector.nextLine();
				
			//a. Código del país.
				System.out.println("Codigo del pais: " + iban.substring(0, 2));
				
			//b. Dígito de control.
				System.out.println("Digito de control: " + iban.substring(2, 4));
				
			//c. Código de la caja.
				System.out.println("Codigo de la caja: " + iban.substring(4, 8));
				
			//d. Muestre true si los dos dígitos de control coinciden y false si no lo hacen.
				String digito1 = iban.substring(2, 4);
				String digito2 = iban.substring(12, 14);
				
				System.out.println(digito1.equals(digito2));
				
			
			//e. Número de cuenta.
				System.out.println("Numero de cuenta: " + iban.substring(14));
				
			//f. Cantidad total de caracteres de los que consta el iban.
				System.out.println("Cantidad total: "+ iban.length());
				
			//g. Muestre true si comienza por “ES” y false si no es así.
				boolean es = iban.startsWith("ES");
				System.out.println("Empieza por Es ?" + es);
				
			//h. Mostrar el dígito de control en binario.
				int digitoControl = Integer.parseInt(iban.substring(2, 4));
				String digitoBinario = Integer.toBinaryString(digitoControl);
				System.out.println("Digito de control en binario: " + digitoBinario);
				
				lector.close();
	}

}
