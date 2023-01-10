import java.util.Arrays;

public class ExplicacionComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena[] = {"Pedro","Maria","Alejandro"};
		Arrays.sort(cadena);
		System.out.println("Array de Strings ordenado:");
		System.out.println(Arrays.toString(cadena));
		int numeros[] = {5,4,3,2,1};
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		Figura fs[] = new Figura[10];
		fs[0] = new Circulo(2);
		fs[1] = new Circulo(1.5f);
		fs[2] = new Triangulo(3,5);
		fs[3] = new Triangulo(1,2);
		fs[4] = new Rectangulo(3,5);
		Figura copia[];
		int contador = 0;
		for(Figura f : fs) {
			if(f!=null) {
				contador++;
			}
		}
		copia = new Figura[contador];
		copia = Arrays.copyOf(fs,contador);
		Arrays.sort(copia);
		
		for(Figura f : copia) {
			if(f!=null)
			System.out.println(f.getNombre() + " " + f.calcularArea());
		}
				
	}

}
