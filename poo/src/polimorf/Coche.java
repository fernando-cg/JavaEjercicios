package polimorf;

public class Coche extends Motor {

	private boolean puertas ;

	public Coche(double veloMed, double precio, int caballos, boolean puertas) {
		super(veloMed, precio, caballos);
		this.puertas = puertas;
		setId(3) ;
	}
	
}
