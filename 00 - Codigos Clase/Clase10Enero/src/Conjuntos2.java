import java.util.HashSet;
import java.util.TreeSet;

public class Conjuntos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a1 = "a1";
		String a2 = new String("a1");
		
		System.out.println("Hashcode de a1: " + a1.hashCode());
		System.out.println("Hashcode de a2: " + a2.hashCode());
		
		Integer i1 = 3;
		Integer i2 = 3;
		
		System.out.println("Hashcode de i1: " + i1.hashCode());
		System.out.println("Hashcode de i2: " + i2.hashCode());

		HashSet<Factura> fcts = new HashSet<Factura>();
		fcts.add(new Factura("a1",34.5f));
		fcts.add(new Factura("a2",450));
		fcts.add(new Factura("a3",125.5f));
		fcts.add(new Factura("a3",430));
		fcts.add(new Factura("a4",430));		
		
		System.out.println("Info facturas: ");
		
		for(Factura f: fcts) {
			System.out.println(f.getCodigo() + " " + f.hashCode());
		}
		
		TreeSet<Factura> facturasOrdenadas = new TreeSet<Factura>(fcts);
		
		System.out.println("Facturas ordenadas por código: ");
		
		for(Factura s: facturasOrdenadas) {
			System.out.println(s);
		}
		
		
	}

}
