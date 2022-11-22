import java.time.LocalDate;

public class Administrativo extends Empleado {
	
	private String codigoPortatil;

	public Administrativo(String dni, String nombre, LocalDate fechaNacimiento, LocalDate fechaContratacion,
			String codigoPortatil) {
		super(dni, nombre, fechaNacimiento, fechaContratacion);
		this.codigoPortatil = codigoPortatil;
	}

	public String getCodigoPortatil() {
		return codigoPortatil;
	}

	public void setCodigoPortatil(String codigoPortatil) {
		this.codigoPortatil = codigoPortatil;
	}

	@Override
	public String toString() {
		return super.toString() + " Administrativo [codigoPortatil=" + codigoPortatil;
	}

	
	
	public void calcularSalario() {
		int antiguedad = super.calcularAnhosAntiguedad();
		super.salario= Empleado.salarioBase +  (antiguedad/3)*salarioBase*0.09f;
	}

	
	
	
	
	

}
