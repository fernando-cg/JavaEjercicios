package examen;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class Huesped extends Hotel {
	//clase abstracta

	//yo he supuesto que minimo va ha haber dos personas en la habitacion en todom momento
	private Date fEntrada ;
	
	private Date fSalida ;
	
	private int nAcompanantes ;
	
	private String origen ;
	
	private boolean seguro ;
	
	private String tViaje ;
	
	private float pvp ;
	
	
	
	
	public Huesped(String nombre, String apellidos, Date fEntrada, Date fSalida, int nAcompanantes, String origen,
			boolean seguro, String tViaje) {
		super(nombre, apellidos);
		this.fEntrada = fEntrada;
		this.fSalida = fSalida;
		this.nAcompanantes = nAcompanantes;
		this.origen = origen;
		this.seguro = seguro;
		this.tViaje = tViaje;
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        cal1.setTime(fEntrada);
        cal2.setTime(fSalida);
        
        int dif = (int) Duration.between(cal1.toInstant() , cal2.toInstant()).toDays();
        
        float pvp = dif * 80 ;
        
        if(nAcompanantes > 0) {
        	pvp = pvp + nAcompanantes * 12 ;
        }
        
        if(seguro == true) {
        	
        	pvp = pvp + ((pvp * 2 )/ 100) ;
        }
        
        if(tViaje.equalsIgnoreCase("negocios")) {
        	pvp = pvp - 15 ;
        }
        else if(tViaje.equalsIgnoreCase("turismo")) {
        	//como la habitacion ya te dice que es doble voy ha suponer que minimo hay dos personas por tanto le sumo un euro
        	pvp = pvp + 1 - (float)(0.5 * nAcompanantes) ;
        }
        
        pvp = pvp + (pvp * 21 /100) ;
        
        this.pvp = pvp ;
	}




	@Override
	public String salida() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		return "Nombre: " + getNombre() + "\n Apellidos: " + getApellidos() + " \n DNI: " + getDni() + "\n Fecha de Entrada: " + formatter.format(fEntrada) + "\n Fecha de Salida: " + formatter.format(fSalida) + "\n Numero de acompañantes: " + nAcompanantes + "\n Origen: " + origen + "\n Seguro: " + seg() + "\n Tipo de viaje: " + tViaje + "\n Precio Total: " + pvp;
	}
	
	private String seg() {
		
		if(seguro==true) {
			
			return "Si" ;
		}
		else {
		
			return "No" ;
			
		}
	}
}
