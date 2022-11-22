import java.time.LocalDate;

public class Resumen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Herencia y Polimorfismo
		Empleado e1 = new Empleado("12345678E","Pedro",LocalDate.of(1990, 10, 10),LocalDate.of(2020, 10, 10));
		Empleado e2 = new Directivo("1222278E","Maria",LocalDate.of(1990, 10, 10),LocalDate.of(2020, 10, 10),"2345678");
		Empleado e3 = new Operario("12345678E","Pedro",LocalDate.of(1990, 10, 10),LocalDate.of(2020, 10, 10),"1321324","1291823");
		
		//downcast-->Peligroso
		Directivo d1 = (Directivo)e2;
		Directivo d2 = (Directivo)e3;  // Error en tiempo de ejecución
		
		//upcast --> Seguro
		Directivo d3 = new Directivo("12345678E","Pedro",LocalDate.of(1990, 10, 10),LocalDate.of(2020, 10, 10),"6737373");
		Empleado em = d3;
		
		
		
		
		
	}

}
