import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		 System.out.println("Adivina el número");
	        System.out.println("Escoge un nivel:");
	        System.out.println("1. Número entre 1 y 15, 3 intentos.");
	        System.out.println("1. Número entre 1 y 30, 4 intentos.");
	        System.out.println("1. Número entre 1 y 50, 5 intentos.");

	        Scanner lectorNivel = new Scanner(System.in);
	        char gmcLevel = lectorNivel.nextLine().charAt(0);
	        switch (gmcLevel) {
	            case '1':
	                jugar(3, 1, 16);
	                break;
	            case '2':
	                jugar(4, 1, 31);
	                break;
	            case '3':
	                jugar(5, 1, 51);
	                break;
	        }
	    }

	    static void jugar(int limiteIntentos, int limInferior, int limSuperior) {
	        int intentos = 0;
	        Scanner lector = new Scanner(System.in);
	        int numeroAleatorio = new Random().nextInt(limSuperior - limInferior) + limInferior;

	        while (intentos < limiteIntentos) {
	            System.out.println("Adivina el número entre " + limInferior + " y " + (limSuperior - 1));
	            int gmcGuessedNumber = lector.nextInt();
	            if (gmcGuessedNumber == numeroAleatorio) {
	                System.out.println("Enhorabuena! Adivinaste el número " + numeroAleatorio + "!");
	                System.exit(0);
	                break;
	            }
	            intentos++;
	        }

	        System.out.println("Perdiste :(, el número era el " + numeroAleatorio);
	    }
	

}
