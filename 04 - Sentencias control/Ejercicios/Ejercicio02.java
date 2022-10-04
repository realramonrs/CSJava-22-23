
package Ejercicios;

public class Ejercicio02 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resolución ecuación de segundo grado
		int a ,b,c;
		double x1 = 0 , x2 = 0;
		boolean solucion = false;
		
		a = 1;
		b = -5;
		c = 1;
		
		if(a==0) {
			//bx + c = 0; --> x1 = x2 = -c/b
			if(b==0) {
				System.out.println("No tiene solución");
			}
			else {
				solucion = true;
				x1 = x2 = -c/b;
			}
		} //Final del caso a = 0
		else if(b==0) {
			//ax2 + c = 0 --> x1 = Raiz(-c/a) , x2 = -Raiz(-c/a)
			double radicando = -c/a;
			if(radicando<0) {
				System.out.println("No tiene solución");
			}
			else {
				solucion = true;
				x1 = Math.sqrt(radicando);
				x2 = -Math.sqrt(radicando);
			} 
		} //Final del caso b = 0
		else if(c==0) {
			//ax2 + bx = 0 --> x(ax+b) = 0 --> x1 = 0 , x2 = -b/a;
			x1 = 0;
			x2 = -b/a;
			solucion = true;
		}
		else {
			//ax2 + bx + c = 0 -->x1 = -b + Raiz(b2 -4ac)/2a ; x2 = -b - RAiz(b2-4ac)/2a
			double radicando = b*b - 4*a*c;
			
			if(radicando<0) {
				System.out.println("No tiene solución");
			}
			else {
				x1 = (-b + Math.sqrt(radicando))/(2*a);
				x2 = (-b - Math.sqrt(radicando))/(2*a);
				solucion = true;
			}
		} //Final del caso else
		
		//Evaluamos si hay solución
		if(solucion) {
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			
		}
		
				
	}

}
