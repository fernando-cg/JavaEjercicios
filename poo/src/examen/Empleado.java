package examen;

public abstract class Empleado extends Hotel{
//crear metodo añadir hora extra tambien añadir eliminar empleado y modificar empleado;
	private long numSegSoc ;
	
	private String turno ;
	
	private int edad ;
	
	private int extraHora ;
	
	private float sueldo ;
	
	
	
	public Empleado(String nombre, String apellidos, String turno, int edad, int extraHora) {
		super(nombre, apellidos);
		this.turno = turno;
		this.edad = edad;
		this.extraHora = extraHora;
		float sueldo = 928 ;
		
		if(turno.equalsIgnoreCase("tarde")) {
			sueldo = sueldo + ((sueldo*10)/100) ;
		}
		else if(turno.equalsIgnoreCase("noche")) {
			
			sueldo = sueldo + ((sueldo*16)/100) ;	
			
		}
		
		if(edad>45) {
			sueldo = sueldo + 80 ;
		}
		
	    numSegSoc = 100000000000L + (long) (Math.random() * (999999999999L - 100000000000L + 1)) ;
		
		if(extraHora > 0) {
			
			sueldo = sueldo + 10 * extraHora ;
		}
		
		this.sueldo = sueldo ;
	}

	

	public float getSueldo() {
		return sueldo;
	}



	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	


	public long getNumSegSoc() {
		return numSegSoc;
	}



	public String getTurno() {
		return turno;
	}



	public int getEdad() {
		return edad;
	}



	public int getExtraHora() {
		return extraHora;
	}



	@Override
	public abstract String salida() ;
}
