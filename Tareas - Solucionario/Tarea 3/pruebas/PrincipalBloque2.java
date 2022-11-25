package pruebas;
import java.util.Scanner;

import bloqueEjercicios1.MTDNumeros;
import bloqueEjercicios2.MTDCadenas;

public class PrincipalBloque2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		public static void main(String[] args) {
		int x[][] ={{1,1,1},{2,2,2},{3,3,3}};
		Scanner lector = new Scanner(System.in);
		int opcion = 0;
		
		do{
			System.out.println("Escoja una opción:1-9");
			opcion = lector.nextInt();
			
			switch(opcion){
			case 1:
				String dni = "12751597";
				
				System.out.println(MetodosCadenas.letraDNI(dni));
				break;
			case 2:
				
				String palabra2 = "cocodrilo";
				
				System.out.println(MetodosCadenas.crearCadenaConGuiones(palabra2,'o'));
				break;
			case 3:
				String palabra3 = "cocodrilo";
				
				System.out.println(MetodosCadenas.crearCadenaConGuiones(palabra3,'o','c'));
				
				break;
			case 4:
				String palabra4="Teng0 algún d1g1to";
				System.out.println(palabra4 + " tiene dígitos mayúsculas y minúsculas? " + MetodosCadenas.contieneDigMinMay8Car(palabra4));
				break;
			
			case 5:
				String palabra5 = "Codificando codificando ando";
				System.out.println(palabra5);
				System.out.println(MetodosCadenas.codificar(palabra6));
				
				break;
			
			}
			
		}
		while(opcion!=11);
		
		System.out.println("Adiós , gracias por jugar con nosotros!!.");

	

	}

}
