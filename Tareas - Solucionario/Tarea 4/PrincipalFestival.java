import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramon RS
 *
 */
public class PrincipalFestival {

	/**
	 * @param args
	 */
	static char leerOpcion() {
		/*********** Menú *****************/
		System.out.println("a. Añadir Grupo");
		System.out.println("b. Buscar Grupo.");
		System.out.println("c. Obtener Coste total.");
		System.out.println("d. Ver los 3 grupos más caros.");
		System.out.println("e. Ver grupos más populares.");
		System.out.println("f. Ver info festival");
		Scanner lector = new Scanner(System.in);
		char opcion= lector.next().charAt(0);
		return opcion;
		
	}
	
	static Grupo leerGrupo() {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre ");
		String nombre = lector.nextLine();
		System.out.println("Introduzca el tiempo de actuacion ");
		int actuacion = lector.nextInt();
		int popularidad=0;
		do {
		System.out.println("Introduzca el popularidad:[0-10] ");
		popularidad = lector.nextInt();
		}
		while(popularidad<0||popularidad>10);
		
		System.out.println("Introduzca el coste: ");
		float coste = lector.nextFloat();
		Grupo g = new Grupo(nombre,actuacion,popularidad,coste);
		return g;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Festival f = new Festival("Festimad" , 5);
		Grupo g1 = new Grupo("Osasis",100,7,2000);
		Grupo g2 = new Grupo("Keane" ,120 ,8,3000);
		
		f.addGrupo(g1);
		f.addGrupo(g2);
		f.addGrupo(new Grupo("U2",200,9,1500));
		f.addGrupo(new Grupo("Guns'n Roses",340,8,3200));
		char opcion;
		
		do {
			opcion = leerOpcion();
			
			switch(opcion) {
			case 'a':
				//Buscamos la primera pos vacía:
				f.addGrupo(leerGrupo());
				
				break;
			case 'b':
				System.out.println("Intro nombre del grupo que desea buscar:");
				Scanner lector = new Scanner(System.in);
				String nombre = lector.nextLine();
				boolean encontrado = false;
				for(Grupo x : f.getPrograma()) {
					if(x!=null) {
					if(x.getNombre().equals(nombre)) {
						System.out.println(x);
						encontrado = true;
						break;
					}
					}
				}
				if(!encontrado) {
					System.out.println("Grupo no encontrado.");
				}
				break;
			case 'c':
				System.out.println("El coste total es : " + f.getCoste());
				break;
			case 'd':
				System.out.println("Los 3 grupos más caros del Festival son:");
				
				//float maxCaro = f.dameGrupo(0).getCoste();
				Grupo masCaro = f.dameGrupo(0);
				int posCaro1 = -1;
				//Obtenemos el más caro
				for(int i = 0;i<f.getPrograma().length;i++) {
					Grupo local = f.dameGrupo(i);
					if(local!=null) {
						if(local.calcularCosteTotal()>masCaro.calcularCosteTotal()) {
							masCaro = local;
							posCaro1 = i;
							
						}
					}
				}
				
				System.out.println("Grupo más caro: " + masCaro);
				
				//Obtenemos el segundo más caro:
				Grupo masCaro2 = f.dameGrupo(0);
				int posCaro2 = 0;
				//Obtenemos el más caro
				for(int i = 0;i<f.getPrograma().length;i++) {
					if(i==posCaro1) {
						continue;
					}
					Grupo local = f.dameGrupo(i);
					if(local!=null) {
						if(local.calcularCosteTotal()>masCaro2.calcularCosteTotal()) {
							masCaro2 = local;
							posCaro2 = i;
							
						}
					}
				}
				System.out.println("2º grupo más caro: " + masCaro2);
				
				//Obtenemos el segundo más caro:
				Grupo masCaro3 = f.dameGrupo(0);
				int posCaro3 = 0;
				//Obtenemos el más caro
				for(int i = 0;i<f.getPrograma().length;i++) {
					if(i==posCaro1 || i == posCaro2) {
						continue;
					}
					Grupo local = f.dameGrupo(i);
					if(local!=null) {
						if(local.calcularCosteTotal()>masCaro3.calcularCosteTotal()) {
							masCaro3 = local;
							posCaro3 = i;
							
						}
					}
				}
				System.out.println("3er grupo más caro: " + masCaro3);
				
				
				
				break;
			case 'e':
				System.out.println("Introduzca la popularidad mínima: ");
				int popul = new Scanner(System.in).nextInt();
				for(Grupo g : f.getPrograma()) {
					if(g!=null) {
						if(g.getPopularidad()>=popul) {
							System.out.println(g);
						}
					}
				}
				break;
			case 'f':
				System.out.println(f);
				break;
				default:
					break;
			}
			
		}
		while(opcion!='g');
		
		
		System.out.println(f);
		
	}

}
