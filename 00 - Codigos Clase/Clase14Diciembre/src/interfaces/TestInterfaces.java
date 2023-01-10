package interfaces;

public class TestInterfaces {

	static void desplazar(Movible m) {
		m.mover();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo concesionario[] = new Vehiculo[10];
		concesionario[0] = new Helicoptero();
		concesionario[1] = new Coche();
		
		for(Vehiculo v: concesionario) {
			if(v!=null)
			v.mover();
		}
		
		SerVivo seres[] = new SerVivo[10];
		seres[0] = new Animal();
		seres[1] = new Planta();
		
		for(SerVivo sv: seres) {
			if(sv instanceof Animal)
				((Animal)sv).mover();
		}
		
		Movible ms[] = new Movible[10];
		ms[0] = new Helicoptero();
		ms[1] = new Animal();
		ms[2] = new Punto();
		
		
	}

}
