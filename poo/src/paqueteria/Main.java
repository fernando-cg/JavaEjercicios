package paqueteria;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Main {
	//del menu he fusionado la opcion de buscar y ordenar por id con la de mostrar todas las oficinas porque ya desde que se crean se ordenan por id , me ha faltado configurar con trycatch el boton Cancelar de los paneles , iba a hacerlo con JFrame pero no me esta cogiendo las rutas que ponia sin embargo el JOption pane con los iconos si, Mañana te lo pregunto en clase , le puse la tematica del betis porque se que en vd te gusta el betis mas que el sevilla.
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
		
		UIManager UI=new UIManager();
	    UI.put("OptionPane.background", new Color( 32, 164, 23 ));
	    UI.put("Panel.background", new Color( 32, 164, 23 ));
	    UI.put("Menu.Foreground",Color.red);
	    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
	    UI.put("OptionPane.messageForeground", Color.white);
	    
		sucursales[0] =( new Sucursal("Calle rosa del corasao","Sevilla")) ;
		sucursales[1] =( new Sucursal("Calle Mario Benito","Cadiz")) ;
		sucursales[2] =( new Sucursal("Calle Benito Villamarin","Malaga")) ;
		envios[0] =( new Envio("12345678A",20.4,"express",1)) ;
		envios[1] =( new Envio("11445678B",13.4,"normal",2)) ;
		envios[2] =( new Envio("11145888C",22.4,"normal",2)) ;
		envios[3] =( new Envio("12575678V",26.4,"alto",1)) ;
		envios[4] =( new Envio("16295678P",50.4,"express",1)) ;
		envios[5] =( new Envio("12399678S",40.4,"alto",1)) ;
		
		JOptionPane.showMessageDialog(null, "Bienvenido a la empresa de correos del Real Betis", "Betis Envios",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("betis.png")));
		
		String opciones[] = {"Crear sucursal","Crear envio","Consultar sucursal","Consultar envios","Consultar envios por traking","Salir"} ;
		
		do {
			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Betis Envios",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("betis2.png")), opciones,opciones[5]) ;
			
			switch (opcion) {
			
			case 0:
				String direccion ;
				String poblacion ;
				do{
					
					direccion = (String) JOptionPane.showInputDialog(null,"introduzca la direccion de la sucursal","Betis envios",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")),null,null);
					
					if(direccion.length()< 1) {
						JOptionPane.showMessageDialog(null, "El campo esta vacio", "Betis Envios",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")));
					}
				}while(direccion.length()< 1) ;
				do {
					poblacion = (String) JOptionPane.showInputDialog(null,"introduzca la poblacion de la sucursal","Betis envios",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")),null,null);
					
					if(poblacion.length()< 1) {
						JOptionPane.showMessageDialog(null, "El campo esta vacio", "Betis Envios",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")));	
					}
				}while(poblacion.length()< 1) ;
					
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
						
						JOptionPane.showMessageDialog(null, "No se Pueden crear Mas sucursales", "Betis Envios",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")));
						
					}
					
				break;
			case 1:
				boolean peso1=true ;
				String dni ;
				do {
					 dni = (String) JOptionPane.showInputDialog(null,"Introduzca el dni completo en mayusculas","Betis envios",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")),null,null);
					 if(comprobar(dni)) {
							JOptionPane.showMessageDialog(null, "Has introducido un formato de dni incorrecto", "Betis Envios",JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("betis2.png")));
					 }
				}while(comprobar(dni)) ;
				double peso = -1 ;
				do {
					try {
						 peso = Double.parseDouble((String) JOptionPane.showInputDialog(null,"Introduzca el peso del paquete","Betis envios",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")),null,null));
						peso1 = false ;
					}catch(NumberFormatException e) {
						peso1 =true ;
						JOptionPane.showMessageDialog(null, "Has introducido un formato de peso no valido", "Betis Envios",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")));
					}
				}while(peso1) ;
				String opciones2[]= {"express","alto","normal"} ;
				
				String tipoe = (String)JOptionPane.showInputDialog (null, "Betis Envios", "Seleccione una tipo de envio",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")), opciones2,opciones2[0]) ;
				
				
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
					
					JOptionPane.showMessageDialog(null, box, "Seleccione una oficina:",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")));
					
					int idof = box.getSelectedIndex() ;
				
				int ide = -1 ;
				
				for(int x = 0;x < envios.length ;x++) {
					if(envios[x]==null) {
						ide = x ;
						break ;
					}
				
				}
				
				try {
				envios[ide] = ( new Envio(dni,peso,tipoe ,idof)) ;
				}catch(IndexOutOfBoundsException e) {
					JOptionPane.showMessageDialog(null, "No se Pueden crear mas envios", "Betis Envios",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")));
				}
				sucursales[0].calcularPrecio(envios[ide]) ;
				
				JOptionPane.showMessageDialog(null, "El precio del envio es de ->" + envios[ide].getPrecio() + "\n El numero de tracking es: " + envios[ide].getTraking(),"Betis Envios",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")));
				
				break;
			case 2:
				
				
				int id1=-1 ;
				
				for(int x = 0;x < sucursales.length ;x++) {
					if(sucursales[x]==null) {
						id1 = x ;
						break ;
					}
				
				}
				String[] salida1 = new String[id1];
				
				for(int x = 0 ; x < id1 ; x++) {
					
					String salida2 = (x+1)+ "->" + sucursales[x].getLocalidad()+ ", calle: " + sucursales[x].getCalle() ;
					
					salida1[x] = salida2 ;
					
			}
				
				JPanel panel1 = new JPanel(new GridBagLayout());
				JComboBox box1 = new JComboBox(salida1);
				
				
				JOptionPane.showMessageDialog(null, box1, "Seleccione una oficina:",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")));
				
				int idof2 = box1.getSelectedIndex() ;
				
				JOptionPane.showInternalMessageDialog(null, "ID: " + sucursales[idof2].getId() + " \nLocalidad: " + sucursales[idof2].getLocalidad() + " \nCalle: " + sucursales[idof2].getCalle(),"Betis Envios",JOptionPane.QUESTION_MESSAGE ,new ImageIcon(Main.class.getResource("betis2.png")));
				
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
				
				
				JOptionPane.showMessageDialog(null, box2, "Seleccione un envio:",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")));
				
				int idped = box2.getSelectedIndex() ;
				
				JOptionPane.showMessageDialog(null, "Traking: " + envios[idped].getTraking() + " \nPrecio: " + envios[idped].getPrecio() + " \nPrioridad : " + envios[idped].getPrioridad() + " \nPeso : " + envios[idped].getPeso(),"Betis Envios",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")));
				
				break;
				
			case 4:
				
				 String track = (String) JOptionPane.showInputDialog(null,"Introduzca el track del pedido","Betis Envios" , JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("betis2.png")), null,null);
				 
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
						JOptionPane.showMessageDialog(null, "Prioridad del envio: "+ envios[trak].getPrioridad() + "\n precio del envio: " + envios[trak].getPrecio() +"\n peso del pedido: " + envios[trak].getPeso(),"Betis Envios", JOptionPane.QUESTION_MESSAGE ,new ImageIcon(Main.class.getResource("betis2.png")));
						
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
