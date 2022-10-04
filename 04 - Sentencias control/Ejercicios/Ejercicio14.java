/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String matriz[] = new String[5];
		int opcion = 0;
		char continuar;
		Scanner lector = new Scanner(System.in);
		//Mostramos un menú con las opciones
		do {
			System.out.println("Escoja la opción deseada: ");
			System.out.println("1. Guardar palabra.");
			System.out.println("2. Contar palabras con t");
			System.out.println("3. Buscar palabra");
			System.out.println("4. Salir del programa");
			opcion = lector.nextInt();
	
			switch(opcion) {
			case 1:
				String palabra = null;
				
				System.out.println("Introduce una palabra y la guardo en la matriz");
				lector = new Scanner(System.in);
				palabra = lector.nextLine();
			
				boolean guardado = false;
				for(int i = 0;i<matriz.length;i++) {
					if(matriz[i] == null) {
						matriz[i] = palabra;
						guardado = true;
						break;
					}
				}
				
				if(guardado) {
					System.out.println("Palabra guardada correctamente");
				}
				else {
					System.out.println("No se ha podido guardar la palabra");
				}
				break;
			case 2:
				int contador = 0;
				for(String p : matriz) {
					if(p!=null) {
						if(p.indexOf("t")>=0) {
							contador+=1;
					}
					}
				}
				
				System.out.println("Hay " + contador + " palabras con t");
				break;
			case 3:
				String palabraBuscada = null;
				lector = new Scanner(System.in);
				System.out.println("Palabra que desea buscar: ");
				palabraBuscada = lector.nextLine();
				
				boolean encontrada = false;
				for(String p : matriz) {
					if(p.equals(palabraBuscada)) {
						encontrada = true;
						break;
					}
				}
				
				if(encontrada) {
					System.out.println("Palabra encontrada");
				}
				else {
					System.out.println("Palabra no encontrada");
				}
				
				break;
				
				default:
					System.out.println("Error en la opción");
					break;
			}
			
			lector = new Scanner(System.in);
			System.out.println("Desea continuar s/n ?");
			continuar = lector.nextLine().charAt(0);
		}
		
		while(continuar=='s');
	
	}

}
