/**
 * 
 */
package ejerciciosTema;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio1 {

	//Ap a.) Función que cuenta registros de fichero
	public static int contarRegistros(String ruta) {

		int contador = 0;
		try(FileReader lector = new FileReader(ruta);
				BufferedReader bfLector = new BufferedReader(lector);){
			String linea = "";
			while(linea!=null||linea=="") {
				linea = bfLector.readLine();
				if(linea!=null)
				contador++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contador;
	}
	
	//Ap b.) Función que escribe una línea en un fichero
	public static void escribirFichero(String ruta , String mensaje) {
		try(BufferedWriter bfEscritor = new BufferedWriter(new FileWriter(ruta,true));){
			
			bfEscritor.write(mensaje);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

	//Ap  c) Función que vuelca a una matriz de Strings registros de un fichero
	public static String[] volcarFichero(String ruta) {
		String registros[] = new String[contarRegistros(ruta)];
		
		try(BufferedReader lector = new BufferedReader(new FileReader(ruta));){
			
			String linea = "";
			int i = 0;
			while(linea!=null&&i<registros.length) {
				registros[i] = lector.readLine();
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return registros;
	}
	
	//************************************************************
	//Ap d)Función que vuelca a un fichero una matriz de Strings
	//*************************************************************
	
	public static void volcarMatrizAFichero(String []matriz , String ruta) {			

		int i = 0;
		while(i<matriz.length&&matriz[i]!=null) {
			escribirFichero(ruta , matriz[i]);
			i++;
				}
			}
		

	///************************************************************
	//Ap  e) Mostrar directorios
	//*************************************************************

	public static void mostrarDirectorios(String ruta) {
		File file = new File(ruta);
		String archivos[] = file.list();
		
		for(String s : archivos) {
			File fInterno = new File(file.getAbsolutePath(),s);
			if(fInterno.isDirectory()) {
				System.out.println(fInterno.getName());
			}
			
		}
	}
	
	///************************************************************
	//Ap  f) Mostrar ficheros con extensión
	//*************************************************************
	
	public static void mostrarFicherosorExtension(String ruta , String extension) {
		File f = new File(ruta);
		String []ficheros = f.list();
		
		for(String fi : ficheros) {
			File archivoHijo = new File(f.getAbsolutePath(),fi);
			if(archivoHijo.isFile()) {
				String nombre = archivoHijo.getName();
				//Comprobar existencia extension
				int posPunto = nombre.indexOf(".");
				if(posPunto>0) {
					String ext = nombre.substring(posPunto+1);
				
					
					if(ext.equals(extension)) {
						System.out.println(nombre);
					}
				}				
							
			}
	}
}
}
