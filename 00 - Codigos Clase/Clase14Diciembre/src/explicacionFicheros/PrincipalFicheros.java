package explicacionFicheros;

import java.io.*;

public class PrincipalFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribir datos de series en un fichero
		Serie s1 = new Serie("Breaking Bad",10);
		Serie s2 = new Serie("The Wire",10);
		Serie s3 = new Serie("La que se avecina",6);
		Serie series[] = new Serie[5];
		series[0] = s1;
		series[1] = s2;
		series[2] = s3;
		
		//Para trabajar con ficheros tenemos que definir la ruta
		String rutaApp = System.getProperty("user.dir");
		String rutaFichero = rutaApp+"\\series.txt";
		System.out.println("Directorio actual : ");
		System.out.println(rutaApp);
		System.out.println("Fichero de series: ");
		System.out.println(rutaFichero);
		
		try {
			FileWriter escritor = new FileWriter(rutaFichero,true);
			BufferedWriter bfw = new BufferedWriter(escritor);
			
			//Recorrer la matriz de series y volcar la info al fichero
			for(Serie s: series) {
				if(s!=null) {
				bfw.write(s.volcarfichero());
				bfw.newLine();
				}
			}
			bfw.close();
			escritor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
