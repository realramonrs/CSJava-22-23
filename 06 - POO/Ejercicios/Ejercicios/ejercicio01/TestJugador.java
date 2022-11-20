package ejercicio01;

import java.util.Scanner;

public class TestJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Establecer competición: 
		Jugador.setCompeticion( "Torneo Regional de Domingueros");
		Jugador j1 = new Jugador();
		j1.setCodigo("A3");
		j1.actualizarPuntos(10);
		j1.actualizarPuntos(20);
		Jugador j2 = new Jugador();
		j2.setCodigo("A3");
		j2.actualizarPuntos(20);
		String codigo ;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca el codigo del jugador:");
		codigo = lector.next();
				
		
		Jugador j3 = new Jugador(codigo,"Marcos");
		
		System.out.println("Puntos j1: " + j1.getPuntos());
		System.out.println("Código de j1 " + j1.getCodigo() );
		System.out.println("Código de j3 " + j3.getCodigo());
		
		//Mostrar toda la info de j3 por pantalla
		System.out.println("Jugador j3");
		System.out.println(j3 + " " + Jugador.getCompeticion() + "Fecha Creacion: " + j3.getFechaCreacion());
		System.out.println("Jugador j2");
		System.out.println(j2 + " " + Jugador.getCompeticion() + "Fecha Creacion: " + j3.getFechaCreacion());
		
		
		//Método hashcode
		
		System.out.println("Hashcode de j1 : " + j1.hashCode());
		System.out.println("Hashcode de j2 : " + j2.hashCode());
		System.out.println("Hashcode de j3 : " + j3.hashCode());
		
		//Prueb método comparaJugadores
		System.out.println("Quien tiene más ptos j1 o j2?");
		System.out.println(Jugador.comparaPuntos(j1, j2));
		
		//Que día se creó el jugador j3??
		int diaCreacion = j3.getFechaCreacion().getDayOfMonth();
		System.out.println("Dia creacion j3 = " + diaCreacion);
		
		
		
	}

}
