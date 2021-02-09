package Libreria;

public class Libro {
	
	private String titulo ;
	private int isbn ;
	private String autor ;
	private int npaginas ;
	private String seccion ;
	private int id = 0 ;
	private static int nextid = 1 ;
	public Libro(String titulo, int isbn, String autor, int npaginas) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.npaginas = npaginas;
		
		id = nextid ;
		nextid ++ ;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", npaginas=" + npaginas
				+ ", seccion=" + seccion + ", id=" + id + "]";
	}
	
	

	
}
