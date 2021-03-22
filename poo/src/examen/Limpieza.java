package examen;

public class Limpieza extends Empleado {

	private float extraPropina ;
	
	private int extraNumHab ;
	
	
	
	public Limpieza(String nombre, String apellidos, String turno, int edad, int extraHora, int extraNumHab) {
		super(nombre, apellidos, turno, edad, extraHora);
		extraPropina = (float) Math.random() * 30 ;
		this.extraNumHab = extraNumHab;
		
		if (extraNumHab >=4 && extraNumHab<=8) {
			
			setSueldo(getSueldo()+ 6) ;
			
		}
		else if (extraNumHab >=9 && extraNumHab<=15) {
			
			setSueldo(getSueldo()+ 14) ;
			
		}
		else if(extraNumHab >=16){
			
			setSueldo(getSueldo()+ 22) ;
			
		}
	}



	@Override
	public String salida() {
		
		return "Nombre: " + getNombre() + "\n Apellidos: " + getApellidos() + " \n DNI: " + getDni() + "\n Turno: " + getTurno() + "\n Edad: " + getEdad() + "\n Numero de la seguridad social: " + getNumSegSoc() + "\n Horas extras: " + getExtraHora() + "\n Sueldo :" + getSueldo() + "\n Propina Extra" + extraPropina + "\n Cantidad De habitaciones: " + extraNumHab;
	}
}
