package polimorf;

public class Moto extends Motor {
	
	private boolean casco ;

	public Moto(double veloMed, double precio, int caballos, boolean casco) {
		super(veloMed, precio, caballos);
		this.casco = casco;
		setId(4) ;
	}
	
	
}
