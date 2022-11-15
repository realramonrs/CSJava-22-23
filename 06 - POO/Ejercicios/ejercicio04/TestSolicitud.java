package ejercicio04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class TestSolicitud {
	
	public static void mostrarMenu() {
		System.out.println("a. Introducir una nueva solicitud");
		System.out.println("b. Modificar estado solicitud.");
		System.out.println("c. Mostrar solicitudes.");
		System.out.println("d. Modificar fecha solicitud:");
		System.out.println("d. Mostrar solicitudes en fecha.");
		System.out.println("e. Salir");
	}
	
	public static void mostrarSolicitudes(Solicitud s[]) {
		for(Solicitud sol : s) {
			if(sol!=null) {
				System.out.println(sol);
			}
			else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solicitud solicitudes[] = new Solicitud[100];
		//Guardamos algunas solicitudes
		solicitudes[0] = new Solicitud("AA23","Reducción pago cuota.");
		solicitudes[1] = new Solicitud("AS23","Ampliación periodo vacacional.");
		solicitudes[2] = new Solicitud("ZA47","Anulación multa tráfico.");
		char opcion;
		boolean salir = false;
		do {
			mostrarMenu();
			Scanner lector = new Scanner(System.in);
			opcion = lector.nextLine().charAt(0);
			switch(opcion) {
			case 'a':
				System.out.println("Introduzca los datos de la nueva solicitud:");
				System.out.println("Código?");
				String codigo = new Scanner(System.in).nextLine();
				System.out.println("Título: ");
				String titulo = new Scanner(System.in).nextLine();
				
				//Creamos la solicitud y la guardamos
				Solicitud s1 = new Solicitud(codigo,titulo);
				boolean guardado = false;
				//Buscamos primera pos vacía
				for(int i = 0;i<solicitudes.length;i++) {
					if(solicitudes[i]==null) {
						solicitudes[i] = s1;
						guardado = true;
						break;
					}
				}
				if(guardado) {
					//Mostramos datos solicitudes guardadas
					mostrarSolicitudes(solicitudes);
				}
				else {
					System.out.println("No se ha podido guardar la solicitud.");
				}
				
				break;
			case 'b':
				System.out.println("Introduce el código de la solicitud que desea modificar.");
				String codigoSolicitud = new Scanner(System.in).nextLine();
				//Buscamos la solicitud , si la encontramos solicitamos el nuevo estado
				Solicitud solicitudBuscada = null;
				boolean encontrado = false;
				for(Solicitud sol : solicitudes) {
					if(sol!=null) {
						if(sol.getCodigo().equals(codigoSolicitud)) {
							encontrado = true;
							solicitudBuscada = sol;
							break;
						}
					}
				}
				if(encontrado) {
					System.out.println("Introduzca el nuevo estado: ");
					System.out.println("1. Pendiente");
					System.out.println("2. Proceso");
					System.out.println("3. Admitida.");
					System.out.println("4. Rechazada.");
					String codigoEstado = new Scanner(System.in).nextLine();
					switch(codigoEstado) {
						case "1":
							solicitudBuscada.setEstado(Estado.Pendiente);
							System.out.println("Solicitud actualizada correctamente.");
							System.out.println(solicitudBuscada);
						break;
						case "2":
							solicitudBuscada.setEstado(Estado.Proceso);
							System.out.println("Solicitud actualizada correctamente.");
							System.out.println(solicitudBuscada);
							break;
						case "3":
							solicitudBuscada.setEstado(Estado.Admitida);
							System.out.println("Solicitud actualizada correctamente.");
							System.out.println(solicitudBuscada);
							break;
						case "4":
							solicitudBuscada.setEstado(Estado.Rechazada);
							System.out.println("Solicitud actualizada correctamente.");
							System.out.println(solicitudBuscada);
							break;
						default:
							System.out.println("Error en el dato introducido.");
							break;
					}
				}
				else {
					System.out.println("No se ha encontrado la solicitud.");
				}
				
				
				
				break;
			case 'c':
				//mOSTRAR SOLICITUDES
				for(Solicitud s: solicitudes) {
					if(s!=null) {
						System.out.println(s);
					}
					else {
						break;
					}
				}
				break;
			case 'd':
				System.out.println("Introduce el código de la solicitud que desea modificar.");
				String codigoSolicitud2 = new Scanner(System.in).nextLine();
				boolean encontrado2 = false;
				//Si la encontramos solicitamos fecha
				for(Solicitud s:solicitudes) {
					if(s!=null) {
						if(s.getCodigo().equals(codigoSolicitud2)) {
							encontrado2 = true;
							System.out.println("Introduzca fecha en formato dd/mm/aaaa");
							String fechaNueva = new Scanner(System.in).nextLine();
							//Pasar a LocalDate
							DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							LocalDate localDate = LocalDate.parse(fechaNueva,formatter);
							s.setFecha(localDate);
							break;
						}
					}
				}
				if(!encontrado2) {
					System.out.println("Solicitud no encontrada.");
				}
				
				break;
			case 'e':
				System.out.println("Introduzca fecha en formato dd/mm/aaaa");
				String fecha= new Scanner(System.in).nextLine();
				//Pasar a LocalDate
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate localDate = LocalDate.parse(fecha,formatter);
				for(Solicitud s: solicitudes) {
					if(s!=null) {
						if(s.getFecha().equals(localDate)) {
							System.out.println(s);
						}
					}
				}
				break;
			
				default:
					System.out.println("Opción errónea.");
					break;
		
			}
		}while(!salir);
	}

}
