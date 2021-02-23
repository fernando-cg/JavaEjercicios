package ejercicioHerencias1;

public class Trabajador extends Persona{

	private int id ;
	
	private String departamento ;

	public Trabajador(String nombre, String apellido1, String apellido2, int edad, int id, String departamento) {
		super(nombre, apellido1, apellido2, edad);
		
		this.id = id ;
		
		this.departamento = departamento ;
	}

	public int getId() {
		return id;
	}

	public String getDepartamento() {
		return departamento;
	}
}
