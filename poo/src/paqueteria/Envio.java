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

	public double getPrecio() {
		return precio;
	}
	
	public String getTraking() {
		return traking;
	}
	
	
	
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public Envio[] ordenarArray(Envio[] a,int id){
		
	    for (int x = 0; x < id; x++) {
	        for (int i = 0; i < id; i++) {
	            if((!a[x].getPrioridad().equalsIgnoreCase("normal")) && a[i].getPrioridad().equalsIgnoreCase("normal")&& (!a[x].getPrioridad().equalsIgnoreCase(a[i].getPrioridad()))){
	                Envio tmp = a[x];
	                a[x] = a[i];
	                a[i] = tmp;
	            }
	            if((!a[x].getPrioridad().equalsIgnoreCase("alto")) && a[i].getPrioridad().equalsIgnoreCase("alto")&& (!a[x].getPrioridad().equalsIgnoreCase(a[i].getPrioridad())) && (!a[x].getPrioridad().equalsIgnoreCase("normal"))){
	                Envio tmp = a[x];
	                a[x] = a[i];
	                a[i] = tmp;
	            }
	            if((!a[x].getPrioridad().equalsIgnoreCase("express")) && a[i].getPrioridad().equalsIgnoreCase("express")&& (!a[x].getPrioridad().equalsIgnoreCase(a[i].getPrioridad())) && (!a[x].getPrioridad().equalsIgnoreCase("normal")) && (!a[x].getPrioridad().equalsIgnoreCase("alto"))){
	                Envio tmp = a[x];
	                a[x] = a[i];
	                a[i] = tmp;
	            }
	        }
	    }
	    
		return a;
		
	}
	
}
