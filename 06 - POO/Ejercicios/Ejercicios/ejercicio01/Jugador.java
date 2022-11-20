package ejercicio01;

import java.time.LocalDate;

public class Jugador {
	/* Atributos (Datos) de esta clase */
	 private String codigo;
	 private String nombre;
	 private int puntos;
	 private static String competicion;
	 private LocalDate fechaCreacion;
	 
	 //Constructor por defecto
	 public Jugador() {
		 super();
		 fechaCreacion = LocalDate.now();
		 
	 }
	 
	 //Sobrecarga del constructor
	 public Jugador(String codigo,String nombre) {
		 
		 setCodigo(codigo);  //Llamo al método setCodigo para validar el formato.
		 this.nombre = nombre;
		// fechaCreacion = LocalDate.now();
		
	 }
	 
	 //Métodos de acceso
	 //::Atributo codigo
	 

	 public String getCodigo() {
		 return this.codigo;
	 }
	 
	 public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	

	public void setCodigo(String codigo) {
		/* if(codigo.length()==2) {
			 if(Character.isLetter(codigo.charAt(0)) && Character.isDigit(codigo.charAt(1))) {
				 this.codigo = codigo;
			 }
		 }*/
		 if(codigo.matches("[A-Za-z][0-9]")) {
			 this.codigo = codigo;
		 }
		 
	 }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}
	
	//metodos estáticos que dan acceso a la variable estática Competicion
	
	 public static String getCompeticion() {
			return competicion;
		}

		public static void setCompeticion(String competicion) {
			Jugador.competicion = competicion;
		}
	
	public void actualizarPuntos(int ptos) {
		this.puntos+=ptos;
	}

	
	//Método que recibe dos jugadores y devuelve el que tiene más puntos
	public static Jugador comparaPuntos(Jugador j1,Jugador j2) {
		if(j1.getPuntos()>j2.getPuntos()) {
			return j1;
		}
		return j2;
	}

	@Override
	 //Modificaremos el comportamiento del método toString
	
	 public String toString() {
			return "codigo=" + codigo + ", nombre=" + nombre + ", puntos=" + puntos;
		}
	 
	 
	 
}
