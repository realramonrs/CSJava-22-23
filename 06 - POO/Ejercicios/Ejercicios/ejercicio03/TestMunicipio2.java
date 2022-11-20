package ejercicio03;

import java.util.Scanner;

public class TestMunicipio2 {
	public static void mostrarMenu() {
		System.out.println("a. Introducir un nuevo municipio");
		System.out.println("b. Buscar municipio.");
		System.out.println("c. Mostrar municipios cuyo código acabe por ...");
		System.out.println("d. Mostrar municipios por provincia.");
		System.out.println("e. Salir");
	}
	
	//Método que visualiza todos los municipios de una matriz
	public static void mostrarMunicipio(Municipio m[]) {
		
		for(Municipio municipio : m) {
			if(municipio!=null)
			System.out.println(municipio);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos una matriz de municipios
		Municipio municipios[] = new Municipio[100];
		municipios[0] = new Municipio("Vigo",57,36);
		municipios[1] = new Municipio("Valga",56,36);
		municipios[2] = new Municipio("Ferrol",36,15);
		municipios[3] = new Municipio("A Coruña",56,15);
		municipios[4] = new Municipio("A Pobra",67,15);
		municipios[4] = new Municipio("Ourense",54,32);
		municipios[4] = new Municipio("Parada de Sil",57,32);
		municipios[4] = new Municipio("Nogueira de Ramuin",52,32);
		
		
		
		char opcion;
		boolean salir = false;
		do {
			mostrarMenu();
			Scanner lector = new Scanner(System.in);
			opcion = lector.nextLine().charAt(0);
			switch(opcion) {
			case 'a':
				String nombreMunicipio;
				System.out.println("introduzca un nuevo municipio: ");
				nombreMunicipio = lector.nextLine();
				System.out.println("Introduzca el código de provincia [1-57]");
				int codigoProvincia = lector.nextInt();
				System.out.println("Introduzca el código de municipio [1-999]");
				int codigoMunicipio = lector.nextInt();
				//Creamos el municipio y lo guardamos en la matriz
				Municipio mnp = new Municipio(nombreMunicipio,codigoProvincia,codigoMunicipio);
				//Lo metemos en la primera posición vacía de la matriz
				boolean guardado = false;
				for(int i = 0;i<municipios.length;i++) {
					if(municipios[i]==null) {
						municipios[i] = mnp;
						guardado = true; //Registramos que ha sido gardado
						//Salimos del bucle para que no se llene toda la matriz con el mismo municipio
						break;
								
					}
				}
				if(guardado) {
					//Mostramos lista actualizada de municipios
					mostrarMunicipio(municipios);
				}
				else {
					System.out.println("No se ha podido guardar, la matriz está llena");
				}
				
				break;
			case 'b':
				System.out.println("Introduzca el nombre del municipio: ");
				String municipioBuscado = new Scanner(System.in).nextLine();
				boolean encontrado = false;
				for(Municipio m : municipios) {
					if(m!=null) {
						if(m.getNombre().equals(municipioBuscado)) {
							System.out.println(m);
							encontrado = true;
							break;
						}
					}
				}
				if(!encontrado) {
					System.out.println("No se encuentra registrado el municipio.");
				}
				break;
			case 'c':
				System.out.println("Introduce código municipio final: ");
				int digitoFinal = new Scanner(System.in).nextInt();
				String digitoFinal2 = Integer.toString(digitoFinal);
				for(Municipio m : municipios) {
					if(m!=null) {
						if(m.getCodigoMunicipio().endsWith(digitoFinal2)) {
							System.out.println(m);
						}
						
					}
					else {
						break; //Salimos al encontrar una pos vacía
					}
					
				}
				break;
			case 'd':
				int codigoProvinciaBuscada = new Scanner(System.in).nextInt();
				String codigoPro = String.format("%03d", codigoProvinciaBuscada);
				for(Municipio m : municipios) {
					if(m!=null) {
						if(m.getCodigoProvincia().equals(codigoPro)) {
							System.out.println(m);
						}
					}
				}
				
				
				break;
			case 'e':
				salir = true;
				break;
				default:
					System.out.println("Opción errónea vuelva a intentarlo");
					break;
			}
		}
		while(!salir);
	}

}
