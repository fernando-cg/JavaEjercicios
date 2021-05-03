package ejrep3;

public class Cacion {

	private String titulo ;
	
	private int duracion ;

	public Cacion(String titulo, int duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
	}
	
	public String toMinutos(int segundos) {
		
		String retorno = null ;
		
		return retorno ;
	}
	
	public void toSegundos(int segundos, int minutos) {
		
		String retorno = null ;
		
		
	}

	@Override
	public String toString() {
		
		return "titulo: " + this.titulo + "/nDuracion: " + this.duracion ;
		
	}
	
	
}
