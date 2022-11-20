/**
 * 
 */
package ejercicio09;

/**
 * @author Ramon RS
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lugar misLugares[] = new Lugar[10];
		
		misLugares[0] = new Lugar("Monte Cepudo", "Camiño 14 Valladares",new GeoPunto(42.170482, -8.734274),"986545454",
				"Grandes Vistas de la Ria de Vigo",9);
		misLugares[1] = new Lugar("Villa Romana de Toralla", "Barrio Illa Toralla 2",new GeoPunto(42.197275, -8.795315),"6753455612",
				"Cerca de la playa del Bao",6);
		misLugares[2] = new Lugar("Asador Soriano", "Rúa dos Chans 2",new GeoPunto(42.199306, -8.680958),"986101010",
				"Las mejores carnes de la ciudad",10);
		misLugares[3] = new Lugar("Estadio de Balaidos", "Avda Balaídos",new GeoPunto(42.212605, -8.740066),"986909090",
				"El mejor fútbol de Galicia",10);
		
		double disatancia01 = Lugar.calcularDistacia(misLugares[0], misLugares[1]);
		double disatancia02 = Lugar.calcularDistacia(misLugares[0], misLugares[2]);
		double disatancia03 = Lugar.calcularDistacia(misLugares[0], misLugares[3]);
		
		
		//Mejor con un bucle
		
		for(int i = 0;i<misLugares.length&&misLugares[i]!=null;i++) {
			for(int j = i;j<misLugares.length&&misLugares[j]!=null;j++) {
				if(i==j)
					continue;
				else {
					System.out.println("La distancia entre " + misLugares[i].getNombre() + " y " +
										misLugares[j].getNombre() + " es de : ");
					System.out.println(Lugar.calcularDistacia(misLugares[i], misLugares[j])/1000 + " Kms");
				}
			}
		}
		
		//Mostrar el que tenga la valoración más alta
		float valoracion = misLugares[0].getValoracion();
		Lugar masValorado = null;
		for(Lugar l : misLugares) {
			if(l!=null) {
			if(l.getValoracion()>valoracion) {
				valoracion = l.getValoracion();
				masValorado = l;
			}
			}
		}
		
		if(masValorado==null) {
			System.out.println("El más valorado es: " + misLugares[0]);
		}
		else {
			System.out.println("El mas valorado es: " + masValorado);
		}
		
	}

}
