package ej1P;

public class Paciente {

	private String dni ;
	
	private String nombre ;
	
	private String especialidad ;
	
	private int id ;
	
	private static int idnext=1 ;

	public Paciente(String dni, String nombre, String especialidad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.especialidad = especialidad;
		id = idnext ;
		idnext++ ;
	}
	
	

	public String getEspecialidad() {
		return especialidad;
	}



	@Override
	public String toString() {
		return "Paciente numero:" + id + "\t1DNI: " + dni + "\tNombre: " + nombre + "/t Especialidad solicitada : " + especialidad ;
	}
	
	
}
