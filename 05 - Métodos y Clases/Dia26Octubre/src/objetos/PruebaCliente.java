package objetos;

import java.util.Scanner;

public class PruebaCliente {

	public static String getDNI(Cliente c) {
		return c.dni;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente(10000,true);
		
		//Acceder a los atributos del objeto referenciado por c
		//usaremos el operador punto.
		System.out.println("Datos del cliente: ");
		System.out.println("Nombre: " + c.nombre);
		System.out.println("Saldo : " + c.consultaSaldo());
		System.out.println("VIP : " + c.vip);
		
		//Modificar datos cliente
		c.nombre = "Pedro";
		c.dni = "12345678R";
		//Aumentar el saldo de c
		c.ingresarDinero(1000);
		
				
		System.out.println("Nuevo saldo: " + c.consultaSaldo());
		
		
		
	}

}
