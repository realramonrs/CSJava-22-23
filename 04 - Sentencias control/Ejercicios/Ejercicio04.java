
package Ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas , horasExtra;
		float tasa;
		float salarioBruto , salarioNeto;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce horas trabajadas : ");
		horas = lector.nextInt();
		System.out.println("Introduce tasa : ");
		tasa = lector.nextInt();
		
		horasExtra = horas > 38 ? horas - 38:0;
		
		if(horas <= 38) {
			salarioBruto = horas*tasa;
		}
		else {
			salarioBruto = 38*tasa + horasExtra*1.5f*tasa;
		}
		
		salarioNeto = salarioBruto < 300 ? salarioBruto : (float)(salarioBruto*0.9) ;
		//O lo podemos hacer con un if else
		if(salarioBruto<=300) {
			salarioNeto = salarioBruto;
		}
		else {
			salarioNeto = (float)(salarioBruto*0.9);
		}
		
		System.out.println("Salario Bruto : " + salarioBruto);
		System.out.println("Salario neto : " + salarioNeto);
	}

}
