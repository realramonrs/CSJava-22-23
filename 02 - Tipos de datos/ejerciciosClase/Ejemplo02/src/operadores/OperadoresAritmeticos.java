package operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Operadores : +,-,*,/ , %, +=,-=,*=,/= , ++, --
		
		int resultado = 8 + 9;
		short x = 23000,y = 20000;
		int resultado2 = x + y;
		
		short resultado3 = (short) (x + y);
		
		System.out.println("Resultado3 : " + resultado3);
		
		float r = 4.5f;
		int i = 20;
		
		//int resultado4 = (int) (r*i);
		float resultado4 = r*i;
		
		System.out.println("Resultado4 : " + resultado4);
		
		//Si dos valores tienen diferentes tipos de datos , 
		//Java promocionará automáticamente el más pequeño al más grande de los dos.
		float f1 = 5.6f;
		double d1 = 6.7;
		float res5 = (float) (f1 + d1);
		double res6 = f1 + d1;
		
		//Las variables más pequeñas , byte , short y char se convierten en 
		//int cada vez que son utilizadas con estos operadores.
		byte x2 = 9;
		int z = 8;
		int  res = x2*z;
		int res2 = x2 + z;
		int res3 = x2 - z;
		
		//Operador cociente
		int n1 = 10;
		float resultado7 = (float)n1 / 3;
		float resultado8 = n1 / 3f;
		System.out.println("Resultado7: " + resultado7);
		int n2 = 0;
		
		
		int resultado9= 0;
		try {
			resultado9 = n1/n2;
		}
		catch(ArithmeticException a) {
			
			System.out.println("No se puede dividir por cero.");
		}
		catch(Exception e) {
			System.out.println("No se pudo realizar la operación.");
		}
		
		
		double x11 = 9,x22 = 0;
		double resultado10 = x11/x22;
		System.out.println("Resultado: " + resultado10);
		
		//Operador resto %
		
		int v1 = 450;
		int resto = 450 % 3;
		System.out.println("Resto : " + resto);
		
	}

}
