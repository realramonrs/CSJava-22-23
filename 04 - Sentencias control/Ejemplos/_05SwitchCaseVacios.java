package Ejemplos;

public class _05SwitchCaseVacios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char opcion = 'r';

		switch(opcion) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("La opcion es una vocal");
			break;
		default:
			System.out.println("La opción no es una vocal");
			break;

		}

	}

}
