package tryConRecursos;
import java.io.*;

public class LeeryCopiarFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileReader lector = new FileReader("C:\\Users\\Ramon RS\\Desktop\\datos.txt");) {
			
			
			int c = 0;
			while(c!=-1) {
				 c = lector.read();
				
				 if(c!=-1)
				 System.out.print((char)c);
			}
			
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo");
		}
		catch(IOException e) {
			System.out.println("Algún error se ha producido accediendo al fichero");
		}
		
		//Escribir en el Fichero
		
		String cadena = "Nueva linea en el fichero";
		//Escribir caracter a caracter
		try(FileWriter escritor = new FileWriter("C:\\Users\\Ramon RS\\Desktop\\datos.txt",true);) {
			
			for(int i = 0;i<cadena.length();i++) {
				escritor.write(cadena.charAt(i));
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("hola");
	}

}
