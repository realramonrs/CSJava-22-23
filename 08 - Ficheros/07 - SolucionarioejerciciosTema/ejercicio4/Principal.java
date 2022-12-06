package ejercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void actualizarUsuarios(ArrayList<Usuario> lista) {
		// Comprobar si existe el fichero de usuarios
		File fichero = new File("usuarios.txt");
		if (fichero.exists() == false) {
			// Crear el fichero de usuarios
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		// Actualizar el fichero de usuarios
		try {
			FileWriter escritor = new FileWriter(fichero.getAbsolutePath(), false);
			BufferedWriter bufferEscritor = new BufferedWriter(escritor);
			for (Usuario u : lista) {
				bufferEscritor.write(u.toString());
				bufferEscritor.newLine();
			}
			bufferEscritor.close();
			escritor.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero.");
		}
		catch (IOException e) {
			System.out.println("No se ha podido acceder al fichero.");
		}
	}
	
	public static void actualizarSeries(ArrayList<Serie> lista) {
		// Comprobar si existe el fichero de series
		File fichero = new File("series.txt");
		if (fichero.exists() == false) {
			// Crear el fichero de series
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		// Actualizar el fichero de series
		try {
			FileWriter escritor = new FileWriter(fichero.getAbsolutePath(), false);
			BufferedWriter bufferEscritor = new BufferedWriter(escritor);
			for (Serie s : lista) {
				bufferEscritor.write(s.toString());
				bufferEscritor.newLine();
			}
			bufferEscritor.close();
			escritor.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero.");
		}
		catch (IOException e) {
			System.out.println("No se ha podido acceder al fichero.");
		}
	}
	
	public static void actualizarVotaciones(ArrayList<String> lista) {
		// Comprobar si existe el fichero de votaciones
		File fichero = new File("votaciones.txt");
		if (fichero.exists() == false) {
			// Crear el fichero de votaciones
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		// Actualizar el fichero de votaciones
		try {
			FileWriter escritor = new FileWriter(fichero.getAbsolutePath(), false);
			BufferedWriter bufferEscritor = new BufferedWriter(escritor);
			for (String v : lista) {
				bufferEscritor.write(v);
				bufferEscritor.newLine();
			}
			bufferEscritor.close();
			escritor.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero.");
		}
		catch (IOException e) {
			System.out.println("No se ha podido acceder al fichero.");
		}
	}

	public static void main(String[] args) {

		// Declarar listas
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Serie> series = new ArrayList<Serie>();
		ArrayList<String> votaciones = new ArrayList<String>();

		// Comprobar si existe el fichero de usuarios
		File ficheroUsuarios = new File("usuarios.txt");
		if (ficheroUsuarios.exists() == false) {
			// Crear el fichero de usuarios
			try {
				ficheroUsuarios.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		else {
			// Obtener usuarios del fichero
			try {
				String linea = "";
				FileReader lector = new FileReader(ficheroUsuarios.getAbsolutePath());
				BufferedReader buffer = new BufferedReader(lector);
				while (linea != null) {
					linea = buffer.readLine();
					if (linea != null) {
						usuarios.add(new Usuario(linea.split("#")[0], linea.split("#")[1], linea.split("#")[2]));
					}
				}
				buffer.close();
				lector.close();
			}
			catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el fichero.");
			}
			catch (IOException e) {
				System.out.println("No se ha podido acceder al fichero.");
			}
		}
		
		// Comprobar si existe el fichero de votaciones
		File ficheroVotaciones = new File("votaciones.txt");
		if (ficheroVotaciones.exists() == false) {
			// Crear el fichero de votaciones
			try {
				ficheroVotaciones.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		else {
			// Obtener votaciones del fichero
			try {
				String linea = "";
				FileReader lector = new FileReader(ficheroVotaciones.getAbsolutePath());
				BufferedReader buffer = new BufferedReader(lector);
				while (linea != null) {
					linea = buffer.readLine();
					if (linea != null) {
						votaciones.add(linea);
					}
				}
				buffer.close();
				lector.close();
			}
			catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el fichero.");
			}
			catch (IOException e) {
				System.out.println("No se ha podido acceder al fichero.");
			}
		}
		
		// Comprobar si existe el fichero de series
		File ficheroSeries = new File("series.txt");
		if (ficheroSeries.exists() == false) {
			// Crear el fichero de series
			try {
				ficheroSeries.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		else {
			// Obtener series del fichero
			try {
				String linea = "";
				FileReader lector = new FileReader(ficheroSeries.getAbsolutePath());
				BufferedReader buffer = new BufferedReader(lector);
				while (linea != null) {
					linea = buffer.readLine();
					if (linea != null) {
						Serie s = new Serie(linea.split("#")[0], linea.split("#")[1], Integer.parseInt(linea.split("#")[3]), linea.split("#")[4], Integer.parseInt(linea.split("#")[5]));
						s.setValoracion(Integer.parseInt(linea.split("#")[2]));
						series.add(s);
					}
				}
				buffer.close();
				lector.close();
			}
			catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el fichero.");
			}
			catch (IOException e) {
				System.out.println("No se ha podido acceder al fichero.");
			}
		}
		
		// Crear bucle para que el programa no se cierre
		String salir = "";
		do {
		
			// Mostrar opciones
			System.out.println("Escoja una opción:");
			System.out.println(" 1. Crear cuenta");
			System.out.println(" 2. Añadir serie");
			System.out.println(" 3. Votar serie");
			System.out.println(" 4. Ver series");
			System.out.println(" 5. Ver usuarios");
			System.out.println(" 6. Ver votaciones");
			
			// Obtener opción
			Scanner lectorConsola = new Scanner(System.in);
			String opcion = lectorConsola.nextLine();
			
			// Realizar opción escogida
			switch (opcion) {
			case "1":
				// Comprobar si el nombre de usuario es válido
				System.out.println("Introduzca un nombre de usuario:");
				String user = lectorConsola.nextLine();
				if (user.contains("#") || user.equals("")) {
					System.out.println("El nombre de usuario no es válido.");
				}
				else {
					// Comprobar si el nombre de usuario está repetido
					boolean repetido = false;
					for (Usuario u : usuarios) {
						if (u.getUsername().equals(user)) {
							repetido = true;
							break;
						}
					}
					if (repetido == false) {
						// Comprobar si la contraseña es válida
						System.out.println("Introduzca una contraseña:");
						String contrasenha = lectorConsola.nextLine();
						if (contrasenha.contains("#") || contrasenha.equals("")) {
							System.out.println("La contraseña no es válida.");
						}
						else {
							// Comprobar si el email es válido
							System.out.println("Introduzca un email:");
							String email = lectorConsola.nextLine();
							if (email.contains("#") || email.equals("")) {
								System.out.println("El email no es válido.");
							}
							else {
								// Crear usuario y añadirlo a la lista
								usuarios.add(new Usuario(user, contrasenha, email));
								actualizarUsuarios(usuarios);
								System.out.println("La cuenta se ha creado correctamente.");
							}
						}
					}
					else {
						System.out.println("El usuario introducido ya existe.");
					}
				}
				break;
			case "2":
				// Comprobar si el título es válido
				System.out.println("Introduzca el título de la serie:");
				String titulo = lectorConsola.nextLine();
				if (titulo.equals("") || titulo.contains("#")) {
					System.out.println("El título introducido no es válido.");
				}
				else {
					// Comprobar si la plataforma es válida
					System.out.println("Introduzca la plataforma de la serie:");
					String plataforma = lectorConsola.nextLine();
					if (plataforma.equals("") || plataforma.contains("#")) {
						System.out.println("La plataforma introducida no es válida.");
					}
					else {
						// Comprobar si el número de capítulos es válido
						System.out.println("Introduzca el número de capítulos de la serie:");
						int capitulos = Integer.parseInt(lectorConsola.nextLine());
						if (capitulos <= 0) {
							System.out.println("El número de capítulos introducido no es válido.");
						}
						else {
							// Comprobar si el género es válido
							System.out.println("Introduzca el género de la serie:");
							String genero = lectorConsola.nextLine();
							if (genero.equals("") || genero.contains("#")) {
								System.out.println("El género introducido no es válido.");
							}
							else {
								// Comprobar si el año es válido (la primera película de la historia es del año 1888)
								System.out.println("Introduzca el año de la serie:");
								int anho = Integer.parseInt(lectorConsola.nextLine());
								if (anho < 1888) {
									System.out.println("El año introducido no es válido.");
								}
								else {
									// Crear serie y añadirla a la lista
									series.add(new Serie(titulo, plataforma, capitulos, genero, anho));
									actualizarSeries(series);
									System.out.println("La serie se ha añadido correctamente.");
								}
							}
						}
					}
				}
				break;
			case "3":
				// Comprobar si el nombre de usuario existe
				System.out.println("Introduzca su nombre de usuario:");
				String nombreVotacion = lectorConsola.nextLine();
				String contrasenha = "";
				for (Usuario u : usuarios) {
					if (u.getUsername().equals(nombreVotacion)) {
						contrasenha = u.getPassword();
					}
				}
				if (!contrasenha.equals("")) {
					// Comprobar si la contraseña coincide
					System.out.println("Introduzca su contraseña:");
					String contrasenhaVotacion = lectorConsola.nextLine();
					if (contrasenha.equals(contrasenhaVotacion)) {
						// Comprobar si la serie existe
						System.out.println("Introduzca el título de la serie:");
						String tituloVotacion = lectorConsola.nextLine();
						boolean existe = false;
						for (Serie s : series) {
							if (s.getTitulo().equals(tituloVotacion)) {
								existe = true;
							}
						}
						if (existe == true) {
							// Comprobar si la valoración es válida
							System.out.println("Introduzca una valoración entre 0 y 10:");
							int votacion = Integer.parseInt(lectorConsola.nextLine());
							if (votacion >= 0 && votacion <= 10) {
								// Crear votación y añadirla a la lista
								String nuevaVotacion = nombreVotacion + "#" + tituloVotacion + "#" + votacion;
								votaciones.add(nuevaVotacion);
								actualizarVotaciones(votaciones);
								// Actualizar serie
								int suma = 0;
								int cuenta = 0;
								for (String v : votaciones) {
									if (v.split("#")[1].equals(tituloVotacion)) {
										suma += Integer.parseInt(v.split("#")[2]);
										cuenta++;
									}
								}
								int media = Math.round(suma / cuenta);
								for (Serie s : series) {
									if (s.getTitulo().equals(tituloVotacion)) {
										s.setValoracion(media);
										break;
									}
								}
								actualizarSeries(series);
								System.out.println("La votación se ha añadido correctamente.");
							}
							else {
								System.out.println("La votación introducida no es válida.");
							}
						}		
						else {
							System.out.println("La serie introducida no es válida.");
						}
					}
					else {
						System.out.println("La contraseña introducida no es válida.");
					}
				}
				else {
					System.out.println("El usuario introducido no existe.");
				}
				break;
			case "4":
				// Mostrar el título de cada serie guardada
				for (Serie s : series) {
					System.out.println(s.getTitulo());
				}
				break;
			case "5":
				// Mostrar el nombre de cada usuario guardado
				for (Usuario u : usuarios) {
					System.out.println(u.getUsername());
				}
				break;
			case "6":
				// Mostrar cada votación guardada
				for (String votacion : votaciones) {
					System.out.println("El usuario \"" + votacion.split("#")[0] + "\" ha votado la serie \"" + votacion.split("#")[1] + "\" con un " + votacion.split("#")[2] + ".");
				}
				break;
			default:
				System.out.println("El número introducido no es válido");
				break;
			}
			// Preguntar si se desea salir del programa
			System.out.println("¿Desea salir del programa? (S/N)");
			salir = lectorConsola.nextLine();	
		}
		while (!salir.equals("S"));
		
	}

}
