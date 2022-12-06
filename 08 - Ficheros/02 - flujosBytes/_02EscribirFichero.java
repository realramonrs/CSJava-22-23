package flujosBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _02EscribirFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream lector = null;
		FileOutputStream escritor = null;
		int i;
		
		//Copiar un archivo
		try {
			lector = new FileInputStream("C:\\Users\\Ramon RS\\Desktop\\datos.txt");
			escritor = new FileOutputStream("C:\\Users\\Ramon RS\\Desktop\\copia.txt");
			
			do {
				
					i=lector.read();
					if(i!=-1) {
					escritor.write(i);
				}
			}while(i!=-1);
		}
		
		catch(FileNotFoundException e) {
			
		}
		catch(IOException e) {
			
		}
	}

}
