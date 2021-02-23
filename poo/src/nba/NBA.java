package nba;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NBA {

	private String nombre ;
	
	private String apellido ;
	
	private Date fechaNac ;

	public NBA(String nombre, String apellido, int dia,int mes , int anio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido ;
		
		Calendar calendario = Calendar.getInstance() ;
		
		calendario.set(anio, mes, dia);
		
		this.fechaNac = calendario.getTime();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Date getFechaNac() {
		return fechaNac;
	}
	
	public void salida(){
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.println("Nombre: " + getNombre() + ", Apellidos: " + getApellido() + ", fecha de nacimiento: " + dateformat.format(getFechaNac()));
	}
}
