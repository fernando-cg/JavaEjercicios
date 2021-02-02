package montadito;

public class Montadito {
	
	private String nombre ;
	
	private int numpedido ;
	
	private int nummontadito ;
	
	private String lugarconsumicion ;
	
	private int precio = 2 ;
	
	private int preciot ;
	
	//metodos 

	public Montadito(String nombre, int numpedido, int nummontadito, String lugarconsumicion) {
		super();
		this.nombre = nombre;
		this.numpedido = numpedido;
		this.nummontadito = nummontadito;
		this.lugarconsumicion = lugarconsumicion;
		
		if(lugarconsumicion.equalsIgnoreCase("mesa")){
			
			precio ++ ;
		}
		
		preciot = precio * nummontadito ;
	}

	@Override
	public String toString() {
		return "Montadito [nombre=" + nombre + ", numpedido=" + numpedido + ", nummontadito=" + nummontadito
				+ ", lugarconsumicion=" + lugarconsumicion + ", precio=" + precio + ", preciot=" + preciot + "]";
	}
	
	
	
}
