package patronIterator;

public class MiColeccion implements Recorrible {

	private String array[] = {"Uno","Dos","Tres","Cuatro"};

	@Override
	public MiIterador crearIterador() {
		// TODO Auto-generated method stub
		MiColeccionIterator mc = new MiColeccionIterator();
		return mc;
		
	}
	
	private class MiColeccionIterator implements MiIterador{

		private int indice=0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(indice < array.length) {
				return true;
			}
			else {
			return false;
			}
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()) {
				return array[indice++];
			}
			else
			return null;
		}
		
	}
}
