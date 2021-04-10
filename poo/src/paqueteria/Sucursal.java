package paqueteria;

public class Sucursal {
	
	private int id ;
	
	private String calle ;
	
	private String localidad ;
	
	private static int idnext = 1 ;

	public Sucursal(String calle, String localidad) {
		this.calle = calle ;
		this .localidad = localidad ;
		id = idnext ;
		idnext ++ ;
		
	}
	
	public Sucursal() {
		
	}
	
	public double calcularPrecio(Envio o){
		double precio ;
		if(o.getPrioridad().equals("express")) {
			 precio = 7.90 * (int)o.getPeso() ;
		}
		else if(o.getPrioridad().equals("alto")) {
			precio = 4.50 * (int)o.getPeso() ;
		}
		else {
			precio = 2.50 * (int)o.getPeso() ;
		}
			o.setPrecio(precio);
		return precio ;
	}

	public String getLocalidad() {
		return localidad;
	}

	public int getId() {
		return id;
	}

	public String getCalle() {
		return calle;
	}
	
	
}
