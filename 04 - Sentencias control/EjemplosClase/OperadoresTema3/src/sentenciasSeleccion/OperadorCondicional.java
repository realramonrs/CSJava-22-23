package sentenciasSeleccion;

public class OperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que si una variable es > 100 la resetea a 0 y si es menor le suma 10
		int variable = 200;
		
		/*if(variable>100) {
			variable = 0;
		}
		else {
			variable+=10;
		}*/
		
		variable = variable > 100 ? 0 : variable+10;
		
		System.out.println("Variable = " + variable);
		
		//Programa que clasifica una nota como suspenso,aprobado , sobresaliente
		String calificacion;
		float nota = 7.7f;
		
		calificacion = nota < 5 && nota >0 ? "suspenso" : nota < 7 ? "Aprobado": "Sobresaliente";
		System.out.println("La calificación es de : " + calificacion);
	}

}
