import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Conjuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<T>--> No admiten duplicados
		//TreeSet --> Ordena los objetos según su orden natural
		//HashSet --> Orden hasheado
		//LinkedHashSet
		
		HashSet<String> matriculas = new HashSet<String>();
		matriculas.add("GHT1234GHT");
		matriculas.add("OTY5693OTY");
		matriculas.add("ERT9876ERT");
		matriculas.add("4545HT1234GHT");
	
		for(String m : matriculas) {
			System.out.println(m);
		}
		
	   //Búsqyedas en un set --> método contains
		boolean encontrado = matriculas.contains("1234DFR");
		
		//matriculas.remove("1234GHT");
		
		TreeSet<String> matriculasOrdenadas = new TreeSet<String>(matriculas);
		System.out.println("Matriculas ordenadas: ");
		for(String m : matriculasOrdenadas) {
			System.out.println(m);
		}
		
		//Conjunto que mantiene el orden de inserción
		LinkedHashSet<String> listaLink = new LinkedHashSet<String>();
		listaLink.add("Aspas");
		listaLink.add("Lewandovski");
		listaLink.add("Vinicius");
		listaLink.add("Borja Iglesias");
		
		for(String m : listaLink) {
			System.out.println(m);
		}
		
		LinkedHashSet<String> listaLinkMatriculas = new LinkedHashSet<String>(matriculas);
		System.out.println("Matriculas volcadas a un LinkedHasSet: ");
		
		for(String m : listaLinkMatriculas) {
			System.out.println(m);
		}
	}

}
