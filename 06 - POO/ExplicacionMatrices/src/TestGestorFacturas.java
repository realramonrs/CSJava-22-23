import java.time.LocalDate;

public class TestGestorFacturas {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		GestorFacturas miGestor = new GestorFacturas();
		GestorFacturas otroGestor = new GestorFacturas(30);
		
		try {
			miGestor.guardarFactura(new Factura("QW34",LocalDate.of(2022, 11, 14),900));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			miGestor.guardarFactura(new Factura("SE88",LocalDate.of(2022, 11, 10),1800));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			miGestor.guardarFactura(new Factura("SE88",LocalDate.of(2022, 11, 10),1800));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		miGestor.mostrarFacturas();
		System.out.println("Total facturado: " + miGestor.calcularTotalFacturado());
	}

}
