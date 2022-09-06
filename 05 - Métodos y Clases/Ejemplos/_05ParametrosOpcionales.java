package ejemplos;

public class _05ParametrosOpcionales {

	static double calcularMedia(int...n) {
		double suma = 0;
		double media=0;
		
		for(int i = 0;i<n.length;i++) {
			suma+=n[i];
		}
		
		media = suma/n.length;
		return media;
	}
	
	static void buscarCaracteres(String cadena,char...c) {
					
		for(int i = 0;i<c.length;i++) {
			System.out.print("la letra " + c[i] + " está en las posiciones: ");
			for(int j = 0;j<cadena.length();j++) {
				if(c[i]==cadena.charAt(j)) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double m1 = calcularMedia(4,5,3,1);
		int a = 9;
		int b = 1;
		int c = 3;
		
		double m2 = calcularMedia(a,b,c);
		
		buscarCaracteres("Hola caracola",'o','c');
		buscarCaracteres("Otra cadena",'a');
		
		
	
		
	}

}
