
package Ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Detectar números primos
		
		int numero  = 7;
		
		boolean primo = true;
		
		for(int i = 2;i<numero;i++) {
			if(numero%i==0) {
				primo = false;
				break;
				
			}
		}
		
		if(primo) {
			System.out.print("Número primo");
		}
		else {
			System.out.println("Número no primo");
		}
		
		
		
		
	}

}
