package coches;

public class Coche {
	
	private String marca ;
	
	private String modelo ;
	
	private int puertas ;
	
	private int caballos ;
	
	private int plazas ;
	
	private double aceleracion ;

	private String motor ;
	
	private String color ;
	
	private double precio = 12000 ;

	//constructor 
	
	public Coche(String marca, String modelo, int puertas, int caballos,int plazas , double aceleracion, String motor,
			String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.puertas = puertas;
		this.caballos = caballos;
		this.aceleracion = aceleracion;
		this.motor = motor;
		this.color = color;
		
		if(puertas <= 3) {
			
			precio = precio * 1.2 ;
		}
		else {
			
			precio = precio * 1.6 ;
		}
		
		if(caballos > 150) {
			
			precio = precio * 1.8 ;
		}
		
		if(plazas == 2) {
			precio = precio +1450 ;
		}
		else if(plazas == 3) {
			
			precio = precio +1672 ;
		}
		else if(plazas >= 5) {
			
			precio = precio +2431 ;
		}
		
		if(motor.equalsIgnoreCase("Diesel")) {
		
			precio = precio * 2.1 ;
		}
		else if(motor.equalsIgnoreCase("ECO")) {
			
			precio = precio * 1.2 ;
		}
		else if(motor.equalsIgnoreCase("Gasolina")) {
		
			precio = precio * 1.9 ;
		}
		
		if(color.equalsIgnoreCase("Rojo")) {
			
			precio = precio +600 ;
		}
		else if(color.equalsIgnoreCase("Negro")){
			
			precio = precio +580 ;
		}
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", puertas=" + puertas + ", caballos=" + caballos
				+ ", plazas=" + plazas + ", aceleracion=" + aceleracion + ", motor=" + motor + ", color=" + color
				+ ", precio=" + precio + "]";
	}
	
	
	
	
	
}
