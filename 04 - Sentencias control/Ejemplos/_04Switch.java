package Ejemplos;
import java.util.Scanner;
public class _04Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Presentación de un menú con diferentes opciones
		
		System.out.println("Escoja una opción por favor");
		System.out.println("1. Ver provincias de Galicia");
		System.out.println("2. Ver la lista de Reyes Godos");
		System.out.println("3. Ríos de España");
		System.out.println("4. Salir");
		Scanner lector = new Scanner(System.in);
		int opcion = lector.nextInt();
		
		switch(opcion) {
				
		case 1:
			System.out.println("Provincias de Galicia");
			System.out.println("Coruña , Lugo , Ourense , Pontevedra");
			break;
		case 2:
			System.out.println("Reyes Godos : ");
			System.out.println("Ataúlfo , Sigerico , Walia , Teoderedo, Turismundo, Teodorico ,"
					+ "Eurico , Alarico II , Gesaleico , Amalarico , Teudis, Teudiselo , Agila I,"
					+ "Atanagildo , Liuva I , Leovigido , Recaredo I, Liuva II, Witerico , Gundemaro,"
					+ "Sisebuto , Recaredo II , Suintila , Sisenando , Chintila , Tulga, Chindasvinto,"
					+ "Recesvinto , Wamba , Ervigio , Égica , Witiza , Rodrigo");
			break;
		case 3:
			System.out.println("Ríos de España");
			System.out.println("Ebro , Tajo , Guadiana , Guadalquivir , Duero , Miño , Segura , Júcar,"
					+ "Genil , Nalón , Ter , Turia , Segre , Esla , Tormes , Sil , Bidasoa , Pisuerga...");
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Opción escogida no válida");
			break;
		
		}

	}

}
