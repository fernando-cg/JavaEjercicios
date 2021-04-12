package paqueteria;

import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
	//del menu he fusionado la opcion de buscar y ordenar por id con la de mostrar todas las oficinas porque ya desde que se crean se ordenan por id.
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
			
			letra = dni.substring(8).toCharArray() ;
			
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
		
		Envio[] envios = new Envio[30] ;
		
		sucursales[0] =( new Sucursal("Calle rosa del corasao","Sevilla")) ;
		sucursales[1] =( new Sucursal("Calle Mario Benito","Cadiz")) ;
		sucursales[2] =( new Sucursal("Calle Benito Villamarín","Malaga")) ;
		envios[0] =( new Envio("12345678A",20.4,"express",1)) ;
		envios[1] =( new Envio("11445678B",13.4,"normal",2)) ;
		envios[2] =( new Envio("11145888C",22.4,"normal",2)) ;
		envios[3] =( new Envio("12575678V",26.4,"alto",1)) ;
		envios[4] =( new Envio("16295678P",50.4,"express",1)) ;
		envios[5] =( new Envio("12399678S",40.4,"alto",1)) ;
		
		JOptionPane.showMessageDialog(null, "Bienvenido a la empresa de correos del Betis", "Betis Envios",JOptionPane.INFORMATION_MESSAGE);
		
		String opciones[] = {"Crear sucursal","Crear envio","Consultar sucursal","Consultar envios","Consultar envios por traking","Salir"} ;
		
		//JOptionPane.showInputDialog(null, "Betis Envios", "Seleccione una opcción",JOptionPane.INFORMATION_MESSAGE,null, opciones,opciones[4]) ;
		
		do {
			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Betis Envios",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, opciones,opciones[5]) ;
			
			switch (opcion) {
			
			case 0:
				
					String direccion = JOptionPane.showInputDialog(null,"introduzca la dirección de la sucursal");
					String poblacion = JOptionPane.showInputDialog(null,"introduzca la población de la sucursal");
					int id=-1 ;
					
					for(int x = 0;x < sucursales.length ;x++) {
						if(sucursales[x]==null) {
							id = x ;
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
				double peso = -1 ;
				do {
					try {
						 peso = Double.parseDouble(JOptionPane.showInputDialog(null,"introduzca el peso del paquete"));
						peso1 = false ;
					}catch(NumberFormatException e) {
						peso1 =true ;
						JOptionPane.showMessageDialog(null, "Has introducido un formato de peso no valido", "Betis Envios",JOptionPane.INFORMATION_MESSAGE);
					}
				}while(peso1) ;
				String opciones2[]= {"express","alto","normal"} ;
				
				String tipoe = (String)JOptionPane.showInputDialog (null, "Betis Envios", "Seleccione una tipo de envio",JOptionPane.INFORMATION_MESSAGE,null, opciones2,opciones2[0]) ;
				
				
				int id2 = -1 ;
				for(int x = 0;x < sucursales.length ;x++) {
					if(sucursales[x]==null) {
						id2 = x ;
						break ;
					}
				
				}
				String[] salida = new String[id2];
				
					for(int x = 0 ; x < id2 ; x++) {
					
							String salida2 = (x+1)+ "->" + sucursales[x].getLocalidad()+ ", calle: " + sucursales[x].getCalle() ;
							
							salida[x] = salida2 ;
					}
					
					JPanel panel = new JPanel(new GridBagLayout());
					JComboBox box = new JComboBox(salida);
					
					JOptionPane.showMessageDialog(null, box, "Seleccione una oficina:",JOptionPane.QUESTION_MESSAGE);
					
					int idof = box.getSelectedIndex() ;
				
				int ide = -1 ;
				
				for(int x = 0;x < envios.length ;x++) {
					if(envios[x]==null) {
						ide = x ;
						break ;
					}
				
				}

				envios[ide] = ( new Envio(dni,peso,tipoe ,idof)) ;
				
				sucursales[0].calcularPrecio(envios[ide]) ;
				
				JOptionPane.showMessageDialog(null, "El precio del envio es de ->" + envios[ide].getPrecio() + "\n El numero de tracking es: " + envios[ide].getTraking());
				
				break;
			case 2:
				String[] salida1 = new String[30];
				
				int id1=-1 ;
				
				for(int x = 0;x < sucursales.length ;x++) {
					if(sucursales[x]==null) {
						id1 = x ;
						break ;
					}
				
				}
				
				for(int x = 0 ; x < id1 ; x++) {
					
					String salida2 = (x+1)+ "->" + sucursales[x].getLocalidad()+ ", calle: " + sucursales[x].getCalle() ;
					
					salida1[x] = salida2 ;
					
			}
				
				JPanel panel1 = new JPanel(new GridBagLayout());
				JComboBox box1 = new JComboBox(salida1);
				
				
				JOptionPane.showMessageDialog(null, box1, "Seleccione una oficina:",JOptionPane.QUESTION_MESSAGE);
				
				int idof2 = box1.getSelectedIndex() ;
				
				JOptionPane.showInternalMessageDialog(null, "ID: " + sucursales[idof2].getId() + " \nLocalidad: " + sucursales[idof2].getLocalidad() + " \nCalle: " + sucursales[idof2].getCalle());
				
				break;
			case 3:
				
				int id3=-1 ;
				
				for(int x = 0;x < envios.length ;x++) {
					if(envios[x]==null) {
						id3 = x ;
						break ;
					}
				
				}
				
				envios = envios[0].ordenarArray(envios,id3) ;
				
				String[] salida3 = new String[id3];
				for(int x = 0 ; x < id3 ; x++) {
					
					String salida2 = (x+1)+ "->" + envios[x].getTraking() + "tipo de envio ->" + envios[x].getPrioridad() ;
					
					salida3[x] = salida2 ;
				
			}
				
				JPanel panel2 = new JPanel(new GridBagLayout());
				JComboBox box2 = new JComboBox(salida3);
				
				
				JOptionPane.showMessageDialog(null, box2, "Seleccione un envio:",JOptionPane.QUESTION_MESSAGE);
				
				int idped = box2.getSelectedIndex() ;
				
				JOptionPane.showMessageDialog(null, "Traking: " + envios[idped].getTraking() + " \nPrecio: " + envios[idped].getPrecio() + " \nPrioridad : " + envios[idped].getPrioridad() + " \nPeso : " + envios[idped].getPeso());
				
				break;
				
			case 4:
				
				 String track = JOptionPane.showInputDialog(null,"Introduzca el track del pedido");
				 
					int id4=-1 ;
					
					for(int x = 0;x < envios.length ;x++) {
						if(envios[x]==null) {
							id4 = x ;
							break ;
						}
					
					}
					
					int trak = -1 ;
					
					for(int x = 0 ; x < id4 ;x++) {
						if(envios[x].getTraking().equalsIgnoreCase(track)) {
							trak = x ;
							break ;
						}
					}
					try {
						JOptionPane.showMessageDialog(null, "Prioridad del envio: "+ envios[trak].getPrioridad() + "\n precio del envio: " + envios[trak].getPrecio() +"\n peso del pedido: " + envios[trak].getPeso());
						
					}catch(ArrayIndexOutOfBoundsException e) {
						JOptionPane.showMessageDialog(null, "El trak solicitado no se encuentra registrado");
					}
				
				break;
			case 5:
				
				System.exit(0);
				
				break;
			}
		}while(true) ;
	}

}
