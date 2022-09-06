package ejemplos;

public class _04ConversionesTipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			Operaciones cast automáticas
			int i = 4;
			float f = i;
			
			byte numByte = 5;
			short numShort = 120;
			int numEntero = 20000;
			long numLong = 30000000000L;
			
			numShort = numByte;  // cast automática de byte a short
//			numByte = numShort // Error cast automático imposible
					
			numEntero = numShort; // cast automática de short a int
			
			float numRealSimple = numLong;
			
			double numRealDoble = numLong;
			
//			numLong =  numRealDoble;
//			numRealSimple =  numRealDoble;
			numRealDoble = numRealSimple;
			
			
//		************ Conversiones Explícitas ***************//
			
			double x = 9.5;
			float y = (float)x;
			
			int a= 4500;
			short b = (short)a;
			System.out.println("La variable b vale "  + b);
			
			int e = 25500;
			short bb = (short)e;
			
			System.out.println("La variable bb vale "  + bb);
			float t = 7.56f;
			int r = (int)t;
			System.out.println("La variable r vale "  + r + " se pierde la parte decimal");
			
			int s = 7;
			int q = 3;
			double division = (double)s/q;
			System.out.println(division);
			
			double num1 = 9.56;
			double num2 = 3.54;
			int division2 = (int)(num1/num2);  //La división resulta un double
			
			
			char letra = 'a';
			int codigoLetra = letra; //Al convertir int en char se obtiene el código interno del char
			
			System.out.println("El codigo del caracter " + letra + " es " + codigoLetra);		
			
	}

}
