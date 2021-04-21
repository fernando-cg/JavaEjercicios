package polimorf;

public class Vehiculo {
	
	private int id ;
	
	private double veloMed ;
	
	private double precio ;

	public Vehiculo(double veloMed, double precio) {
		super();
		this.veloMed = veloMed;
		this.precio = precio;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
