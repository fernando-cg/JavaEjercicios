package nba;

import java.text.SimpleDateFormat;

public class Jugador extends NBA {

	private String posicion ;
	
	private double mediaPuntos ;

	public Jugador(String nombre, String apellido, int dia, int mes, int anio, String posicion, double mediaPuntos) {
		super(nombre, apellido, dia,mes,anio);
		
		this.posicion = posicion ;
		
		this.mediaPuntos = mediaPuntos ;
	}

	public String getPosicion() {
		return posicion;
	}

	public double getMediaPuntos() {
		return mediaPuntos;
	}
	
	public void salida(){
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Nombre: " + getNombre() + ", Apellidos: " + getApellido() + ", fecha de nacimiento: " + dateformat.format(getFechaNac()) + ", Posicion:" + getPosicion() + ", media de puntos por partido: " + getMediaPuntos());
	}

}
