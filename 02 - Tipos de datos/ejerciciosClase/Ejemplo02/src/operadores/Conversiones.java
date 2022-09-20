package operadores;

public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Implícitas --> No necesita codigo adicional , son siempre seguras
		byte x = 10;
		short y = x;
		float z = 3.4f;
		double d = z;
		
		//Explícitas --> Necesitamos añadir código , no son seguras.
		
		int n = 200;
		byte b = (byte) n;
		
		
		
	}

}
