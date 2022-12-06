package flujosBytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03TrabajandoConImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ruta = "C:\\Users\\Ramon RS\\Desktop\\logo.png";
		File fichero = null;
		FileInputStream lector=null;
		FileOutputStream escritor = null;
		int i;
		try {
			fichero = new File(ruta);
			lector = new FileInputStream(ruta);
			escritor = new FileOutputStream("C:\\Users\\Ramon RS\\Desktop\\copia.png");
			
			//Obtener el tamaño en bytes de la imagen
			System.out.println("La imagen pesa: " + fichero.length() + "bytes");
			
			//Obtener bytes de la imagen
			do {
				i=lector.read();
				if(i!=-1) {
					System.out.print(i + " * ");
					//Copiarlos a otro fichero
					
					escritor.write(i);
				}
			}while(i!=-1);
		}
		catch(IOException e) {
			
		}
	}

}
