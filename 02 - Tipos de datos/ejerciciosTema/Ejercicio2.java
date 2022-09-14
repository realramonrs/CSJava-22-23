package ejercicios;

import java.text.DecimalFormat;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcular el área , la longitud y el volumen de una
		//esfera a partir del radio
		
		float radio = 4;
		float longitud , volumen , area;
		
		longitud = 2*radio*(float)Math.PI;
		area = (float)Math.PI*radio*radio;
		volumen = (4f/3)*(float)Math.PI*radio*radio*radio;
		
		System.out.println("Un circulo de radio " + radio);
		System.out.println("Tiene una longitud de " + longitud);
		System.out.println("Un area de " + area);
		System.out.println("Un volumen de " + volumen);
		
		//Para formatear la salida , por ejemplo que solo se muestren 2 decimales
		//podríamos hacer lo siguiente
		DecimalFormat df = new DecimalFormat("####.##");
		System.out.println(df.format(longitud));
		
		//Otra alternativa es utilizar les métodos printf y format
		System.out.printf("%.2f", longitud);
	}

}
