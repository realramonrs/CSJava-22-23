package ejercicio8;

public class TestMezcla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elemento e1 = new Elemento("Hidrógeno","H",0.084f,-259,-252);
		Elemento e2 = new Elemento("Carbono","c",3.51f,3550,4827);
		Elemento e3 = new Elemento("Azufre","s",2.06f,113,444);
		Elemento e4 = new Elemento("Calcio","ca",1.54f,839,1437);
		
		Mezcla m1 = new Mezcla(e1,e2,30f,70f);
		System.out.println(m1.getE1().getNombre()+" "+m1.getPorcentajeE1() + "% , densidad: " +m1.getE1().getDensidad()+" g/cm3");
		System.out.println(m1.getE2().getNombre() + " " + m1.getPorcentajeE2() + "%, densidad: " +m1.getE2().getDensidad()+" g/cm3" );
		System.out.println("Densidad de la mezcla: " + m1.getDensidad()+" g/cm3");

		System.out.println("Temperatura de fusión: " + m1.getTemperaturaFusion()+"º");
		System.out.println("Temperatura de ebullición: " + m1.getTemperaturaEbullicion() + "º");
	}

}
