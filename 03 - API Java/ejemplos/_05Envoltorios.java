package ejemplos;

public class _05Envoltorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Convertir números en Strings
		float n1 = 3.45f;
		Float n1Wrapper = new Float(n1);
		String n1Cadena = n1Wrapper.toString();
		//Cuantos decimales tiene n1 ??
		
		
		int n2 = 5;
		Integer n2Wrapper = new Integer(n2);
		String n2Cadena = n2Wrapper.toString();
		String n2Binario = n2Wrapper.toBinaryString(n2);
		
		
		
		//Convertir Strings a números
		
		String n3 = "234.56";
		float n3Float = Float.parseFloat(n3);
		System.out.println(n3Float);
		
		String n4 = "23";
		int n4Int = Integer.parseInt(n4);
				
		//Envoltorio Character
		
		char caracter = '3';
		boolean esNumero = Character.isDigit(caracter);
		System.out.println(esNumero);		
						
	}

}
