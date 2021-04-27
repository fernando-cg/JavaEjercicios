package Polimorfismo3_ProductosFrescos;

import java.util.Date;
public class ProductosFrescos extends Productos {

	private Date FecEnvasado;
	private String Origen;
	
	public ProductosFrescos(Date fechaCaducidad, int numlote, Date fechaEnvasado, String origen, String nombre,
			String code, Date fecEnvasado, String origen2,int idTienda) {
		super(fechaCaducidad, numlote, fechaEnvasado, origen, nombre, code,idTienda);
		FecEnvasado = fecEnvasado;
		Origen = origen2;
	}

	
	
	
	
	
	
}
