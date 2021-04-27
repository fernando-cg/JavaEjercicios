package Polimorfismo3_ProductosFrescos;

public class Tienda {

	private String Tienda;
	private String Direccion;
	private int Id;
	private static int idNext=1;
	
	public Tienda(String tienda, String direccion) {
		super();
		Tienda = tienda;
		Direccion = direccion;
		Id = idNext;
		idNext++;
	}

	public String getTienda() {
		return Tienda;
	}

	public String getDireccion() {
		return Direccion;
	}

	public int getId() {
		return Id;
	}
	
	
	
}
