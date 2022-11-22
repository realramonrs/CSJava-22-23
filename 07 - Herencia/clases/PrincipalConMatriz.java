package clases;

public class PrincipalConMatriz {

	public static boolean guardarProducto(Producto []ps,Producto p) {
		boolean guardado = false;
		for(int i = 0;i<ps.length;i++) {
			if(ps[i]==null) {
				ps[i] = p;
				guardado = true; 
				break;
			}
		}
		return guardado;
	}
	
	public static boolean guardarMutable(Mutable []ps,Mutable p) {
		boolean guardado = false;
		for(int i = 0;i<ps.length;i++) {
			if(ps[i]==null) {
				ps[i] = p;
				guardado = true; 
				break;
			}
		}
		return guardado;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto productos[] = new Producto[10];
		
		//Guardamos algunos productos
		productos[0] = new Ordenador("AQ123","Lenovo","Ideapad 200",550,128,"Windows 10",(byte)4);
		productos[3] = new Televisor("AW100","Panasonic","Ni idea",750,80,500);
		
		guardarProducto(productos,new Televisor("QE442","Samsung","A saber",400,40,100));
		guardarProducto(productos,new Ordenador("LT3343","Asus","Yoga 3000",900,1000,"Windows 10",(byte)8));
		
		
		//Applicar un descuento a todos los productos
		for(Producto p : productos) {
			if(p!=null) {
				p.aplicarDescuento();
			}
			
		}
		
		//Modificar precio de los Tv panasonic
		
		for(Producto p : productos) {
			if(p instanceof Televisor) {
				if(((Televisor)p).getMarca()=="Panasonic") {
					p.setPrecio(p.getPrecio()+50);
					}
				}
			}
		
		//Matriz de productos Mutable
		Mutable m[] = new Mutable[5];
		guardarMutable(m,new Libro("978970456X","Sinue",20,"Mika Waltari"));
		guardarMutable(m,new Pelicula("Q12WQ","Invictus",25,"Clint Eastwood"));
		guardarMutable(m,new Televisor());
		
		
	}

}
