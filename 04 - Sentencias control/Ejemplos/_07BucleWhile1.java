package Ejemplos;

public class _07BucleWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;  // Variable que controlara el bucle
		
		int n = 20;
		
		while(i<n) {  //Condición de continuidad
			System.out.print(i + " ");
			
			i= i + 1; // Incremento de la variable de control
		}
		
		//Suma de n numeros
		
		int suma = 0;
		
		i=1;
		while(i < n) {
			suma = suma + i;
			i+=1;
		}
		
		

	}

}
