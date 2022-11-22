import java.time.LocalDate;

public class Directivo extends Empleado {

	private String telefono;
	private boolean bonoPremium;
	
	//Constructor
	public Directivo(String nombre,String dni,LocalDate fNacimiento,LocalDate fContrat,String telefono) {
		//Primera línea --> Llamar a un constructor de la clase base --> super(argumentos)
		super(dni,nombre,fNacimiento,fContrat);
		
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	public void calcularSalario() {
		int antiguedad = super.calcularAnhosAntiguedad();
		super.salario= Empleado.salarioBase +  (antiguedad/3)*salarioBase*0.2f;
	}
	
	public void activarBono() {
		this.bonoPremium = true;
	}
	public void desactivarBono() {
		this.bonoPremium = false;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Teléfono : " +this.telefono;
	}
}
