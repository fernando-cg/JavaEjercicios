package ejrep3;

import java.util.Arrays;

public class Disco {
	
	private String nombre_grupo ;
	
	private String titulo ;
	
	private Cacion[] canciones ;
	
	private int numero_canciones ;

	public Disco(String nombre_grupo, String titulo) {
		super();
		this.nombre_grupo = nombre_grupo;
		this.titulo = titulo;
		
		canciones = new Cacion[5] ;
		
		numero_canciones = 0 ;
		
		Main p = new Main() ;
		
		p.setNum_discos();
	}
	
	public int duracion_total() {
		int retorno = 0 ;
		
		return retorno ;
	}
	
	public boolean insertar_cancion(Cacion c) {
		
		boolean retorno = false ;
		
		return retorno ;
	}
	
	public boolean eliminar_cancion(String titulo_cancion) {
		
		boolean retorno = false ;
		
		return retorno ;
		
	}

	@Override
	public String toString() {
		return "nombre del grupo: " + nombre_grupo + "/ntitulo: " + titulo + "\ncanciones ->"
				+ Arrays.toString(canciones) + "\n numero de canciones: " + numero_canciones + "\nduracion total horas: "
				+ (duracion_total()/60)+ "\nduracion total minutos: "+ duracion_total() + "\nduracion total segundos: " + (duracion_total() * 60);
	}
	
	
	
	
}
