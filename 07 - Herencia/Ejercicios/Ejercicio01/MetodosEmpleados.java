
public class MetodosEmpleados {

	public static void guardarEmpleado(Empleado e, Empleado plantilla[]) {
		//Busco la primera posición vacía
				for(int i = 0;i<plantilla.length;i++) {
					if(plantilla[i]==null) {
						plantilla[i] = e;
						break;
					}
				}
	}
}
