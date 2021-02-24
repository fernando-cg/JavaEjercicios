package concesionario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Comparator;

public class coche {

	//atributos

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

		 this.beneficio = this.precioVenta - this.precioCompra ;
	}


	public ArrayList ColoresDisp() {

		return color ;

	}



    public double getPrecioVenta() {
		return precioVenta;
	}

	@Override
	public String toString() {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		return  "Marca: " + marca + ", modelo: " + modelo
				+ ", fecha de matriculacion: " + formatter.format(fechaMat) + ", años: " + annios + ", colores: " + color + ", kms: " + kms
				+ ", precio de venta:" + precioVenta + ", precio de compra: " + precioCompra + ", beneficios: " + beneficio ;
	}


} 