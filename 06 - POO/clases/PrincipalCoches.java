package clases;

public class PrincipalCoches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Motor m = new Motor(80,250,2000);
			Coche miCoche = new Coche("Ford","Focus",16000,m);
			
			miCoche.getMotor().setRevoluciones(1500);
			miCoche.getMotor().setNivelAceite(60);
			
			System.out.println("Temperatura del motor: " + miCoche.getMotor().getTemperatura());
			System.out.println("Nivel de aceite: " + miCoche.getMotor().getNivelAceite());
			
			System.out.println("Estado del motor: " + miCoche.getMotor().toString());
			
			//También podríamos acceder al motor del coche creado desde la referencia m
			//ya que tanto m como omiCoche.getMotor apuntan al mismo objeto motor
			
			m.setTemperatura(350);
			
			
			//Creando coches con constructor II
			Coche otroCoche = new Coche("Peugeot","5008",19000,100,10,2500);
			
			//Creando coches con instanciación anonima del motor
			Coche cochazo = new Coche("Porsche","911",75000,new Motor(90,20,3000));
			
			
			//Crear una matriz de coches
			Coche concesionario[] = new Coche[50];
			
			concesionario[0] = new Coche("Toyota","Prius",20000,new Motor(100,20,3500));
			concesionario[1] = new Coche("Citroen","Picasso",16000,100,30,2800);
			concesionario[2] = new Coche("Mercedes","Clase A",35000,new Motor(100,10,4500));
			
			
			//Recorrer matriz para mostrar información
			
			for(Coche c : concesionario) {
				if(c!=null)
				System.out.println(c);
			}
			
			//Buscar la primera pos vacía
			for(int i = 0;i<concesionario.length;i++) {
				if(concesionario[i]==null) {
					concesionario[i] = new Coche("Opel","Astra",10000,new Motor(90,20,1800));
					break; //Debemos salir sino llenaríamos la matriz con coches
				}
			}
			
			
			
			
			
			
			
			
			
			
			
	}

}
