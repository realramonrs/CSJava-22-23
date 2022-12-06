package flujosCaracteres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrincipalConBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader lector = new FileReader("C:\\Users\\Ramon RS\\Desktop\\datos.txt");
			BufferedReader buffer = new BufferedReader(lector);
			String linea="";
			while(linea!=null) {
				
					linea = buffer.readLine();
					System.out.println(linea);
				
					// TODO Auto-generated catch block
					
				
				
			}
			buffer.close();
			lector.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("Algo ha sucedido al leer");
		}
		
		
		//Escribir con buffer
		
		FileWriter escritor;
		try {
			escritor = new FileWriter("C:\\Users\\Ramon RS\\Desktop\\datos.txt",true);
			BufferedWriter bufferEscritor = new BufferedWriter(escritor);
			String mensaje ="Escribo una nueva linea";
			bufferEscritor.newLine();
			bufferEscritor.write(mensaje);
			bufferEscritor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
