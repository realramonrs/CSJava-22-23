package Ejemplos;

public class _03IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Clasificar una nota como Suspenso, Aprobado , Notable o Sobresaliente
		
		float nota = 5.5f;
		
		if(nota<0 || nota > 10) {
			System.out.println("Error en la nota");
		}
		else if(nota <5) {
			System.out.println("Suspenso");
		}
		else if(nota < 7) {
			System.out.println("Aprobado");
		}
		else if (nota <9) {
			System.out.println("Notable");
		}
		else {
			System.out.println("Sobresaliente");
		}
		
	}

}
