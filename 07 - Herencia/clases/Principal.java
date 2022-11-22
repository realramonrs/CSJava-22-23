package clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ordenador o1 = new Ordenador();
		Ordenador o2 = new Ordenador("AJ789","HP","Omen",2000,1000,"Windows 10",(byte) 16);
		
		//Aplicar un descuento a o2:
		o2.aplicarDescuento();
		
		//Mostrar precio final
		System.out.println("El precio rebajado es: " + o2.getPrecio() + " €");
		
		//Mostrar toda la info de un ordenador:
		
		System.out.println(o2);
		
		//Ejemplos polimorfismo
		
		Ordenador o3 = new Ordenador();
		Televisor t1 = new Televisor();
		Producto p1 = new Ordenador();
		Producto p2 = new Televisor();
		Producto p;
		p = o3;
		p = t1;
		
		//Ejecutar aplicarDescuento para Televisores y Ordenadores desde referencias Producto
		
		Producto tele1 = new Televisor("WR456","Lg","UHD34567",900,65,1000);
		Producto ordenador1 = new Ordenador("PT6784","Asus","Zenbook",850,1500,"Linux",(byte)8);
		
		System.out.println("Precio sin rebajar: ");
		System.out.println("Tele 1: " + tele1.getPrecio());
		System.out.println("Ordenador 1 " + ordenador1.getPrecio());
		
		tele1.aplicarDescuento();
		ordenador1.aplicarDescuento();
		
		System.out.println("Precio con rebajas: ");
		System.out.println("Tele 1: " + tele1.getPrecio());
		System.out.println("Ordenador 1 " + ordenador1.getPrecio());
		
		
		//Downcasting
		((Ordenador)ordenador1).setAlmacenamiento(2000);
		Ordenador o = (Ordenador)ordenador1;
		o.setAlmacenamiento(2000);
		
		//Error de downcasting
		//Televisor t = (Televisor)ordenador1;
		
		//Upcasting
		Ordenador or = new Ordenador();
		Producto pOr = (Producto)or;
		
		
	}

}
