
package Ejercicios;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[] = {1,0,9,-8,0,7,4,0};
		int posicion = -1;
		for(int i=0;i<matriz.length;i++) {
			if(matriz[i]<0) {
				posicion = i;
				break;
			}
		}
		
		if(posicion == -1) {
			System.out.println("No hay numeros negativos");
			
		}
		else {
			System.out.println("Primer número negativo en posición : " + posicion);
		}
	}

}
