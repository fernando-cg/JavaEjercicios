package concesionario;

import java.util.ArrayList;
import java.util.Calendar;
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

	public coche(String marca, String modelo, ArrayList<String> colores, int kms, double precioVenta,
			double precioCompra, int dia, int mes, int anio) {
		this.marca = marca;
		this.modelo = modelo;
		Calendar calendario = Calendar.getInstance() ;
		calendario.set(anio, mes, dia);
		this.fechaMat = calendario.getTime() ;
		this.color = colores;
		this.kms = kms;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
		Calendar calendario2 = Calendar.getInstance() ;
		
		
		this.annios = (int) ((((((calendario2.getTimeInMillis() - calendario.getTimeInMillis())/1000)/60)/60)/24)/365) ;
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
