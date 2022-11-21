package ejercicio05;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Alumno {
	
	private String nombre;
	private String email;
	private String dni;
	private LocalDate fechaNacimiento;
	private int edad;
	private Curso curso;
	private float notas[];
	private float media;
	
	//Constructores
	public Alumno(String nombre,String dni,LocalDate fechaNacimiento,int numeroNotas) {
		setNombre(nombre);
		setDni(dni);
		setFechaNacimiento(fechaNacimiento);
		//Inicializar matriz de notas
		notas = new float[numeroNotas];
		for(int i = 0;i<notas.length;i++) {
			notas[i] = -1;
		}
	}

	public Alumno(String nombre, String email, String dni, LocalDate fecha, Curso curso) {
		super();
		setNombre(nombre);
		setEmail(email);
		setDni(dni);
		setFechaNacimiento(fecha);
		this.curso = curso;
		
		//Inicializar matriz de notas
				notas = new float[10];
				for(int i = 0;i<notas.length;i++) {
					notas[i] = -1;
				}
	}

	public String getNombre() {
		
		
		return nombre;
	}

	public void setNombre(String nombre) {
		//Validar que tenga al menos 2 cadenas
		if(nombre.length()>=2)
			this.nombre = nombre;
	}

	public String getEmail() {
		
	
		return email;
	}

	public void setEmail(String email) {
		//Validar con expresión regular
		if(email.matches("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(validarDNI(dni))
			this.dni = dni;
	}

	public LocalDate getFecha() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fecha) {
		//Comprobamos que la fecha es posterior al día de hoy
		LocalDate hoy = LocalDate.now();
		if(fecha.isBefore(hoy)) {
			this.fechaNacimiento = fecha;
			setEdad();
		}
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public float[] getNotas() {
		return notas;
	}

	public float getMedia() {
		return media;
	}
	
	//Método poner nota
	public void ponerNota(float nota) {
		//Guardarla en la primera posición vacía
		for(int i = 0;i<notas.length;i++) {
			if(notas[i]<0) {
				notas[i]=nota;
				calcularMedia();
				break;
			}
		}
	}
	
	//Método private para validar un dni
	
	private boolean validarDNI(String dni) {
		if(dni.length()!=9) {
			return false;
		}
		else {
			if(!dni.matches("[0-9]{8}[A-Za-z]")) {
				return false;
			}
		
		char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N',
				'J','Z','S','Q','V','H','L','C','K','E'};
		
			
		//Lo pasamos a entero para poder dividir entre 23
		int dniNumero = Integer.parseInt(dni.substring(0, 8));
		int resto = dniNumero%23;
		char letra = letras[resto];
		return letra==dni.charAt(8);
			
		}
		
	}

	private void calcularMedia() {
		//La media se calculan sobre las posiciones que no almacenan números negativis
		float suma = 0;
		int contador = 0;
		for(float nota : notas) {
			if(nota>=0) {
				contador++;
			}
		}
		//Calculamos media
		for(int i = 0;i<contador;i++) {
			suma+=notas[i];
		}
		this.media = suma/contador;
	}
	private void setEdad() {
		Period periodo = Period.between(this.fechaNacimiento,LocalDate.now());	
		this.edad = periodo.getYears(); 
	}
	
	
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", email=" + email + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento
				+ ", edad=" + edad + ", curso=" + curso + ", notas=" + Arrays.toString(notas) + ", media=" + media
				+ "]";
	}

	public boolean isMayorEdad() {
		Period periodo = Period.between(this.fechaNacimiento,LocalDate.now());	
		return periodo.getYears()>=18;
	}
}

