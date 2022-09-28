
public class Ejercicio7 {
	public static void main(String[] args) {
		
		//precioVenta = importe + CI + (IMPUESTOREVAL *Antiguedad/100)*precioCatastral
		
		final float IMPUESTOREVAL = 3.4F;
		
		float importe = 350000;
		
		float ci = importe*0.03f;
		float antiguedad = 4;
		float precioCatastral = 120000;
		
			float precioVenta = importe + ci + (IMPUESTOREVAL*antiguedad/100)*precioCatastral;
			
			System.out.println("Precio final del inmueble: " + precioVenta);
		
				
	}
	
}
