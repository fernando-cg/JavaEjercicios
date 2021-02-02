package Restaurante;

public class Restaurante {

	private int nhuevos ;
	
	private double kchorizo ;

	public Restaurante(int nhuevos, double kchorizo) {
		super();
		this.nhuevos = nhuevos;
		this.kchorizo = kchorizo;
	}
	
	public void addHuevos(int cantidad) {
		
		nhuevos = nhuevos + cantidad ; 
	}
	
	public void addChori(int kilos) {
		
		kchorizo = kchorizo + kilos ;
	}
	
	public int Platos() {
	
		int platos = 0 ;
		
		return platos ;
	}
	
	public void salePlato() {
		
		
	}
	
	public int getHuevos() {
		
		return nhuevos ;
	}
	
	public double gerChori() {
		
		return kchorizo ; 
	}
}
