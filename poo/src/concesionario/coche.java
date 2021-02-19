package concesionario;

import java.util.ArrayList;
import java.util.Date;

public class coche {
	
	//atributos
	
	Date fecha = new Date() ;
	
	ArrayList<String> colores = new ArrayList();
	
	private String marca ;
	
	private String modelo ;
	
	private Date fechaMat ;
	
	private int annios ;
	
	private ArrayList color ;
	
	private int kms ;
	
	private double precioVenta ;
	
	private double precioCompra ;
	
	private double beneficio ;

	
	//metodos

	public coche(String marca, String modelo, Date fechaMat, ArrayList color, int kms, double precioVenta,
			double precioCompra) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.fechaMat = fechaMat;
		this.color = color;
		this.kms = kms;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
		annios = ;
	}
	
	public double beneficio() {
		
		double beneficio = precioVenta - precioCompra ;
		return beneficio ;
	}
	
	public void ColoresDisp(String marca) {
		
		if(marca == this.marca) {
			
		}
	}
	
	
}
