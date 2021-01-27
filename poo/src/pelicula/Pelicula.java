package pelicula;

public class Pelicula {

	private String nombre ;
	private String director ;
	private int anio ;
	private String genero ;
	private int duracion ;
	
	
	//metodos
	
	
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", director=" + director + ", año=" + anio + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
		
		//getters y setters 
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}
