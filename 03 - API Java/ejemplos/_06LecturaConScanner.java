package ejemplos;

import java.util.Scanner;

public class _06LecturaConScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
        int edad;
        double salario;
            	
        //Creamos un Scanner para leer los datos
        Scanner lector = new Scanner(System.in);
        //Mandamos mensajes solicitando los datos
        System.out.println("Introduzca su nombre");
        //Guardamos el nombre que introduzca el usuario en la variable nombre
           nombre = lector.nextLine();
            	
           System.out.println("Introduzca la edad");
           edad = lector.nextInt();
            	
           System.out.println("Introduzca su salario base");
           salario = lector.nextDouble();

        //Comprobamos que los datos se guardan adecuadamente
           System.out.println("Nombre: " + nombre);
  	       System.out.println("Edad: " + edad);
  	       System.out.println("Salario base: " + salario);

	}

}
