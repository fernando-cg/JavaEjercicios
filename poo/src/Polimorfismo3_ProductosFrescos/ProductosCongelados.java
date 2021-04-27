package Polimorfismo3_ProductosFrescos;

import java.util.Date;

public class ProductosCongelados extends Productos{

	private Date FecEnvasado;
	private String Origen;
	private float Temperatura;
	
	public ProductosCongelados(Date fechaCaducidad, int numlote, Date fechaEnvasado, String origen, String nombre,
			String code, Date fecEnvasado, String origen2, float temperatura,int idTienda) {
		super(fechaCaducidad, numlote, fechaEnvasado, origen, nombre, code,idTienda);
		FecEnvasado = fecEnvasado;
		Origen = origen2;
		Temperatura = temperatura;
	}
	
	
	
}
