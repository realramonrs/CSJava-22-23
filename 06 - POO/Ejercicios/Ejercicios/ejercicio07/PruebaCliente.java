/**
 * 
 */
package ejercicio07;

import java.util.Scanner;

/**
 * @author Ramon RS
 *
 */
public class PruebaCliente {

	/**
	 * @param args
	 */
	//Apartado E : Método para guardar cliente en matriz
	public static void guardarCliente(Cliente []c,Cliente cli) {
		for(int i = 0;i<c.length;i++) {
			if(c[i]==null) {
				c[i] = cli;
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Apartado D : Crear dos clientes y mostrar info.
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente("Cafetería Ureca","A453829292","Calle del Olvido 45",
				'C',"ureca@gmail.com");
		
		System.out.println(c1);
		System.out.println(c2);
		
		//Apartado F: Crear una matriz de clientes
		Cliente cartera[] = new Cliente[10];
		guardarCliente(cartera , c1);
		guardarCliente(cartera, c2);
		
		Scanner lector;
		//Apartado g: Mostrar menú
		int opcion = 0;
		do {
			System.out.println("1. Guardar cliente");
			System.out.println("2. Buscar cliente");
			System.out.println("3. Mostrar clientes por forma de pago");
			System.out.println("4. Mostrar todos los clientes");
			System.out.println("5. Salir");
			lector = new Scanner(System.in);
			opcion = lector.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Introduzca los datos del cliente");
				Cliente cliente = new Cliente();
				lector = new Scanner(System.in);
				System.out.println("Razón social :");
				cliente.setRazonSocial(lector.nextLine());
				System.out.println("Nif :");
				cliente.setNif(lector.nextLine());
				System.out.println("Direccion :");
				cliente.setDireccion(lector.nextLine());
				System.out.println("Forma de pago :");
				cliente.setFormaPago(lector.nextLine().charAt(0));
				System.out.println("Email :");
				cliente.setEmail(lector.nextLine());
				
				guardarCliente(cartera, cliente);
				
				break;
			case 2:
				lector = new Scanner(System.in);
				System.out.println("Introduzca el nif: ");
				String nif = lector.nextLine();
				
				Cliente cBuscado = null;
				
				for(Cliente c : cartera) {
					if(c!=null) {
					if(c.getNif().equals(nif)) {
						cBuscado = c;
						break;
					}
					}
				}
				
				if(cBuscado==null) {
					System.out.println("No se ha encontrado el cliente");
				}
				else {
					System.out.println(cBuscado);
				}
				break;
			case 3:
				System.out.println("Introduce forma de pago : ");
				lector = new Scanner(System.in);
				char fPago = lector.nextLine().charAt(0);
				
				for(Cliente c : cartera) {
					if(c!=null) {
						if(c.getFormaPago()==fPago) {
							System.out.println(c);
						}
					}
				}
				break;
			case 4:
				for(Cliente c : cartera) {
					if(c!=null)
					System.out.println(c);
				}
				break;
			default:
				System.exit(0);
				break;
			}
			
			
		}
		
		while(opcion<5);
		
		
		lector.close();
		
		
		
		
		
		
	}

}
