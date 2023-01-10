/**
 * 
 */
package ejercicios;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
/**
 * @author Ramon RS
 *
 */
public class Ejercicio6 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Float> notas = new HashMap<String,Float>();
		
		notas.put("12345678A", 5f);
		notas.put("98765432B",7.3f);
		notas.put("11111111S",8.9f);
		notas.put("09282812S",3.75f);
		notas.put("09282812S",3.75f);
		
		//Recorrer un Mapa :
		//Método 1: Obteniendo los valores y las claves
		
		
		System.out.println("Valores del mapa : ");
		Collection<Float> valores = notas.values();
		System.out.println(valores);
		System.out.println("Claves del mapa : ");
		System.out.println();
		Set<String> claves = notas.keySet();
		System.out.println(claves);
		System.out.println();
		//Método 2: Método entrySet()
		Set<Entry<String, Float>> entradas = notas.entrySet();
		System.out.println("Entradas en el mapa : ");
		
		for(Entry<String,Float> e : entradas) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		System.out.println();
		
		System.out.println("********* Trabajando con los métodos de Map *********");
		System.out.println("Numero de elementos que tiene mapa: notas.size() = "+notas.size());

		//Búsqueda por DNI
		float nota = notas.get("12345678A");
		System.out.println("DNI:12345678A. Nota : " + nota );
		
					
		//Eliminamos una entrada
		notas.remove("98765432B");
	}

}
