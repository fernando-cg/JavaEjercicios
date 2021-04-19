package camping;

public abstract class Persona {

	private String nombre ;
	
	private String dni ;
	
	private int edad ;

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		
		int numdni = (int)(Math.random()*(999999999 - 100000000 + 1) + 100000000) ;
		
		char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		int resto = numdni % 23 ;
		
		dni = String.valueOf(numdni) + letras[resto] ;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}

	public Persona(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
		
}
