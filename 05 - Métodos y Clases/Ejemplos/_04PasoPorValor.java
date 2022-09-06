package ejemplos;

public class _04PasoPorValor {

	static void resetear(int numero) {
		numero = 0;
	}
	static int resetear() {
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		resetear(x);
		
		x = resetear();

	}

}
