package Polimorfismo3_ProductosFrescos;

public abstract class Persona {
	private String nombre ;
	
	private int edad ;
	
	private int idTienda ;
	
	private int id ;
	
	
	private static int idnext = 1 ;
	

	public Persona(String nombre, int edad, int idTienda) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.idTienda = idTienda;
		id = idnext ;
		idnext++ ;
	}

	public String getNombre() {
		return nombre;
	}
	

	public int getIdTienda() {
		return idTienda;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nEdad: " + edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
