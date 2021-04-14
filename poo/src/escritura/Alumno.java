package escritura;

public class Alumno {

	private String nombre ;
	
	private String apellido1 ;
	
	private String apellido2 ;
	
	private int edad ;
	
	private String ciudad ;

	public Alumno(String nombre, String apellido1, String apellido2, int edad, String ciudad) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ ", ciudad=" + ciudad + "]";
	}
	
	
}
