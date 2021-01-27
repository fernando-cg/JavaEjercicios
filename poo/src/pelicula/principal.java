package pelicula;

public class principal {

	public static void main(String[] args) {

		Pelicula p1 = new Pelicula() ;
		
		p1.setNombre("PEPE");
		p1.setDirector("juan");
		p1.setDuracion(24);
		p1.setGenero("Terror");
		
		System.out.println(p1.getNombre());
		System.out.println(p1.toString());
	}

}
