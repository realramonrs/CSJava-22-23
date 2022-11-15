package ejercicio05;

import java.time.LocalDate;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.of(2000, 10, 20);
		Alumno a1 = new Alumno("Pedro Gutierrez","pedro@gmail.com","36122523B",LocalDate.of(2004, 11, 10),Curso.GME1);
		System.out.println(a1.isMayorEdad());
		System.out.println(a1);
	}

}
