import java.util.ArrayList;
import java.util.HashMap;

public class Mapas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Factura> facturas = new ArrayList<Factura>();
		facturas.add(new Factura("a1",500));
		facturas.add(new Factura("a2",500));
		facturas.add(new Factura("a3",500));
		facturas.add(new Factura("a4",500));
		facturas.add(new Factura("a5",500));
		facturas.add(new Factura("a6",500));
		facturas.add(new Factura("a7",800));
		
		ArrayList<Factura> facturas2 = new ArrayList<Factura>();
		facturas2.add(new Factura("b1",500));
		facturas2.add(new Factura("b2",300));
		facturas2.add(new Factura("b3",300));
		
		HashMap<String,ArrayList<Factura>> contabilidad = new HashMap<String,ArrayList<Factura>>();
		
		contabilidad.put("12345678W", facturas);
		contabilidad.put("90909090Q", facturas2);
		
		//Obtener total facturado a un cliente
		String dniCliente = "12345678W";
		
		
		ArrayList<Factura> f1 = contabilidad.get(dniCliente);
		int suma = 0;
		for(Factura f : f1) {
			suma+=f.getImporte();
		}
		
		System.out.println("Total facturado a " + dniCliente + " " + suma);

	}

}
