package fesac_olimpiadas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Atleta{
	
	private int dorsal ;
	
	private String nombre ;
	
	private String pais ;
	
	private Date tiempo ;

	public Atleta( String nombre, String pais, int horas, int minutos, int segundos) {
		this.dorsal = ((int) (Math.random()*100000));
		this.nombre = nombre;
		this.pais = pais;
		Calendar calendar = Calendar.getInstance() ;
	    calendar.set(Calendar.HOUR, horas);
	    calendar.set(Calendar.MINUTE, minutos);
	    calendar.set(Calendar.SECOND, segundos);
		this.tiempo = calendar.getTime()  ;
	}
	
	
	
	public Date getTiempo() {
		return tiempo;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		
		return "dorsal: " + dorsal + ", nombre: " + nombre + ", pais: " + pais + ", tiempo: " + formatter.format(tiempo) + "\n" ;
	}
	
}
