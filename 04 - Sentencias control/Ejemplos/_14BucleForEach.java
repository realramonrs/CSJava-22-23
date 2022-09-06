package Ejemplos;

public class _14BucleForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[] = {4,5,1,2,-9,0,1,3,8};
		
		for(int valor:matriz) {
			System.out.print(valor + " ");
		}
		
		
		//No podemos modificar la matriz subyacente mediante la variable creada para iterar en este for
		
		for(int valor:matriz) {
			if(valor == 0) {
				valor = 1;
			}
		}
		
		for(int valor:matriz) {
			System.out.print(valor + " ");
		}
		
	}

}
