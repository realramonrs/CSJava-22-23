package sentenciasSeleccion;
import javax.swing.*;
public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que presente un menú con 4 opciones al usuario
		// 1. Ejercicio1
		// 2. Ejercicio2
		// ...
		//El usuario escoje un ejercicio y se ejecuta.
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce un ejercicio:1 , 2 3 o 4"));
		int n = 2;
		
		switch(opcion) {
		
		default:
			System.out.println("Error en la opción escogida.");		
			break;
		case 1:
			//Cada caso es un bloque de código independiente, si declaramos variables
			//aquí dentro son locales, no existen sino se ejecuta este trozo de código
			int x= 4,y= opcion + 5;
			long potencia = (long)Math.pow(x,y);
			System.out.println("Ejercicio 1:");
			break;
		case 2:
			
			System.out.println("Ejercicio 2: ");
			break;
		
			
		case 3:
			System.out.println("Ejercicio 3: ");
			break;
		case 4:
			System.out.println("Ejercicio 4: ");
			break;
			} // Cierre del switch
		
		
		
	} // Cierre del main

} // cierre de la clase
