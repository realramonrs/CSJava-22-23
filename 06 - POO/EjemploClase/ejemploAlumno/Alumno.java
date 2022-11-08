package ejemploAlumno;

import java.time.LocalDate;
import java.time.Period;

public class Alumno {
	
	private String nombre;
	private String email;
	private String dni;
	private LocalDate fecha;
	private Curso curso;
	private float notas[];
	private float media;
	
	//Constructores
	public Alumno(String nombre,String dni) {
		setNombre(nombre);
		setDni(dni);
	}

	public Alumno(String nombre, String email, String dni, LocalDate fecha, Curso curso) {
		super();
		setNombre(nombre);
		setEmail(email);
		setDni(dni);
		setFecha(fecha);
		this.curso = curso;
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
		//Validar con expresi�n regular
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
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		//Comprobamos que la fecha es posterior al d�a de hoy
		LocalDate hoy = LocalDate.now();
		if(fecha.isBefore(hoy)) {
			this.fecha = fecha;
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
	
	//M�todo poner nota
	public void ponerNota(float nota) {
		//Guardarla en la primera posici�n vac�a
		for(int i = 0;i<notas.length;i++) {
			if(notas[i]<0) {
				notas[i]=nota;
				calcularMedia();
				break;
			}
		}
	}
	
	//M�todo private para validar un dni
	
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
		//La media se calculan sobre las posiciones que no almacenan n�meros negativis
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
	
	
	public boolean isMayorEdad() {
		Period periodo = Period.between(this.fecha,LocalDate.now());	
		return periodo.getYears()>=18;
	}
}

