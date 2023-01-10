package patronIterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiColeccion mc = new MiColeccion();
		MiIterador mit = mc.crearIterador();
		
		while(mit.hasNext()) {
			System.out.println(mit.next());
		}
	}

}
