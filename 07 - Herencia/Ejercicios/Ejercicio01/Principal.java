import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado plantilla[] = new Empleado[10];
		boolean salir = false;
		int opcion = 0;
		
		do {
		System.out.println("1. Guardar un empleado.");
		System.out.println("2. Guardar un directivo.");
		System.out.println("3. Guardar un administrativo.");
		System.out.println("4. Actualizar salario de todos los empleados.");
		System.out.println("5. Activar bono a todos los directivos de la empresa.");
		
		System.out.println("6. Salir");
		opcion = new Scanner(System.in).nextInt();
		
		switch(opcion) {
		
		case 1:
		//Guardar empleado en la primera pos vacía
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce datos del empleado: ");
		System.out.println("Nombre: ");
		String nombre = lector.nextLine();
		System.out.println("DNI: ");
		String dni = lector.nextLine();
		System.out.println("Introduce fecha nacimiento : dd/mm/yyyy");
		String fechaNacimiento = lector.nextLine();
		//Pasar String Fecha Nacimiento a LocalDate
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNacimiento,formatter);
		System.out.println("Fecha contratación:");
		String fechaContratacion = lector.nextLine();
		LocalDate fechaContrat = LocalDate.parse(fechaContratacion,formatter);
		
		//Busco la primera posición vacía
		MetodosEmpleados.guardarEmpleado(new Empleado(dni,nombre,fechaNac,fechaContrat), plantilla);
		
		//Mostrar empleados actuales
		System.out.println("Empleados actualmente en plantilla: ");
		for(Empleado e : plantilla) {
			if(e!=null) {
				System.out.println(e);
			}
		}
		break;
		case 2:
			//Guardar un directivo
			
			Scanner lector2 = new Scanner(System.in);
			System.out.println("Introduce datos del empleado: ");
			System.out.println("Nombre: ");
			String nombre2 = lector2.nextLine();
			System.out.println("DNI: ");
			String dni2 = lector2.nextLine();
			System.out.println("Introduce fecha nacimiento : dd/mm/yyyy");
			String fechaNacimiento2 = lector2.nextLine();
			//Pasar String Fecha Nacimiento a LocalDate
			DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate fechaNac2 = LocalDate.parse(fechaNacimiento2,formatter2);
			System.out.println("Fecha contratación:");
			String fechaContratacion2 = lector2.nextLine();
			LocalDate fechaContrat2 = LocalDate.parse(fechaContratacion2,formatter2);
			System.out.println("Intro número de teléfono: ");
			String telefono = lector2.nextLine();
			
			MetodosEmpleados.guardarEmpleado(new Directivo(dni2,nombre2,fechaNac2,fechaContrat2,telefono), plantilla);
			
			//Mostrar empleados actuales
			System.out.println("Empleados actualmente en plantilla: ");
			for(Empleado e : plantilla) {
				if(e!=null) {
					System.out.println(e.toString());
				}
			}
			break;
		
		case 3:
			Scanner lector3 = new Scanner(System.in);
			System.out.println("Introduce datos del empleado: ");
			System.out.println("Nombre: ");
			String nombre3 = lector3.nextLine();
			System.out.println("DNI: ");
			String dni3 = lector3.nextLine();
			System.out.println("Introduce fecha nacimiento : dd/mm/yyyy");
			String fechaNacimiento3 = lector3.nextLine();
			//Pasar String Fecha Nacimiento a LocalDate
			DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate fechaNac3 = LocalDate.parse(fechaNacimiento3,formatter3);
			System.out.println("Fecha contratación:");
			String fechaContratacion3 = lector3.nextLine();
			LocalDate fechaContrat3 = LocalDate.parse(fechaContratacion3,formatter3);
			System.out.println("Intro código portátil: ");
			String codigoPortatil = lector3.nextLine();
			
			//Busco la primera posición vacía
			for(int i = 0;i<plantilla.length;i++) {
				if(plantilla[i]==null) {
					plantilla[i] = new Administrativo(dni3,nombre3,fechaNac3,fechaContrat3,codigoPortatil);
					break;
				}
			}
			
			//Mostrar empleados actuales
			System.out.println("Empleados actualmente en plantilla: ");
			for(Empleado e : plantilla) {
				if(e!=null) {
					System.out.println(e.toString());
				}
			}
			
		case 4:
			//Calcular salario de todos los empleados
			for(Empleado e : plantilla) {
				if(e!=null) {
					e.calcularSalario();
				}
			}
			break;
		
		case 5:
			//Activar bono a todos los directivos.
			//Problema : Como sé en qué posiciones hay un directivo????
			
			for(Empleado e : plantilla) {
				if(e!=null) {
					if(e instanceof Directivo) {
					//downcasting
					Directivo d = (Directivo)e;
					d.activarBono();
					}
					
				}
			}
			break;
		case 6:
			salir = true;
			break;
		} //Fin del switch
		
		}while(!salir);
		
	}

}
