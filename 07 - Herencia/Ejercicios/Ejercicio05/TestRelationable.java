package ejercicio5;

public class TestRelationable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Relationable relations[] = new Relationable[10];
		//Creamos varios objetos de tipo Linea2D
		Linea2D l1 = new Linea2D(2,4,1,3);
		Linea2D l2 = new Linea2D(new Punto(1,5),new Punto(0,10));
		//Creamos dos círculos
		Circulo c1 = new Circulo(2);
		Circulo c2 = new Circulo(3);
		
		//Vamos a probar los métodos definidos en la interfaz:
		
		System.out.println("Distancia l1 : " + l1.getDistancia());
		System.out.println("Distancia l2 : " + l2.getDistancia());
		System.out.println("l1 > l2 ?" + l1.esMayorQue(l2));
		System.out.println("l1 < l2 ?" + l1.esMenorQue(l2));
		System.out.println("l1 == l2 ?" + l1.esIgualQue(l2));
		
		System.out.println("Area de c1 : " + c1.getArea());
		System.out.println("Area de c2 : " + c2.getArea());
		System.out.println("c1 > c2 ?" + l1.esMayorQue(l2));
		System.out.println("c1 < c2 ?" + l1.esMenorQue(l2));
		System.out.println("c1 == c2 ?" + l1.esMenorQue(l2));
		
		//Podemos crear objetos de tipo Linea2D usando referencia de tipo Relationable
		Relationable r1 = new Linea2D(new Punto(4,5),new Punto(1,10));
		Relationable r2 = new Linea2D(new Punto(1,5),new Punto(2,13));
		Relationable r3 = new Circulo(3);
		Relationable r4 = new Circulo(3);
		//Podemos utilizar los métodos
		System.out.println("r1 > r2 ? " + r1.esMayorQue(r2));
		//Pero si queremos ver la distancia no podremos sin realizar un cast
		System.out.println("R1 distancia : " + ((Linea2D)r1).getDistancia());
		System.out.println("R2 distancia : " + ((Linea2D)r2).getDistancia());
		
		//Que pasa sin comparamos un círculo con una Linea2D ??
		//System.out.println("r1 > c1 ? " + r1.esMayorQue(c1));  //Cómo lo solucionarías ??
		
	}

}
