package listas;

import java.util.*;

public class PrincipalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> matriculas = new ArrayList<String>();
		matriculas.add("4567PIU");
		matriculas.add("1234LKQ");
		
		
		
		
		ArrayList<String> alumnos = new ArrayList<String>(2);
		alumnos.add("Pedro Gutierrez");
		alumnos.add("Julia Ventura");
		alumnos.add("Carlos Dominguez");
		alumnos.add("Maria Sánchez");
		
		//Visualizar por consola la lista
				System.out.println("Alumnos : ");
				for(int i = 0;i<alumnos.size();i++) {
					System.out.println(alumnos.get(i));
				}
		System.out.println("*********************************");
		ArrayList<String> matriculados = new ArrayList<String>(alumnos);
		
		//matriculados.addAll(alumnos);
		List<String> alumnosConDescuento = matriculados.subList(0, 2);
		
		//Recuperar objetos almacenados en un ArrayList
		String alumnoCero = alumnos.get(0);
	
		//Búsquedas: indexOf
		int posicion = alumnos.indexOf("Julia Ventura");
		
		//Eliminar objetos: remove(), clear(), 
		//Eliminar alumno posición cero
		alumnos.remove(0);
		//Eliminar por valor:
		alumnos.remove("Carlos Dominguez");
		
		//Visualizar por consola la lista
		System.out.println("Alumnos después de eliminaciones: ");
		for(int i = 0;i<alumnos.size();i++) {
			System.out.println(alumnos.get(i));
		}
		
		//Utilizando un for mejorado: (for each)
		//Mostrar alumnos cuyo nombre empiece por M
		System.out.println("**********************************");
		System.out.println("Alumnos cuyo nombre empieza por M");
		ArrayList<String> alumnos2 = new ArrayList<String>(100);
		
		alumnos2.addAll(alumnos);
		System.out.println("Número de alumnos : " + alumnos2.size());
		for(String al : alumnos2) {
			if(al.startsWith("M"))
			     System.out.println(al);		
			
		}
		
		ArrayList<String> apellidos = new ArrayList<String>();
		apellidos.add("Sánchez");
		apellidos.add("Vazquez");
		apellidos.add("Velazquez");
		apellidos.add("Verdugo");
		apellidos.add("Antunez");
		
		//Eliminar todos los apellidos que empiecen por V
	/*	for(String apellido : apellidos) {
			if(apellido.startsWith("V")) {
				apellidos.remove(apellido);
			}
			
		}*/
		System.out.println("************************************");
		System.out.println("Apellidos almacenados: ");
		Iterator<String> it = apellidos.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		for(int i = 0;i<apellidos.size();i++) {
			if(apellidos.get(i).startsWith("V")) {
				apellidos.remove(i);
				i--;
			}
		}
		
		
		System.out.println("*******************************");
		System.out.println("Después de eliminar los que empiezan por V:");
		for(String s : apellidos) {
			System.out.println(s);
		}
		
		//Vuelvo a generar el iterador:
	/*	it = apellidos.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}*/
		
		
		
		
		
		
		
		
	}

}
