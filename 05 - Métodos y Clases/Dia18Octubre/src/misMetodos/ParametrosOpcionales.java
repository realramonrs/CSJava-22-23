package misMetodos;

public class ParametrosOpcionales {

	public  double calcularMedia(int x) {
		return x;
	}
	
	public  double calcularMedia(int ob,int... x) {
		//De esta forma x es una matriz
		double media = ob, suma=ob ;
		/*if(x.length == 0) {
			media = suma;
		}
		else {*/
			for(int i = 0;i<x.length;i++) {
				suma = suma + x[i];
				
			//}
			media = suma / (x.length +1);
		}
		
		
		return media;
	}
	public static double suma(int...x) {
		int suma = 0;
		for(int i = 0;i<x.length;i++) {
			suma+=x[i];
		}
		return suma;
	}
	public static double suma(int x) {
		return x + 10;
	}
	
	
	
	
}
