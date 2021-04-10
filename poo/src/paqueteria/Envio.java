package paqueteria;

import cifrados.* ;

public class Envio {

	private String traking ;
	
	private String dniRemitente ;
	
	private double peso ;
	
	private String prioridad ;
	
	private double precio ;
	private int idsucursal;
	private static int contador = 1;
	
	public Envio(String dniRemitente, double peso ,String prioridad, int idsucursal) {
		aes encrip = new aes() ;
		Sucursal s1 = new Sucursal() ;
		traking = encrip.encrypt(dniRemitente.substring(0,dniRemitente.length()-2),"programacion")+contador ;
		this.peso = peso ;
		this.dniRemitente = dniRemitente ;
		this.prioridad = prioridad ;
		this.idsucursal = idsucursal ;
		contador++ ;
	}

	public double getPeso() {
		return peso;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
