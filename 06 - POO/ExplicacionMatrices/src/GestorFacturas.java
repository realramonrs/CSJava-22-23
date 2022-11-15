
public class GestorFacturas {
	
	private Factura f[];
	
	//Constructores
	public GestorFacturas() {
		f = new Factura[50];
	}
	public GestorFacturas(int capacidad) {
		f = new Factura[capacidad];
	}
	
	//Métodos de acceso
	public void setFacturas(Factura f[]) {
		this.f = f;
	}
	public Factura[] getFacturas() {
		return this.f;
	}
	
	public boolean guardarFactura(Factura factura) {
		for(int i = 0;i<f.length;i++) {
			if(f[i]==null) {
				//Buscar facturas con el mismo código
				if(buscarFactura(factura.getCodigo())) {
					
					return false;
				}
				f[i] = factura;
				return true;
			}
		}
		return false;
	}
	
	public boolean buscarFactura(String codigo) {
		for(Factura factura: f) {
			if(factura!=null) {
				if(factura.getCodigo().equals(codigo)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public float calcularTotalFacturado() {
		float total = 0;
		for(Factura fac : f) {
			if(fac!=null) {
				total+=fac.getImporte();
			}
		}
		return total;
	}
	
	public void mostrarFacturas() {
		for(Factura fa:f) {
			if(fa!=null) {
			   System.out.println(fa);
			}
		}
	}

}
