package clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar variables tipo Producto
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		Producto p3 = new Producto();
		
		//Asignar un codigo una marca un modelo y un precio a p1
		p1.setCodigo("AR3er20");
		p1.setMarca("Samsung");
		p1.setModelo("J7-2018");
		p1.setPrecio(220);
		
		//Mostrar los datos de p1
		System.out.println("Codigo: " + p1.getCodigo());
		System.out.println("Marca: " + p1.getMarca());
		System.out.println("Modelo: " + p1.getModelo());
		System.out.println("Precio: " + p1.getPrecio());
		
		
		//Si pasamos directamente la referencia:
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		//Mostrando el hascode
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println(Integer.toHexString(p1.hashCode()));
		System.out.println(Integer.toHexString(p2.hashCode()));
		System.out.println(Integer.toHexString(p3.hashCode()));
		
		
		//Método equals
		System.out.println(p1.equals(p2));
		p2 = p1;
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
		
		//Creando productos con el constructor con parámetros
		Producto p4 = new Producto("12345","HP","Omen 2000",1980);
		Producto.setTienda("Tienda de Pepe");
		//Aplicar descuento a p1
		p1.aplicarDescuento();
		p4.aplicarDescuento();
		
		System.out.println(p4 + " " + Producto.getTienda());
		
		Producto.setTienda("Almacenes Gastón");
		
		System.out.println(p1.getTienda());
		System.out.println(p2.getTienda());
		System.out.println(p3.getTienda());
		
	}

}
