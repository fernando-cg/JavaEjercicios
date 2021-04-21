package polimorf;

public class Motor extends Vehiculo {
	private int caballos ;

	public Motor(double veloMed, double precio, int caballos) {
		super(veloMed, precio);
		this.caballos = caballos;
	}
	
}
