
public class MetodosArraysFacturas {

	//Método que guarda una Factura en una matriz de facturas
	public static boolean guardarFactura(Factura f,Factura facturas[]) {
		for(int i = 0;i<facturas.length;i++) {
			if(facturas[i]==null) {
				facturas[i] = f;
				return true;
			}
		}
		return false;
	}
	
	//Método que permite visualizar por consola una matriz de facturas.
	public static void mostrarFacturas(Factura facturas[]) {
		for(Factura f: facturas) {
			if(f!=null) {
			     System.out.println(f);
		}
		}
	}
	//Método que busque una factura a partir del código
	
	public static Factura buscarFactura(String codigo,Factura fs[]) {
		
		for(Factura f : fs) {
			if(f!=null) {
				if(f.getCodigo().equals(codigo)) {
					return f;
				}
			}
		}
		
		return null;
	}
	
	public static boolean eliminarFactura(String codigo,Factura fs[]) {
		
		for(int i = 0;i<fs.length;i++) {
			if(fs[i]!=null) {
				if(fs[i].getCodigo().equals(codigo)) {
					fs[i] = null;
					//Reordenar la matriz , pasando todas las posiciones null para el final
					return true;
					
				}
			}
		}
		return false;
	}
	
	
	
}
