package paqueteria;

import javax.swing.JOptionPane;

public class Main {
	
	public static boolean comprobar(String dni) {
		
		int total=dni.length() ;
		int dninumero ;
		char letra[] ;
		if(total == 9) {
			
			try {
				dninumero = Integer.parseInt(dni.substring(0, dni.length()-2)) ;
			}catch(NumberFormatException e) {
				return true ;
			}
			
			letra = dni.substring(8).toUpperCase().toCharArray() ;
			
			char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
			for(int x = 0 ; x< letras.length ; x++) {
				if(letras[x]==letra[0]) {
					
					return false ;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Sucursal[] sucursales = new Sucursal[30] ;
		
		JOptionPane.showMessageDialog(null, "Bienvenido a la empresa de correos del Betis", "Betis Envios",JOptionPane.INFORMATION_MESSAGE);
		
		String opciones[] = {"Crear sucursal","Crear envio","Consultar sucursal","Consultar envio","Salir"} ;
		
		//JOptionPane.showInputDialog(null, "Betis Envios", "Seleccione una opcción",JOptionPane.INFORMATION_MESSAGE,null, opciones,opciones[4]) ;
		
		do {
			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Betis Envios",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, opciones,opciones[4]) ;
			
			switch (opcion) {
			
			case 0:
				
					String direccion = JOptionPane.showInputDialog(null,"introduzca la dirección de la sucursal");
					String poblacion = JOptionPane.showInputDialog(null,"introduzca la población de la sucursal");
					int id= (Integer) null ;
					
					for(int x = 0;x < sucursales.length ;x++) {
						if(sucursales[x]==null) {
							id = x-1 ;
							break ;
						}
					
					}
					
					try {
						
						sucursales[id] =( new Sucursal(direccion,poblacion)) ;
						
					}catch(IndexOutOfBoundsException e) {
						
						System.out.println("No se puede añadir mas sucursales");
						
					}
					
				break;
			case 1:
				boolean peso1=true ;
				String dni ;
				do {
					 dni = JOptionPane.showInputDialog(null,"Introduzca el dni completo con letra mayuscula");
					 if(comprobar(dni)) {
							JOptionPane.showMessageDialog(null, "Has introducido un formato de dni incorrecto", "Betis Envios",JOptionPane.INFORMATION_MESSAGE);
					 }
				}while(comprobar(dni)) ;
				
				do {
					try {
						double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"introduzca la población de la sucursal"));
						peso1 = false ;
					}catch(NumberFormatException e) {
						peso1 =true ;
						JOptionPane.showMessageDialog(null, "Has introducido un formato de peso no valido", "Betis Envios",JOptionPane.INFORMATION_MESSAGE);
					}
				}while(peso1) ;
				String opciones2[]= {"express","alto","normal"} ;
				
				String tipoe = (String)JOptionPane.showInputDialog (null, "Betis Envios", "Seleccione una tipo de envio",JOptionPane.INFORMATION_MESSAGE,null, opciones2,opciones2[0]) ;
				
				String[] salida = new String[sucursales.length];
				int id2 = (Integer) null ;
				for(int x = 0;x < sucursales.length ;x++) {
					if(sucursales[x]==null) {
						id2 = x-1 ;
						break ;
					}
				
				}
				
					for(int x = 0 ; x < id2 ; x++) {
					
							String salida2 = (x+1)+ "->" + sucursales[x].getLocalidad()+ ", calle: " + sucursales[x].getCalle() ;
							
							salida[x] = salida2 ;
					}
					
				int idof =(int)JOptionPane.showInputDialog (null, "Betis Envios", "Seleccione una Sucursal",JOptionPane.INFORMATION_MESSAGE,null,salida,salida[0]);
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				System.exit(0);
				
				break;
			}
		}while(true) ;
	}

}
