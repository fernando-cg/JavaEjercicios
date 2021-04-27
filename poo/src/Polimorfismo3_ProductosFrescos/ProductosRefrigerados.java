package Polimorfismo3_ProductosFrescos;

import java.util.Date;

public class ProductosRefrigerados extends Productos{
	
	private int Codigo;
	private Date FecEnvasado;
	private String Origen;
	private float Temperatura;
	
	
	public ProductosRefrigerados(Date fechaCaducidad, int numlote, Date fechaEnvasado, String origen, String nombre,
			String code, int codigo, Date fecEnvasado, String origen2, float temperatura,int idTienda) {
		super(fechaCaducidad, numlote, fechaEnvasado, origen, nombre, code,idTienda);
		Codigo = codigo;
		FecEnvasado = fecEnvasado;
		Origen = origen2;
		Temperatura = temperatura;
	}
	

	
	
}
