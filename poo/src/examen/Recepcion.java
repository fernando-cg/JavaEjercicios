package examen;

public class Recepcion extends Empleado {

	
	private int extraAtencion ;
	
	
	public Recepcion(String nombre, String apellidos, String turno, int edad, int extraHora, int extraAtencion) {
		super(nombre, apellidos, turno, edad, extraHora);
		this.extraAtencion = extraAtencion;
		
		if(extraAtencion > 0) {
			
			setSueldo((float) (getSueldo() + (getSueldo()*(extraAtencion * 1.5))/100)) ;
		}
	}


	@Override
	public String salida() {
		
		return "Nombre: " + getNombre() + "\n Apellidos: " + getApellidos() + " \n DNI: " + getDni() + "\n Turno: " + getTurno() + "\n Edad: " + getEdad() + "\n Numero de la seguridad social: " + getNumSegSoc() + "\n Horas extras: " + getExtraHora() + "\n Sueldo :" + getSueldo() + "\n Extra por atención: " + extraAtencion ;
	}
}
