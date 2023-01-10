import java.util.ArrayList;

public class RepasoListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Listas, Conjuntos , Mapas
		ArrayList<String> lista = new ArrayList<String>();
		//ArrayList listaObject = new ArrayList();
		//Añadir objetos
		lista.add("Pedro");
		lista.add("Luis");
		lista.add("Marcos");
		lista.add(1, "Juan");
		
		//Nombres guardados
		System.out.println("Nombres: ");
		for(int i = 0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		//Mostrar los nombres que empiezan por P
		for(int i = 0;i<lista.size();i++) {
			if(lista.get(i).startsWith("P")) {
				
			}
			
		}
		
		//Eliminar algún objeto
		lista.remove(0);
		lista.remove("Pedro");
		
		System.out.println("Nombres: ");
		for(int i = 0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		

	}

}
