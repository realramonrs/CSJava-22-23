import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//Generamos la matriz con los valores aleatorios
				int matriz[] = new int[10];
				Random aleatorio = new Random();
				
				for(int i = 0; i<matriz.length; i++) {
					matriz[i]= aleatorio.nextInt(100);
				}		
				
				char opcion ;
				
				boolean salir = false;
				do {
					
				System.out.println("");
				System.out.println("Seleccione una opción:");
				System.out.println("a. Mostrar valores superiores a uno introducido por teclado");
				System.out.println("b. Calcular la media de los 50 primeros valores almacenados");
				System.out.println("c. Mostrar por pantalla los 10 primeros valores que sean superiores a 20 junto con las posiciones que ocupan");
				System.out.println("d. Mostrar por pantalla el primer valor inferior a 5");
				System.out.println("e. Mostrar por pantalla los valores que sean primos");
				System.out.println("f. Mostrar el valor máximo y el mínimo del array ");
				System.out.println("g. Mostrar por pantalla aquellos valores que sean múltiplos de 3 y 5 en binario");
				System.out.println("h. Cerrar programa");
				Scanner lector = new Scanner(System.in);
				opcion = lector.nextLine().charAt(0);
				
				//Mostrar el array generado
				System.out.println("Array generado: ");
				for(int n : matriz){
					System.out.print(n + " ");
				}
				System.out.println();
				switch (opcion) {
				
				// Apartado A - Mostrar valores superiores a uno introducido por teclado
				case 'a':
					System.out.println("");
						System.out.println("Introduzca un número del 0 al 100");
						int valorInt = lector.nextInt();

						System.out.print("Valores superiores a " + valorInt + ":");
						
						for(int i = 0; i<matriz.length; i++) {
							if(matriz[i]>valorInt) {
								System.out.print(" " + matriz[i]);
							}
						}
						
						break;
				
				case 'b':
					// Apartado B - Calcular la media de los 50 primeros valores almacenados
					int suma = 0;
					int media;
					
					for(int i = 0; i<50; i++) {
						suma+=matriz[i];
						
					}
					
					media = suma/50;
					System.out.println("");;
					System.out.println("La media de los primeros 50 valores es de: " + media);
					System.out.println("");
					break;
				
				case 'c':
					/* Apartado C - Mostrar por pantalla los 10 primeros valores que sean superiores a 20 junto con
					las posiciones que ocupan.*/
					
					int contador= 0;
					;
					for(int i = 0; i<matriz.length && contador<10; i++) {
						if(matriz[i]>20) {
							
							System.out.println("El número " + matriz[i] + " es mayor de 20, y ocupa la posición " + i);
							contador++;
							
						}
				
					}
					System.out.println(""); 
					break;
				
				case 'd':
					for(int i = 0; i<matriz.length; i++) {
						if(matriz[i]<5) {
							System.out.println("El número " + matriz[i] + " es el primer valor inferior a 5");
							break;
						}
					}
					System.out.println(""); 
					break;
				
				case 'e':
					//Apartado E - Mostrar por pantalla los valores que sean primos. 
					
					for(int i = 0; i<matriz.length; i++ ) {
						int contador2=0;
						for(int j = 1; j<=matriz[i]; j++) {
							if(matriz[i]%j==0) {
								contador2+=1;
							}
						}
						if(contador2==2) {
							System.out.println("El número " + matriz[i] + " es primo");
						}			
					}
					
					break;
				case 'f':
					
					//Apartado F - Mostrar el valor máximo y el mínimo del array
					int valorMax=matriz[0],valorMax2 = matriz[0];
					int valorMin=matriz[0],valorMin2 = matriz[0];
					int posMax = -1,posMax2 = -1;
					int posMin = -1,posMin2 = -1;
					for(int i = 0; i<matriz.length; i++) {
						if(matriz[i]>valorMax) {
							valorMax= matriz[i];	
							posMax = i;
						}
						if(matriz[i]<valorMin) {
							valorMin= matriz[i];	
							posMin = i;
						}
					} 
					
					//Para obtener el segundo valor más alto vuelvo a recorrer la matriz pero esta vez no tengo en cuenta 
					//la posición en la que está el valor más alto
					for(int i = 0; i<matriz.length; i++) {
						if(i==posMax)
							continue;
						if(matriz[i]>valorMax2) {
							valorMax2= matriz[i];	
							posMax2 = i;
						}
						
					} 
					
					//Para obtener el segundo valor vuelvo a recorrer la matriz pero esta vez no tengo en cuenta 
					//la posición en la que está el valor más bajo
					for(int i = 0; i<matriz.length; i++) {
						if(i==posMin)
							continue;
						if(matriz[i]<valorMin2) {
							valorMin2= matriz[i];	
							posMin2 = i;
						}
						
					} 
					
					System.out.println("Valor Máximo: " + valorMax);
					System.out.println("Segundo valor Máximo: " + valorMax2);
					System.out.println("Valor Mínimo: " + valorMin);
					System.out.println("Segundo Valor Mínimo: " + valorMin2);
					break;
				case 'g':
					// Apartado G -Mostrar por pantalla aquellos valores que sean múltiplos de 3 y 5 en binario
					
					for(int i = 0; i<matriz.length; i++ ) {
						if((matriz[i]%3)==0 && (matriz[i]%5)==0){
							System.out.println(matriz[i] + " -----> " + Integer.toBinaryString(matriz[i]));
								}	
							}
					break;
				
				case 'h':
					// Apartado H - Salir
					salir= true;
					System.out.println("El programa ha sido cerrado con éxito.");
					break;
				}
			}
				while(!salir);
			}

	}


