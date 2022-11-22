package clases;

public class Libro extends Ocio {

	private String isbn;
	private String autor;
	public Libro(String isbn, String titulo, double precio,String autor) {
		super(titulo, precio);
		this.isbn = isbn;
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return super.toString() + " Libro [isbn=" + isbn + ", autor=" + autor + "]";
	}
	
	

}
