/**
 * 
 */
package ejerciciosTema;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PrincipalEjercicio3 {
	
	public static void guardarSerie(Serie series[],Serie s) {
		//La metemos en la primera posicion vacía de la matriz
		for(int j = 0;j<series.length;j++) {
			if(series[j]==null) {
				series[j] = s;
				break;
			}
		}
	}
	
	public static void mostrarSeries(Serie []series) {
		for(Serie s:series) {
			if(s==null) {
				break;
			}
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String ruta = System.getProperty("user.dir") + "/series.txt";
		final String rutaVotos = System.getProperty("user.dir") + "/votaciones.txt";
		int registros = Ejercicio1.contarRegistros(ruta);
		System.out.println(registros);
		Serie series[] = new Serie[999];
		//Lo primero que hace la aplicación es llenar la matriz
		//con las series que tenemos en el fichero
		if(registros>0) {
			try(BufferedReader bfLector = new BufferedReader(new FileReader(ruta));){
				
				int i = 0;
				String linea = "";
				while(linea!=null && i<series.length) {
					
					linea = bfLector.readLine();
					//Tenemos que reconstruir el objeto Serie a partir del String
					//Voy a trocearlo a partir del # , recordad que el fichero se guardan
					//las series con la siguiente estructura;
					//titulo#plataforma#valoracion#capitulos#genero#anho
					if(linea!=null) {
					String trozos[] = linea.split("#");
					String titulo = trozos[0];
					String plataforma = trozos[1];
					float valoracion = Float.parseFloat(trozos[2]);
					int capitulos = Integer.parseInt(trozos[3]);
					String genero = trozos[4];
					int anho = Integer.parseInt(trozos[5]);
					Serie s = new Serie(titulo,plataforma,capitulos,genero,anho);
					s.setValoracion(valoracion);
					
					//La metemos en la primera posicion vacía de la matriz
					guardarSerie(series,s);
					}
					//***********************************************
					i++;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//*********************************//
		//Presentar menú
		int opcion = 0;
		do {
		System.out.println("Escoja una opcion");
		System.out.println("1.Guardar nueva serie");
		System.out.println("2.Mostrar series");
		System.out.println("3.Puntuar serie");
		System.out.println("4.Buscar serie");
		System.out.println("5.Salir");
		//**************************************//
		Scanner lectorOpcion = new Scanner(System.in);
		opcion = lectorOpcion.nextInt();
		
		switch(opcion) {
		case 1:
			//Guarda serie en matriz y actualiza fichero
			
			Scanner lector = new Scanner(System.in);
			System.out.println("Introduce titulo");
			String titulo = lector.nextLine();
			
			
			System.out.println("Introduce plataforma");
			String plataforma = lector.nextLine();
			
			System.out.println("Introduce género");
			String genero = lector.nextLine();
			
			System.out.println("Introduce capitulos");
			int capitulos = lector.nextInt();
			
			System.out.println("Introduce anho");
			int anho = lector.nextInt();
			Serie s = new Serie(titulo , plataforma , capitulos , genero , anho);
			
			guardarSerie(series,s);
			
			//Debemos guardarla también en el fichero
			
			try(BufferedWriter bfEscritor = new BufferedWriter(new FileWriter(ruta,true));){
				String registroSerie = s.volcarFichero();
				bfEscritor.write(registroSerie);
				bfEscritor.newLine();
				bfEscritor.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case 2:
			mostrarSeries(series);
			break;
		
		case 3:
				//Realizar una votacion
			lector = new Scanner(System.in);
			System.out.println("Que serie deseas valorar");
			
			for(Serie ser : series) {
				if(ser==null)
					break;
				System.out.println(ser.getTitulo());
				
			}
			System.out.println("Introduce el título de la serie");
			String tituloSerie = lector.nextLine();
			System.out.println("Introduce la puntuación");
			float puntuacion = lector.nextFloat();
			
			//Guardamos en el fichero
			try(BufferedWriter bfLector2 = new BufferedWriter(new FileWriter(rutaVotos,true));){
				String registro = tituloSerie + "#" + Float.toString(puntuacion);
				bfLector2.write(registro);
				bfLector2.newLine();
				bfLector2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//************************************++
			//Actualizamos puntuación serie
			//Leemos fichero votaciones
			try(BufferedReader bfLector3 = new BufferedReader(new FileReader(rutaVotos));){
				
				float sumaPuntos = 0,valoracion = 0;
				String linea = "";
				int i = 0,contador=0;
				
				while(linea!=null&&i<series.length) {
					
					linea = bfLector3.readLine();
					if(linea!=null) {
					String trozos[] = linea.split("#");
					String tituloDeLaSerie = trozos[0];
					float v = Float.parseFloat(trozos[1]);
					if(tituloDeLaSerie.equals(tituloSerie)) {
						sumaPuntos+=v;
						contador++;
						}
					}
					
					
					i++;
				}
				valoracion = sumaPuntos/contador;
				
				//Nos falta actualizar la serie
				//Para ello la estrategia que vamos a utilizar es :
				//1. Modificamos la matriz 
				//2. Volvamos todos los datos de la matriz de nuevo al fichero
				
				for(int j = 0;j<series.length;j++) {
					if(series[j]!=null) {
						if(series[j].getTitulo().equals(tituloSerie)) {
							series[j].setValoracion(valoracion);
							break;
						}
					}
				}
				
				//2. Volcar al fichero
				try(BufferedWriter escritor1 = new BufferedWriter(new FileWriter(ruta,true));){
					for(Serie ser : series) {
						if(ser!=null) {
							escritor1.write(ser.volcarFichero());
							escritor1.newLine();
						}
					}
					escritor1.close();
				}
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case 4:
			//Mostrar datos serie a partir del título
			//Hacemos la búsqueda directamente en la matriz
			System.out.println("Introduce título de la serie");
			lector = new Scanner(System.in);
			String titulo3 = lector.nextLine();
			
			for(Serie se : series) {
				if(se!=null) {
					if(se.getTitulo().equals(titulo3)) {
						System.out.println(se);
						break;
					}
				}
			}
			
			default:
				System.out.println("Adios");
			break;
		}
		
		
		
		
		
		}
		while(opcion>0 && opcion <5);
		
	}

}
