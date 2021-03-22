package examen;

public abstract class Hotel {
	
	//clase abstracta

	private String nombre ;
	
	private String apellidos ;
	
	private String dni ;
	
	public abstract String salida() ;

	public Hotel(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		
		int numdni = (int)(Math.random()*(999999999 - 100000000 + 1) + 100000000) ;
		
		char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		int resto = numdni % 23 ;
		
		dni = String.valueOf(numdni) + letras[resto] ;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}
	
	
	
	
}
