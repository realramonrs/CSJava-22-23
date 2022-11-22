package clases;

public abstract class Ocio implements Mutable {

	
	private String titulo;
	private double precio;
	private double valoracion;
	
	public Ocio( String titulo, double precio) {
			
	
		this.titulo = titulo;
		this.precio = precio;
		valoracion = 0;
		
	}	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ocio [titulo=" + titulo + ", precio=" + precio + "]";
	}

	@Override
	public void aumentar(int x) {
		// TODO Auto-generated method stub
		this.valoracion+=x;
	}

	@Override
	public void disminuir(int x) {
		// TODO Auto-generated method stub
		if(this.valoracion - x >=0)
		this.valoracion-=x;
	}
	
	
	
	
	
	
}
