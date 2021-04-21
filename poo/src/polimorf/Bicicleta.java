package polimorf;

public class Bicicleta extends SinMotor {

	private boolean trasportin ;

	public Bicicleta(double veloMed, double precio, boolean trasportin) {
		super(veloMed, precio);
		this.trasportin = trasportin;
		setId(1) ;
	}
	
}
