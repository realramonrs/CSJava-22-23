
public class Recursividad {
	
	//Calcular el factorial de un número
	//5! = 5*4*3*2*1
	//0! y 1! = 1
	
	public static long factorial(int n) {
		long resultado = 1;
		if(n==0) { 
			return 1;
		}
		else {
		for(int i = 1;i<=n;i++) {
			resultado = resultado*i;
		}		
		return resultado;		
		}
	}
	
	public static long factorialRecursivo(int n) {
		//long f;
		if(n==0) {
			
			return 1;
		}
		else {
			
			return n*factorialRecursivo(n-1);
		}
		
	}
	

}
