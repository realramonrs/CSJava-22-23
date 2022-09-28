import java.util.*;

public class LecturaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		float nota;
		String curso;
		System.out.println("Introduzca la nota del alumno: ");
		nota = lector.nextFloat();
		System.out.println("Introduzca el curso: ");
		curso = lector.next();
		System.out.println("La nota introducida es : " + nota);
		System.out.println("El curso es : " + curso);
		
		
	}

}
