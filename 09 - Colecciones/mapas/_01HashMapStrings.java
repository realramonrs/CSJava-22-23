package mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _01HashMapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> dnis = new HashMap<String , String>();
		
		dnis.put("12345678A", "Adrián Jocarias");
		dnis.put("99999999A","María Sánchez");
		dnis.put("55555555A" , "Esteban Portabales");
		//Intento guardar un dni que ya está
		if(!dnis.containsKey("12345678A")) {
			dnis.put("12345678","Cuidado que sustituyo");
		}
		else {
			System.out.println("Clave repetida");
		}
		
		System.out.println(dnis);
		//Recuperar claves
		Set<String> claves = dnis.keySet();
		
		for(String clave : claves) {
			
		}
		
		//Recuperar los valores
		Collection<String> valores = dnis.values();
		
		//Búsqueda por clave
		String nombre = dnis.get("123e45678A");
		System.out.println(nombre);
		
		//Recorrer un diccionario con Map.entru
		
		Set<Entry<String, String>> entradas = dnis.entrySet();
		
		for(Entry<String,String> e : entradas) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		
	}

}
