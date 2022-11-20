package ejercicio8;

public class TestMatrizMezclas {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mezcla mezclas[] = new Mezcla[100];
		
		mezclas[0] = new Mezcla(new Elemento("Hidrógeno","H",0.084f,-259,-252),new Elemento("Carbono","c",3.51f,3550,4827),30,70);
		Elemento e3 = new Elemento("Azufre","s",2.06f,113,444);
		Elemento e4 = new Elemento("Calcio","ca",1.54f,839,1437);
		mezclas[1] = new Mezcla(e3,e4,40,60);
		
		//Obtener la densidad media, temperatura de fusión y ebullicion media
		float densidadMedia = 0;
		float tFusionMedia = 0;
		float tEbullicionMedia = 0;
		float sumaDensidades = 0;
		float sumaTemperaturasFusion = 0;
		float sumaTemperaturasEbullicion = 0;
		int contador = 0;
		for(Mezcla m : mezclas) {
			if(m!=null) {
			sumaDensidades+=m.getDensidad();
			sumaTemperaturasEbullicion+=m.getTemperaturaEbullicion();
			sumaTemperaturasFusion+=m.getTemperaturaFusion();
			contador+=1;
			}
		}
		densidadMedia = sumaDensidades/contador;
		tFusionMedia = sumaTemperaturasFusion/contador;
		tEbullicionMedia = sumaTemperaturasEbullicion/contador;
		
		System.out.println("Densidad media: " + densidadMedia + " g/cm3");
		System.out.println("Tª fusión media: " + tFusionMedia + " º");
		System.out.println("Tª ebullición media " + tEbullicionMedia + " º");
		
		//Obtener el elemento con la mayor temperatura de fusión
		
		Elemento ex = null;
		float tFusionMax = Float.MIN_VALUE;
		for(Mezcla m : mezclas) {
			if(m!=null) {
				if(m.getE1().getTemperaturaFusion()>tFusionMax) {
					tFusionMax = m.getE1().getTemperaturaFusion();
					ex = m.getE1();
				}
				if(m.getE2().getTemperaturaFusion()>tFusionMax) {
					tFusionMax = m.getE2().getTemperaturaFusion();
					ex = m.getE2();
				}
				
			}
		}
		System.out.println("El elemento con temperatura de fusión más alta es: ");
		System.out.println(ex);
		
		
		//Obtener la mezcla con la densidad más baja:
		Mezcla m = null;
		float densidad = Float.MAX_VALUE;
		for(Mezcla mezcla : mezclas) {
			if(mezcla!=null) {
				if(mezcla.getDensidad()<densidad) {
					densidad = mezcla.getDensidad();
					m = mezcla;
				}
			}
		}
		
		System.out.println("Mezcla con densidad más baja: ");
		System.out.println(m);
		

	}

}
