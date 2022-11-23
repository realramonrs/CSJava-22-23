package ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

public class TestPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password passwords[] = new Password[10];
		
		
		boolean salir = false;
		int opcion = 0;
		
		do {
			System.out.println("1. Intro password plus");
			System.out.println("2. Intro password free");
			System.out.println("3. Mostrar todas las password");
			System.out.println("4. Mostrar todas las password 'fuertes'");
			System.out.println("5. Mostrar todas las password plus");
			System.out.println("6. Mostrar todas las password free");
			System.out.println("7. Mostrar todas las password ordenadas");
			System.out.println("8. Salir.");
			opcion = new Scanner(System.in).nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Introduce password de 6 caracteres.Al menos debe haber un dígito");
				String ps = new Scanner(System.in).nextLine();
				PasswordPlus p1 = new PasswordPlus(ps);
				if(p1.validar(ps)) {
					//Lo guardamos en la primera pos vacía
					for(int i = 0;i<passwords.length;i++) {
						if(passwords[i]==null) {
							passwords[i] = p1;
							break;
						}
					}
				}
					else {
						System.out.println("El password no cumple requisitos. No ha sido guardado.");
					}
				
				break;
			case 2:
				System.out.println("Introduce password");
				String ps2 = new Scanner(System.in).nextLine();
				PasswordFree p2 = new PasswordFree(ps2);
				if(p2.validar(ps2)) {
					//Lo guardamos en la primera pos vacía
					for(int i = 0;i<passwords.length;i++) {
						if(passwords[i]==null) {
							passwords[i] = p2;
							break;
						}
					}
				}
					else {
						System.out.println("El password no cumple requisitos. No ha sido guardado.");
					}
				
				
				break;
			case 3:
				for(Password p : passwords) {
					if(p!=null) {
						
						System.out.println(p);
					}
				}
				break;
			case 4:
				for(Password p : passwords) {
					if(p!=null) {
						if(p.getFortaleza().equals("fuerte"))
						System.out.println(p);
					}
				}
				break;
			case 5:
				for(Password p : passwords) {
					if(p!=null) {
						if(p instanceof PasswordPlus)
						System.out.println(p);
					}
				}
				break;
			case 6:
				for(Password p : passwords) {
					if(p!=null) {
						if(p instanceof PasswordFree)
						System.out.println(p);
					}
				}
				break;
			case 7:
				//Contamos passwords guardadas
				int contador = 0;
				for(Password p : passwords) {
					if(p!=null)
						contador++;
				}
				Password copia[] = Arrays.copyOf(passwords, contador);
				Arrays.sort(copia);
				for(Password pass: copia) {
					if(pass!=null) {
						System.out.println(pass);
					}
				}
			}
			
		}while(!salir);

	}

}
