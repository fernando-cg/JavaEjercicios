package polimorf;

public class Patinete extends SinMotor{

	private boolean pantalla ;

	public Patinete(double veloMed, double precio, boolean pantalla) {
		super(veloMed, precio);
		this.pantalla = pantalla;
		setId(2) ;
	}
	
	
}
