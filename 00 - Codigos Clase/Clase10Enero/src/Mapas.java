import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Factura> facturasPendientes = new HashMap<String,Factura>();
		
		facturasPendientes.put("12345678W", new Factura("a1",300));
		facturasPendientes.put("34567892Q", new Factura("a2",290));
		facturasPendientes.put("9045323E", new Factura("a3",900));
		
		facturasPendientes.put("12345678W", new Factura("a4",800));
		
		//Visualizar las entradas de un mapa
		
		//Obtener la colección de valores
		Collection<Factura> facturas = facturasPendientes.values();
		
		System.out.println("Facturas pendiente de pago: ");
		for(Factura f : facturas) {
			System.out.println(f);
		}
		
		System.out.println("DNIS de clientes con facturas pendientes: ");
		//Obtener las claves:
		Set<String> clientes = facturasPendientes.keySet();
		for(String s : clientes) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Mostramos clave + valor: ");
		Set<Entry<String,Factura>> entradas =  facturasPendientes.entrySet();
		
		for(Entry<String,Factura> e : entradas) {
			System.out.println("DNI: " + e.getKey() + " " + e.getValue());
		}
		
		//el punto fuerte de los mapas es realizar búsquedas por clave:
		Factura f1 = facturasPendientes.get("1345678W");
		System.out.println("Factura buscada: " + f1);
		
		//búsqueda por valor:
		//Obtener el dni asociado a una factura cuyo código es a1
		Set<Entry<String,Factura>> entradas2 =  facturasPendientes.entrySet();
		
		System.out.println("Mostrar dni asociado a factura a2");
		for(Entry<String,Factura> entr: entradas2) {
			if(entr.getValue().getCodigo().equals("a2")) {
				System.out.println(entr.getKey());
			}
			
		}
		
			}

}
