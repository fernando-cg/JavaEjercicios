package ejercicioHerencias1;

public class Futbolista extends Persona {
	
	private int dorsal ;
	
	private String demarcacion ;

	public Futbolista(String nombre, String apellido1, String apellido2, int edad, int dorsal, String demarcacion) {
		super(nombre, apellido1, apellido2, edad);
		
		this.dorsal = dorsal ;
		
		this.demarcacion = demarcacion ;
	}

	public int getDorsal() {
		return dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}
	
	public void salida() {
		System.out.println("nombre: " + getNombre() + "apellido1: " + getApellido1() + "apellido2: " + getApellido2() + "edad: " + getEdad());
	}

}
