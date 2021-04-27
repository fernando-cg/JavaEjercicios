package Polimorfismo3_ProductosFrescos;


import java.util.Date;

public abstract class Productos {

	private Date fechaCaducidad;
	private int Numlote;
	private Date fechaEnvasado;
	private String Origen;
	private String nombre;
	private String Code;
	private int idTienda;
	
	public Productos(Date fechaCaducidad, int numlote, Date fechaEnvasado, String origen, String nombre, String code, int idTienda) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		Numlote = numlote;
		this.fechaEnvasado = fechaEnvasado;
		Origen = origen;
		this.nombre = nombre;
		Code = code;
		this.idTienda = idTienda ;
	}
	
	
	


	
	
}
