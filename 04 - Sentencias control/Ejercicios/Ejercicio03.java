
package Ejercicios;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b , c , d , menor;
		
		a=10;
		b = 40;
		c = 20;
		d = 9;
		
		if(a<b) {
			menor = a;
		}
		else {
			menor = b;
		}
		
		if(c<menor) {
			menor = c;
		}
		
		if(d<menor) {
			menor = d;
		}
		
		System.out.println("Menor : " + menor);
		
		//Otra forma
		menor = Math.min(a, Math.min(b, c));
		menor = Math.min(menor, d);
	}

}
