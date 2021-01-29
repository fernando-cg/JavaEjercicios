package equipo;

public class Jugador {

	//Atributos
	
	private String equipo ;
	
	private String demarcacion ;
	
	private int altura ;
	
	private int peso ;
	
	private String nombre ;
	
	private int dorsal ;
	
	private double sueldo = 1000000;

	//constructor
	
	public Jugador(String equipo, String demarcacion, int altura, int peso, String nombre, int dorsal) {
		this.equipo = equipo;
		this.demarcacion = demarcacion;
		this.altura = altura;
		this.peso = peso;
		this.nombre = nombre;
		this.dorsal = dorsal;
		
		if(equipo.equalsIgnoreCase("Atletico De Madrid") ||equipo.equalsIgnoreCase("Real Madrid") || equipo.equalsIgnoreCase("Sevilla") || equipo.equalsIgnoreCase("Barcelona") ) {
			
			sueldo = sueldo * 4 ;
		}
		else if(equipo.equalsIgnoreCase("Betis") || equipo.equalsIgnoreCase("Celta")) {
			
			sueldo = sueldo * 2.5;
		}
	}

	
	//metodos 
	
	@Override
	public String toString() {
		return "Jugador [equipo=" + equipo + ", demarcacion=" + demarcacion + ", altura=" + altura + ", peso=" + peso
				+ ", nombre=" + nombre + ", dorsal=" + dorsal + ", sueldo=" + sueldo + "]";
	}
	
	
	
}
