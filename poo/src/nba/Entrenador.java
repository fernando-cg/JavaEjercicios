package nba;

import java.text.SimpleDateFormat;

public class Entrenador extends NBA {

	private double porcVictorias ;
	
	private String universidad ;

	public Entrenador(String nombre, String apellido, int dia, int mes, int anio, double porcVictorias, String universidad) {
		super(nombre, apellido,  dia,  mes,  anio);
		
		this.porcVictorias = porcVictorias ;
		
		this.universidad = universidad ;
	}

	public double getPorcVictorias() {
		return porcVictorias;
	}

	public String getUniversidad() {
		return universidad;
	}
	
	public void salida(){
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Nombre: " + getNombre() + ", Apellidos: " + getApellido() + ", fecha de nacimiento: " + dateformat.format(getFechaNac()) + ", Porcentaje de victorias:" + getPorcVictorias() + ", Universida: " + getUniversidad());
	}

	
}
