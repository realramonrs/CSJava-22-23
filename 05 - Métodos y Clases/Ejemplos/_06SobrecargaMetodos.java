package ejemplos;

public class _06SobrecargaMetodos {

	static double elevar(int numero) {
		return Math.pow(numero, 2);
	}
	
	//Sobrecargamos el método anterior para poder indicar la potencia
	
	static double elevar(int numero, int potencia) {
		return Math.pow(numero, potencia);
	}
	
	
	static double calcularMedia(int...n) {
		
		double suma = 0;
		double media=0;
		
		for(int i = 0;i<n.length;i++) {
			suma+=n[i];
		}
		
		media = suma/n.length;
		return media;
	}
	
	static double calcularMedia(double...n) {
		double suma = 0;
		double media=0;
		
		for(int i = 0;i<n.length;i++) {
			suma+=n[i];
		}
		
		media = suma/n.length;
		return media;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double res = elevar(4);
		double res1 = elevar(4,4);
		
		double resMedia1 = calcularMedia(4,3,2);
		double resMedia2 = calcularMedia(5.65,4.89);

	}

}
