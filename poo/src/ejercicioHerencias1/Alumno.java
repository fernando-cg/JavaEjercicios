package ejercicioHerencias1;

public class Alumno extends Persona {

	private int codigo ;
	
	private int curso ;

	public Alumno(String nombre, String apellido1, String apellido2, int edad, int codigo, int curso) {
		super(nombre, apellido1, apellido2, edad);

		this.codigo = codigo ;
		
		this.curso = curso ;
	}
	
	
}
