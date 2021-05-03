package repaso;

public class Coche {

	//atributos
	
	private String matricula ;
	private String marca ;
	private String modelo ;
	private String color ;
	private int km ;
	
	public Coche(String matricula, String marca, String modelo, String color, int km) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.km = km;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public int getKm() {
		return km;
	}
	
	
	
	
}
