package ejercicio04;

public class TestPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente lista[] = new Paciente[10];
		lista[0] = new Paciente("12345678U", "Juan José Díaz", 45);
		lista[1] = new SospechosoCoronavirus("44556622A", "Roberto Pérez", 55);
		lista[2] = new Paciente("10998822V", "", 45);
		lista[3] = new SospechosoCoronavirus("0099887766V", "Esperanza Robles", 45);
		lista[4] = new Paciente("09876543D", "Luis Menéndez", 35);
		lista[5] = new SospechosoCoronavirus("90292929E", "María Sánchez", 37);
		lista[6] = new SospechosoCoronavirus("66778899C", "Soledad Flores", 27);

		// Realizar el test

		for (Paciente p : lista) {
			if (p != null) {
				if (p instanceof SospechosoCoronavirus) {
					((SospechosoCoronavirus) p).realizarTest();
				}
			}
		}
		System.out.println("***** Pacientes:****** ");
		System.out.println();
		for (Paciente p : lista) {
			if (p != null) {
				System.out.println(p);
			}
		}
		// Mostrar pacientes con Coronavirus
		System.out.println();
		System.out.println("*************Pacientes con coronavirus:************");
		System.out.println();
		for (Paciente p : lista) {
			if (p != null) {
				if (p instanceof SospechosoCoronavirus) {
					if (((SospechosoCoronavirus) p).infectado) {
						p.diagnosticar("CoronaVirus");
						System.out.println(p);
					}

				}
			}
		}

		// Curamos a los que tienen coronavirus y una edad < 50

		for (Paciente p : lista) {
			if (p != null) {
				if (p instanceof SospechosoCoronavirus) {
					if (((SospechosoCoronavirus) p).infectado) {
						if (p.getEdad() < 50) {
							((SospechosoCoronavirus) p).curar();
							System.out.println(p.getNombre() + " ha sido curado de CoronaVirus.");
						}
					}
				}
			}

		}
	}

}
