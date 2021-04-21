package polimorf;

public class Camion extends Motor {

	private boolean ruedas ;

	public Camion(double veloMed, double precio, int caballos, boolean ruedas) {
		super(veloMed, precio, caballos);
		this.ruedas = ruedas;
		setId(5) ;
	}
	
	
}
