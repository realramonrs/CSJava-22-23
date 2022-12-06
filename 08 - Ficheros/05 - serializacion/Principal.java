package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pelicula p[] = new Pelicula[3];
		
		p[0] = new Pelicula("Origen","Christopher Nolan",9);
		p[1] = new Pelicula("El apartamento","Bill Wilder", 10);
		p[2] = new Pelicula("Regreso al Futuro","Robert Zemeckis",10);
		
		try {
			FileOutputStream flujoSalida = new FileOutputStream("C:\\Users\\Ramon RS\\Desktop\\salidaobjeto.txt"); 
			ObjectOutputStream escritor = new ObjectOutputStream(flujoSalida);
			escritor.writeObject(p);
			escritor.close();
			
			//Recuperamos los objetos del fichero
			
			Pelicula pCopia[];
			ObjectInputStream lector =
			new ObjectInputStream(new FileInputStream("C:\\Users\\Ramon RS\\Desktop\\salidaobjeto.txt"));
			pCopia = (Pelicula[]) lector.readObject();
			
			//Mostramos por Consola para comprobar
			for(Pelicula peli:pCopia) {
				System.out.println(peli);
			}
		}
		catch(Exception e) {
			
		}
		finally {
			
		}
		

	}

}
