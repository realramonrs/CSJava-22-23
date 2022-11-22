import java.time.LocalDate;
import java.time.Period;

public class Empleado {

	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private LocalDate fechaContratacion;
	protected float salario;
	protected static float salarioBase = 1000;
	
	
	public Empleado(String dni, String nombre, LocalDate fechaNacimiento, LocalDate fechaContratacion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaContratacion = fechaContratacion;
		//Calcular Salario
		this.calcularSalario();
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(LocalDate fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public float getSalario() {
		return salario;
	}
	
	//Método calcular salario
	public void calcularSalario() {
		//Calcular años de antiguedad
		int antiguedad = calcularAnhosAntiguedad();
		salario = salarioBase +  (antiguedad/3)*salarioBase*0.05f;
	}
	
	protected int calcularAnhosAntiguedad() {
		Period periodo = Period.between(fechaContratacion,LocalDate.now());
		return periodo.getYears();
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", fechaContratacion=" + fechaContratacion + ", salario=" + salario + "]";
	}
	
	
	
	
	
}
