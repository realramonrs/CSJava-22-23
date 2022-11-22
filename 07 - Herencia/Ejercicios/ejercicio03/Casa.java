/**
 * 
 */
package ejercicio2;

/**
 * @author Ramon RS
 *
 */
public class Casa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mueble misMuebles[] = new Mueble[8];
		
		misMuebles[0] = new Mesa(250,"Redonda",4);
		misMuebles[1] = new Silla(55,"Crema");
		misMuebles[2] = new Silla(55,"Crema");
		misMuebles[3] = new Silla(55,"Crema");
		misMuebles[4] = new Silla(55,"Crema");
		misMuebles[5] = new Cama(575,150,200);
		misMuebles[6] = new Mesa(72,"Rectangular",1);
		misMuebles[7] = new Silla(25,"Azul");
		
		for(Mueble m : misMuebles) {
			System.out.println(m);
		}
		
		//Calcular precio total
		double precioTotal = 0;
		
		for(Mueble m : misMuebles) {
			precioTotal+=m.getPrecio();
		}
		
		System.out.println("El precio final es : " + precioTotal);
		
		
		
		
	}

}
