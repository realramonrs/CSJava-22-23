package ejercicio04;

import java.time.LocalDate;

public class Solicitud {
	private String codigo;
	private String titulo;
	private LocalDate fecha;
	private Estado estado;
	public Solicitud(String codigo, String titulo) {
		super();
		if(codigo.length()==4) {
			this.codigo  = codigo;
		}
		this.titulo = titulo;
		this.fecha = LocalDate.now();
		this.estado = Estado.Pendiente;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Solicitud [codigo=" + codigo + ", titulo=" + titulo + ", fecha=" + fecha + ", estado=" + estado + "]";
	}
	
	
	

}
