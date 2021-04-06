package arrayObjetos;

import java.io.FileNotFoundException;
import java.util.Calendar;

public class Alumno {

	//Atributos
	
	private String nombre ;
	
	private int curso ;
	
	private int edad ;

	
	//constructor
	
	public Alumno(String nombre, int curso, int edad) {
		this.nombre = nombre;
		this.curso = curso;
		this.edad = edad;
	}

	//getters y setters

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCurso() {
		return curso;
	}


	public void setCurso(int curso) {
		this.curso = curso;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//crear to String 
	
	@Override
	
	public String toString() {
		
		return ("Alumno -> Nombre: " + nombre + ", Curso: " + curso + ", Edad: " + edad ) ;
	}
	
}
