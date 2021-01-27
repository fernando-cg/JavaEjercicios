package prueba01;

public class Coche {

	//Atributos
	
	private String color ;
	private int puertas ;
	private String marca ;
	private String modelo ;
	private int velocidad ;
	
	//metosdos
	
	public String imprimir() {
		
		return "color: " + color + ", Puerta: " + puertas + ", Marca: " + marca + " ,Modelo: " + modelo;
	}
	public String arrancar() {
		
		return "Estoy avanzando" ;
	}
	
	//getter
	
	 public String getColor() {
	        
		 return color ;
	   }
	 
	 public int getPuertas() {
	        
		 return puertas ;
	   }
	 
	 public String getMarca() {
	        
		 return marca ;
	   }
	 
	 public String getModelo() {
	        
		 return modelo ;
	   }
	 
	 public int getVelocidad() {
	        
		 return velocidad ;
	   }
	 
	 //setter

	  public void setColor(String parametroColor) {
	        
		  this.color = parametroColor;        
	    }
	  
	  public void setPuerta(int parametroPuerta) {
	        
		  this.puertas = parametroPuerta;        
	    }
	  
	  public void setMarca(String parametroMarca) {
	        
		  this.marca = parametroMarca;        
	    }
	  
	  public void setModelo(String parametroModelo) {
	        
		  this.modelo = parametroModelo;        
	    }
	  
	  public void setVelocidad(int velocidad) {
	        
		  this.velocidad = velocidad;        
	    }

}
