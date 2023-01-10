import java.util.Arrays;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura fs[] = new Figura[10];
		fs[0] = new Circulo(2);
		fs[1] = new Circulo(1.5f);
		fs[2] = new Triangulo(3,5);
		fs[3] = new Triangulo(1,2);
		fs[4] = new Rectangulo(3,5);
		Arrays.sort(fs);
				
		//Calcular el area de todas
		
		for(Figura f : fs) {
			if(f!=null) {
				System.out.println(f.calcularArea());
			}
		}
	}

}
