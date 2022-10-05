package sentenciasSeleccion;

public class Relacionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//> , < , >= , <= , == , !=
		
		//Devuelven un valor booleano
		int x = 9, y = 5;
		boolean condicion1 = x >y;
		boolean condicion2 = x == y;
		boolean condicion3 = x!=y;
		
		//Operadores Logicos --> Y logico && 
		// O lógico --> || --> 
		// No lógico --> !
		
		boolean condicion4 = condicion1 && condicion2;
		boolean condicion5 = condicion1 || condicion2;
		boolean condicion6 = !condicion5;
		
		
	}

}
