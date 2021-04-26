package camping;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Cliente extends Persona {

	private int id ;
	
	private static int idnext = 1000 ;
	
	private boolean socioclub ;
	
	private int acompaniantes ;
	
	private Date fechaEntrada ;
	
	private Date fechaSalida ;
	
	private String tipoHuesped ;
	
	private int LongitudVehiculo ;
	
	private double precio ;
	
	

	public Cliente(String nombre, String dni, int edad, int id, boolean socioclub, int acompaniantes, Date fechaEntrada,
			Date fechaSalida, String tipoHuesped, int longitudVehiculo, double precio) {
		super(nombre, dni, edad);
		this.id = id;
		this.socioclub = socioclub;
		this.acompaniantes = acompaniantes;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.tipoHuesped = tipoHuesped;
		LongitudVehiculo = longitudVehiculo;
		this.precio = precio;
		idnext = id;
		idnext ++ ;
	}

	@SuppressWarnings("deprecation")
	public Cliente(String nombre, int edad, boolean socioclub, int acompaniantes, Date fechaEntrada, Date fechaSalida,
			String tipoHuesped,int longitudVehiculo) {
		super(nombre, edad);
		this.socioclub = socioclub;
		this.acompaniantes = acompaniantes;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.tipoHuesped = tipoHuesped ;
		LongitudVehiculo = longitudVehiculo;
		id = idnext ;
		idnext++ ;
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        cal1.set(fechaEntrada.getYear(),fechaEntrada.getMonth(),fechaEntrada.getDay()) ;
        cal2.set(fechaSalida.getYear(), fechaSalida.getMonth(),fechaSalida.getDay());
        int dias = (int) Duration.between(cal1.toInstant(), cal2.toInstant()).toDays();
		double precio = 0 ;
		
		if(tipoHuesped.equalsIgnoreCase("caravana")){
			precio = 19 ;
			if(LongitudVehiculo > 6) {
				precio += 1.90 ;
			}
			
			precio *= dias ;
			
		}
		else if(tipoHuesped.equalsIgnoreCase("autocaravana")) {
			precio = 21.95 ;
			if(LongitudVehiculo > 8) {
				precio += 3 ;
			}
			
			precio *= dias ;
		}
		else if(tipoHuesped.equalsIgnoreCase("tienda")) {
			precio = 11 ;
			
			precio *= dias ;
		}
		
		if(acompaniantes>3) {
			precio += acompaniantes * dias ;
		}
		
		if(socioclub == true) {
			precio -= (precio * 0.09) ;
		}
		
		this.precio = precio ;
	}

	public int getId() {
		return id;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getTipoHuesped() {
		return tipoHuesped;
	}

	@Override
	public String toString() {
		return  getNombre() + "\t" + getDni() + "\t" + getEdad() + "\t" + id + "\t" + socioclub + "\t" + acompaniantes + "\t" + fechaEntrada + "\t" + fechaSalida + "\t" + tipoHuesped + "\t" + LongitudVehiculo + "\t" + precio + "\n";
	}
	
	
}
