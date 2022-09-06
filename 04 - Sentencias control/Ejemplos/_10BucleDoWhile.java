package Ejemplos;

import java.io.IOException;
import java.util.Scanner;

public class _10BucleDoWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char opcion;
		
		do {
			
		
		
		System.out.println("Escoja una opción:");
		System.out.println("a) Calcular suma dos números.");
		System.out.println("b) Calcular resta dos números.");
		System.out.println("c) Calcular el producto de dos números.");
		System.out.println("d) Calcular la división.");
		System.out.println("e) Salir.");
		
		opcion = (char)System.in.read();
		
		}
		while(opcion!='e');

	}

}
