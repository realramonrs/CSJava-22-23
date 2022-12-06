package flujosCaracteres;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _01LeerFichero {

		public void lee(String ruta) {
			try {
				FileReader lector = new FileReader(ruta);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
