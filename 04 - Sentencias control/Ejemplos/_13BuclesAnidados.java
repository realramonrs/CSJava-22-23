package Ejemplos;

public class _13BuclesAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mostrar divisores de los números comprendidos entre el 3 y el 8
		//Con bucle for
		
		for(int i = 3;i<=8;i++) {
			System.out.println("Divisores del " + i);
			for(int j = 1;j<=i;j++) {
				if(i % j == 0) {
					System.out.print(j + " ");
				}
			} //Llave que cierra el bucle for interno
			System.out.println();
		}//Llave que cierra el bucle for externo
		
		
		//Lo mismo pero con un while
		System.out.println();
		System.out.println("****** Con bucles While *******");
		System.out.println();
		int i = 3;
		
		while(i<=8) {
			System.out.println("Divisores del " + i);
			int j = 1; // Importante declarala justo aquí , para que se reinicie en cada
			//iteración del bucle externo , para cada valor nuevo de i la j debe volver a valer 1
			while( j<=i) {
				if(i % j == 0) {
					System.out.print(j + " ");
				}
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		
		
		
		
		

	}

}
