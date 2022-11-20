package ejercicio11;

import java.time.LocalDate;

public class Tarea {

	private String titulo;
	private String descripcion;
	private boolean importante;
	private boolean realizada;
	private LocalDate fechaLimite;
	
	//Constructores
	
	public Tarea(){
		
	}
	
	public Tarea(String titulo,String descripcion,boolean importante,LocalDate limite){
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.importante = importante;
		this.fechaLimite = limite;
	}

	//Métodos de acceso
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isImportante() {
		return importante;
	}

	public void setImportante(boolean importante) {
		this.importante = importante;
	}

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(LocalDate fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	
	@Override
	
	public String toString(){
		return titulo + "\n" + "  \"" + descripcion + "\"" + "\n" + "Importante: " + this.importante + "\n" + "Realizada: " + this.realizada + "\n" 
				+ "Fecha limite " + this.fechaLimite.toString();
	}
}
