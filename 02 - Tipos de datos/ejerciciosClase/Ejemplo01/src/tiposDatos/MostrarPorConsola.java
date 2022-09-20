package tiposDatos;

import java.text.DecimalFormat;

public class MostrarPorConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x1 = 200;
		float f1 = 4.5578f;
		
		//Mostrar por pantalla texto y variables
		System.out.println("El valor de X1 es: " + x1 + " euros.");
		
		
		System.out.printf("El valor de f1 es: %.3f  \n",f1);
		//System.out.println();
		System.out.println("El valor de f1 es : " + f1);
		
		DecimalFormat df = new DecimalFormat("#.##");
		String f1bis = df.format(f1);
		System.out.println("f1bis = " + f1bis);
		
		System.out.println("Dijo El Quijote:\n \"Cuidado Sancho\"");
	}

}
