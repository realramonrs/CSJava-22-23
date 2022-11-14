package bucles;

import java.util.Arrays;
import java.util.Random;

public class EjemploArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temperaturas[] = new float[10];
		float suma = 0,media = 0;
		
		for(int i = 0;i<temperaturas.length;i++) {
			Random aleatorio = new Random();
			temperaturas[i] = aleatorio.nextInt(40) +  aleatorio.nextFloat();
		}
		//La temperatura media:
		for(int i = 0;i<temperaturas.length;i++) {
			suma = suma + temperaturas[i];
			//suma+= temperaturas[i];
		}
		
		media = suma/temperaturas.length;
		
		System.out.println(Arrays.toString(temperaturas));
		System.out.println("La temperatura media es de : " + media);
		

		//Contar cuantas veces se superó la temperatura media.
		int contador = 0;
		
		for(float valor : temperaturas) {
			if(valor > media) {
				contador++;
			}
		}
		
		
		
		
	}

}
