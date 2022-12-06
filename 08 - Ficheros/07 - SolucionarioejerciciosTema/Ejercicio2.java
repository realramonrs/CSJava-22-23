/**
 * 
 */
package ejerciciosTema;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.*;
public class Ejercicio2 {

	/**
	 * @param args
	 */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		String ruta = System.getProperty("user.dir")+"/cuentas.txt";
		
		String rutaLogin = System.getProperty("user.dir")+"/login.txt";
		Scanner lectorOpcion = new Scanner(System.in);
		do {
		System.out.println("1.)Log in");
		System.out.println("2.)Crear cuenta");
		opcion = lectorOpcion.nextInt();
		switch(opcion) {
		case 1:
			String userName0=null;
			
			
			String password0 = null;
			Scanner lector0 = new Scanner(System.in);
			System.out.println("Introduce el nombre de usuario:");
			userName0 = lector0.nextLine();
			System.out.println("Introduce la contraseña:");
			password0 = lector0.nextLine();
			
			
			//Buscar usuario en el fichero , para ello voy a utilizar
			//la fución que me vuelca registros a una matriz
			String regs[] = Ejercicio1.volcarFichero(ruta);
			boolean userEncontrado = false;
			boolean passCoincidente = false;
			//Busco username
			for(String registro : regs) {
				String usuario = registro.split("#")[0];
				String passw = registro.split("#")[1];
				userEncontrado = false;
				passCoincidente = false;
				if(usuario.equals(userName0)) {
					userEncontrado = true;
					if(passw.equals(password0)) {
						
						
						passCoincidente = true;
						//Inicio sesión
						//Obtener fecha y hora : java.time
						LocalDateTime ahora = LocalDateTime.now();
						
						
						//Escribir en el registrio de login
						try(BufferedWriter bfEscritor = new BufferedWriter(new FileWriter(rutaLogin,true));){
							
							bfEscritor.write(userName0 +"#" + password0 + "#" + ahora.toString());
							bfEscritor.newLine();
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					}
					break;
					
				}
			}
			
			if(userEncontrado && passCoincidente) {
				System.out.println("Credenciales correctas");
			}
			else if(userEncontrado) {
				System.out.println("Error en la contraseña");
			}
			else {
				System.out.println("Usuario no encontrado");
			}
			
			break;
		case 2:
			String userName=null;
			String password = null;
			
			Scanner lector = new Scanner(System.in);
			System.out.println("Introduce el nombre de usuario:");
			userName = lector.nextLine();
			System.out.println("Introduce la contraseña:");
			password = lector.nextLine();
			
			
			
			//Guardar en el fichero
			
			
			try(BufferedWriter bfEscritor = new BufferedWriter(new FileWriter(ruta,true));){
				
				bfEscritor.write(userName +"#" + password);
				bfEscritor.newLine();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		default:
			System.out.println("Adios");
		}
		}
		while(opcion==1 || opcion==2);
		
		

		
		
		
		//Volcar registros a matriz para trabajar
		
		
		
		
	}

}
