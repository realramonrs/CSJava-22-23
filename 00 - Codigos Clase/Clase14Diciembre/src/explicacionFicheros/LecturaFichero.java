package explicacionFicheros;
import java.io.*;
public class LecturaFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rutaApp = System.getProperty("user.dir");
		String rutaFichero = rutaApp+"\\series.txt";
		//Recuperar toda la info del fichero a una matriz de Series
		Serie s[] = new Serie[10];
		
		try {
			FileReader lector = new FileReader(rutaFichero);
			BufferedReader bfr = new BufferedReader(lector);
			String registro = bfr.readLine();
			int i = 0;
			while(registro!=null) {
				String datos[] = registro.split("#");
				Serie s1 = new Serie(datos[0],Float.parseFloat(datos[1]));
				s[i] = s1;
				
				i++;
				registro = bfr.readLine();
			}
			
			for(Serie serie : s) {
				if(serie!=null) {
					System.out.println(serie.volcarfichero());
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error acceso al fichero");
		}
		
	}

}
