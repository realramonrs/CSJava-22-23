package claseFile;

import java.io.File;
import java.io.IOException;

public class _02CrearArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File nuevoDir = new File("C:\\Users\\Ramon RS\\eclipse-workspace","nuevo");
		nuevoDir.mkdir();
		
		File nuevoFichero = new File(nuevoDir.getAbsolutePath(),"prueba");
		try {
			nuevoFichero.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
