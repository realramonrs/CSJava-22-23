package ejemplos;

public class _04Enumerados {
	
	enum Estaciones {OTOÑO, INVIERNO,PRIMAVERA,VERANO};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estaciones e = Estaciones.INVIERNO;
		
		System.out.println(e);
		System.out.println(e.name());
		System.out.println(e.ordinal());
		System.out.println(Estaciones.values()[0]);
		System.out.println(Estaciones.values()[1]);
		System.out.println(Estaciones.values()[2]);
		
	}

}
