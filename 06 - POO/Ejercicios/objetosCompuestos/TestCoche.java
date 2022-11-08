package objetosCompuestos;

public class TestCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor m1 = new Motor(320,90,false);
		Coche c1 = new Coche("Porsche",m1);
		
		//Cambiar el nivel de aceite de mi porsche
		c1.getMotor().setNivelAceite(95);
		m1.setNivelAceite(0);
		System.out.println(c1);
		
		//Instanciación anónima
		Coche c2 = new Coche("Ferrari",new Motor(350,88,false));
		
		////Cambiar el nivel de aceite de mi Ferrari
		c2.getMotor().setNivelAceite(92);
		
		
		
		
		
	}

}
