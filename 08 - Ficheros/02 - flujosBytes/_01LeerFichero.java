package flujosBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _01LeerFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream lector = null;
		int i = 0;
		try {
			lector = new FileInputStream("C:\\Users\\Ramon RS\\Desktop\\datos.txt");
			do {
				i = lector.read();
				if(i!=-1) {
					System.out.print((char)i);
				}
			}while(i!=-1);
		}
		
		catch(FileNotFoundException e) {
			System.out.println("No se encontró el fichero indicado");
		}
		
		catch(IOException e) {
			System.out.println("Error inesperado. No se puede leer");
		}
		
		finally {
			try {
				if(lector!=null)
				lector.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
