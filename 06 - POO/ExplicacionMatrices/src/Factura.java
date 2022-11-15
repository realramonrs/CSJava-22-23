import java.time.LocalDate;

public class Factura {

	private String codigo; //Está compuesto por 2 letras y 2 dígitos
	private LocalDate fecha;
	private float importe;
	
	//Constructores
	public Factura(String codigo, LocalDate fecha, float importe)  {
		
		if(validarCodigo(codigo)) {
			this.codigo = codigo;
		}
		
		setFecha(fecha);
		this.importe = importe;
	}

	//Métodos de acceso
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		//Verificar que la fecha es anterior al día de hoy
		if(fecha.isBefore(LocalDate.now())|| fecha.isEqual(LocalDate.now())) {
			this.fecha = fecha;
		}
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Factura [codigo=" + codigo + ", fecha=" + fecha + ", importe=" + importe + "]";
	}
	
	//Método que valida la factura
	
	private boolean validarCodigo(String codigo) {
		/*if(codigo.matches("[A-Z]{2}[0-9]{2}")) {
			return true;
		}
		else {
			return false;
		}*/
		return codigo.matches("[A-Za-z]{2}[0-9]{2}");
	}
}
