package ejercicioHerencias1;

public class Persona {
	
	private String nombre ;
	
	private String apellido1 ;
	
	private String apellido2 ;
	
	private int edad ;

	public Persona(String nombre, String apellido1, String apellido2, int edad) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public int getEdad() {
		return edad;
	}
	
	public void salida() {
		System.out.println("nombre: " + getNombre() + "apellido1: " + getApellido1() + "apellido2: " + getApellido2() + "edad: " + getEdad());
	}
}
