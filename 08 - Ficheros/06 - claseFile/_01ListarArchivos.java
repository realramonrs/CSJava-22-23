package claseFile;

import java.io.File;

public class _01ListarArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\Ramon RS\\eclipse-workspace");
		String ficheros[] = f.list();
		
		for(String ruta : ficheros) {
			System.out.print(ruta + " ");
			File fInterior = new File(f.getAbsolutePath(),ruta);
			if(fInterior.isDirectory()) {
				String archivos[] = fInterior.list();
				for(String subRuta : archivos) {
					System.out.println("\t" + subRuta + " ");
				}
			}
			
		}

	}

}
