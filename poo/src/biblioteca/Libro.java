package biblioteca;

public class Libro {
	
	//atributos No defino nprestamos como static porque el contador es respecto al objeto y no respecto a la clase
	
	private String titulo ;
	
	private String autor ;
	
	private int nejemplares ;
	
	private int nprestados ;
	
	//funciones
	
	//constructores
	
	public Libro() {
	}

	public Libro(String titulo, String autor, int nejemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.nejemplares = nejemplares;
		this.nprestados = 0;
	}

	//prestamo
	
	public boolean prestamo() {
		
		boolean retorno = false ;
		
		if(nejemplares > 0) {
			nejemplares-- ;
			nprestados++;
			retorno = true ;
		}
		
		return retorno ;
		
	}
	
	//devoluición
	
	public boolean devolucion() {
		
		boolean retorno = false ;
		
		if(nprestados > 0) {
			nprestados --;
			nejemplares ++ ;
			retorno = true ;
		}
		
		return retorno ;
	}

	//To String 
	
	@Override
	public String toString() {
		return "titulo:" + titulo + "\n" + "autor:" + autor + "\n" + "Numero de ejemplares:" + nejemplares;
	}
	
	
}
