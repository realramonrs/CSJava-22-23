import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestFacturas {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear una matriz de Facturas.
		Factura facturas[] = new Factura[100];
		
		try {
			facturas[0] = new Factura("QW34", LocalDate.now(),345.67f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			facturas[1] = new Factura("PO45",LocalDate.of(2022, 10, 29),200);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			facturas[2] = new Factura("ty80",LocalDate.of(2022, 11, 12),980);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Mostrar por pantalla toda la info de las facturas:
		for(Factura f: facturas) {
			if(f!=null) {
			     System.out.println(f);
		}
		}
		
		char opcion;
		boolean salir = false;
		
		do {
			Scanner lector = new Scanner(System.in);
			System.out.println("a. Introducir una nueva factura:");
			System.out.println("b. Buscar una factura.");
			System.out.println("c. Buscar facturas por fecha.");
			System.out.println("d. Eliminar una factura.");
			System.out.println("e. Calcular total facturado.");
			System.out.println("f. Salir");
			opcion = lector.nextLine().charAt(0);
			
			switch(opcion) {
			
			case 'a':
				System.out.println("Introduzca el código: ");
				String codigo = new Scanner(System.in).nextLine();
				System.out.println("Introduzca fecha en formato dd/mm/aaaa");
				String fecha = new Scanner(System.in).nextLine();
				//Pasar a LocalDate
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fechaFactura = LocalDate.parse(fecha,formatter);
				
				System.out.println("introduzca el importe: ");
				float importe = new Scanner(System.in).nextFloat();
				
				//Creamos objeto Factura
				Factura f = new Factura(codigo,fechaFactura,importe);
				//Guardarla en la primera posición vacía
				if(MetodosArraysFacturas.guardarFactura(f, facturas)) {
					System.out.println("La factura fue guardada con éxito.");
					MetodosArraysFacturas.mostrarFacturas(facturas);
				}
				else {
					System.out.println("No hay espacio para esta factura.");
				}
				
				break;
			case 'b':
				//Buscar una factura a partir del código.
				System.out.println("Intro código de la factura ");
				String codigoFactura = new Scanner(System.in).nextLine();
				Factura fBuscada = MetodosArraysFacturas.buscarFactura(codigoFactura, facturas);
				if(fBuscada!=null) {
					System.out.println(fBuscada);
				}
				else {
					System.out.println("La factura no está en la bbdd");
				}
				break;
			case 'c':
				//Mostrar factura de una determinada fecha
				System.out.println("Introduzca fecha en formato dd/mm/aaaa");
				String fechaBuscada = new Scanner(System.in).nextLine();
				//Pasar a LocalDate
				LocalDate ld = Utiles.pasarStringALocalDate(fechaBuscada);
				
				//Recorrer matriz buscando facturas con esta fecha
				for(Factura fac : facturas) {
					if(fac!=null) {
						if(fac.getFecha().isEqual(ld)) {
							System.out.println(fac);
						}
					}
					else {
						break;
					}
				}
				break;
			case 'd':
				//Eliminar una factura
				System.out.println("Introduce código factura que desea eliminar: ");
				String codigoFactura2 = new Scanner(System.in).nextLine();
				if(MetodosArraysFacturas.eliminarFactura(codigoFactura2, facturas)) {
					System.out.println("Factura eliminada con éxito");
					MetodosArraysFacturas.mostrarFacturas(facturas);
				}
				else {
					System.out.println("No se ha podido eliminar la factura.");
				}
				break;
			case 'e':
				float totalFacturado = 0;
				for(Factura fa: facturas) {
					if(fa!=null) {
						totalFacturado +=fa.getImporte();
					}
					/*else {
						break;
					}*/
				}
				System.out.println("Total facturado: " + totalFacturado);
				break;
			case 'f':
				salir = true;
				break;
				default:
					System.out.println("Opción no válida. Vuelva a intentarlo o pulse f para salir.");
					break;
					
			}
			
		}while(!salir);		
		
	}

}
