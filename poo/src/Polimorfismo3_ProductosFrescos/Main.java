package Polimorfismo3_ProductosFrescos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//controlar excepciones de cuando no hay productos , venedores,tiendas,empleados
import javax.swing.UIManager;

public class Main {
	//hacer comprobaciones de cuando las arraylist estan vacias para que no salte el programa activar el boton de cancelar
	
	static ArrayList<Productos> producto = new ArrayList<Productos>();
	static ArrayList<Tienda> tienda = new ArrayList<Tienda>();
	static ArrayList<Empleado> emple = new ArrayList<Empleado>();
	static ArrayList<Vendedor> vende = new ArrayList<Vendedor>();
	
	public static void vendedor(int ide){
		int menu=0 ;
		do {
		
			ArrayList<String>  vendedor= new ArrayList<String>();
			
			for (int i = 0; i < vende.size(); i++) {
				if (vende.get(i).getIdTienda()==tienda.get(ide).getId()) {
					vendedor.add((i+1)+"-->"+vende.get(i).getNombre());
					
					
				}
				
				
				
			}
			
			Object[] vendedor2 = vendedor.toArray();
			String[] Opciones = {"Volver","Ver Vendedores","Add Vendedor","Modificar Vendedor", "Eliminar Vendedor"};
			menu = JOptionPane.showOptionDialog(null, "Selecciona una opcion: ", "Vendedor, Nombre: ",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")),Opciones, Opciones[0]);
			
			switch (menu) {
			case 1: 
				JComboBox box = new JComboBox(vendedor2) ;
				JOptionPane.showMessageDialog(null,box,"Seleccione un vendedor",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png"))) ;	
				int idvend= box.getSelectedIndex();
				JOptionPane.showMessageDialog(null,vende.get(idvend).toString(), "Empleados", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")));
	
				break;
			case 2:
				String Nombre =(String)JOptionPane.showInputDialog(null,"Introduzca el nombre del vendedor: ", "MERCADONA", JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png")),null,null);
				boolean temp=true;
				int Edad =0;
				do {
					try{
						
						Edad =Integer.parseInt((String) JOptionPane.showInputDialog(null,"Introduzca la edad del vendedor: ", "MERCADONA", JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png")),null,null));
						temp=false;
					}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Introduzca un formato numerico!", "MERCADONA", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")));
					
					}
				}while(temp);
				vende.add(new Vendedor(Nombre,Edad,tienda.get(ide).getId()));
				break;
			case 3:
				JComboBox box2 = new JComboBox(vendedor2) ;
				JOptionPane.showMessageDialog(null,box2,"Seleccione un vendedor",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png"))) ;	
				int idEmple2= box2.getSelectedIndex();
				String[] opciones2 = {"Volver","Nombre","Edad"} ;
				
				int select = JOptionPane.showOptionDialog(null, "Seleccione que desea cambiar: ", "Vendedor",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")),opciones2, opciones2[0]) ;
				
				switch (select) {
				case 1:
					String nombre =(String)JOptionPane.showInputDialog(null,"Introduzca el nombre del Vendedor: ", "MERCADONA", JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png")),null,null);
					vende.get(idEmple2).setNombre(nombre);
					break;
	
				case 2:
					boolean temp2=true;
					int edad =0;
					do {
						try{
							
							edad =Integer.parseInt((String) JOptionPane.showInputDialog(null,"Introduzca la edad del Vendedor: ", "MERCADONA", JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png")),null,null));
							temp2=false;
						}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Introduzca un formato numerico!", "MERCADONA", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")));
						
						}
					}while(temp2);
					vende.get(idEmple2).setEdad(edad);
					break;
					
				}
				
				break;
			case 4:
				
				JComboBox box3 = new JComboBox(vendedor2) ;
				JOptionPane.showMessageDialog(null,box3,"Seleccione el vendedor que desea eliminar",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png"))) ;	
				int idEmple3= box3.getSelectedIndex();
				vende.remove(idEmple3) ;
		
				break;
	
			}
		}while(menu !=0) ;
		
	}
	public static void Empleado(int ide){
		int menu=0 ;
		do {
		
		ArrayList<String>  emplea2= new ArrayList<String>();
		
		for (int i = 0; i < emple.size(); i++) {
			if (emple.get(i).getIdTienda()==tienda.get(ide).getId()) {
				emplea2.add((i+1)+"-->"+emple.get(i).getNombre());
				
				
			}
			
			
			
		}
		
		Object[] Empleados = emplea2.toArray();
		String[] Opciones = {"Volver","Ver Empleados","Add Empleados","Modificar Empleados", "Eliminar Empleados"};
		menu = JOptionPane.showOptionDialog(null, "Selecciona una opcion: ", "Empleado, Nombre: ",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")),Opciones, Opciones[0]);
		
		switch (menu) {
		case 1: 
			JComboBox box = new JComboBox(Empleados) ;
			JOptionPane.showMessageDialog(null,box,"Seleccione una empleado",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png"))) ;	
			int idEmple= box.getSelectedIndex();
			JOptionPane.showMessageDialog(null,emple.get(idEmple).toString(), "Empleados", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")));

			break;
		case 2:
			String Nombre =(String)JOptionPane.showInputDialog(null,"Introduzca el nombre del Empleado: ", "MERCADONA", JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png")),null,null);
			boolean temp=true;
			int Edad =0;
			do {
				try{
					
					Edad =Integer.parseInt((String) JOptionPane.showInputDialog(null,"Introduzca la edad del Empleado: ", "MERCADONA", JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png")),null,null));
					temp=false;
				}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Introduzca un formato numerico!", "MERCADONA", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")));
				
				}
			}while(temp);
			emple.add(new Empleado(Nombre,Edad,tienda.get(ide).getId()));
			break;
		case 3:
			JComboBox box2 = new JComboBox(Empleados) ;
			JOptionPane.showMessageDialog(null,box2,"Seleccione una empleado",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png"))) ;	
			int idEmple2= box2.getSelectedIndex();
			String[] opciones2 = {"Volver","Nombre","Edad"} ;
			
			int select = JOptionPane.showOptionDialog(null, "Seleccione que desea cambiar: ", "Empleado",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")),opciones2, opciones2[0]) ;
			
			switch (select) {
			case 1:
				String nombre =(String)JOptionPane.showInputDialog(null,"Introduzca el nombre del Empleado: ", "MERCADONA", JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png")),null,null);
				emple.get(idEmple2).setNombre(nombre);
				break;

			case 2:
				boolean temp2=true;
				int edad =0;
				do {
					try{
						
						edad =Integer.parseInt((String) JOptionPane.showInputDialog(null,"Introduzca la edad del Empleado: ", "MERCADONA", JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png")),null,null));
						temp2=false;
					}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Introduzca un formato numerico!", "MERCADONA", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")));
					
					}
				}while(temp2);
				emple.get(idEmple2).setEdad(edad);
				break;
				
			}
			
			break;
		case 4:
			
			JComboBox box3 = new JComboBox(Empleados) ;
			JOptionPane.showMessageDialog(null,box3,"Seleccione el empleado que desea eliminar",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png"))) ;	
			int idEmple3= box3.getSelectedIndex();
			emple.remove(idEmple3) ;
	
			break;

		}
		}while(menu !=0) ;
		
	}
	
	
	

	public static void main(String[] args) {
		
		UIManager UI=new UIManager();
	    UI.put("OptionPane.background", new Color( 32, 164, 23 ));
	    UI.put("Panel.background", new Color( 32, 164, 23 ));
	    UI.put("Menu.Foreground",Color.red);
	    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
	    UI.put("OptionPane.messageForeground", Color.white);
		
		tienda.add(new Tienda("Mercadona Cerro", "C/Cerro del Alguila 7") );
		emple.add(new Empleado("Roberto", 23,1));
		vende.add(new Vendedor("Paco", 22,1));


		
		JOptionPane.showMessageDialog(null, "Bienvenido a tu Tienda favorita!", "MERCADONA", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")));
		
		do {
			String[] SalidaTienda = new String[tienda.size()];
		
		
			for (int i = 0; i < SalidaTienda.length; i++) {
				
				SalidaTienda[i]=(i+1)+"-->"+tienda.get(i).getTienda();
			}
			
			JPanel panel = new JPanel(new GridBagLayout()) ;
			JComboBox box = new JComboBox(SalidaTienda) ;
			JOptionPane.showMessageDialog(null,box,"Seleccione una tienda:",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("mercado.png"))) ;	
			
			int ide= box.getSelectedIndex();
			
			int menu ;
			
			do {
			String[] Opciones = {"Salir","Volver","Ver Empleados","Ver Vendedores", "Ver Productos"};
			menu=JOptionPane.showOptionDialog(null, "Selecciona una opcion: ", "Mercadona, Calle: "+tienda.get(ide).getDireccion(),JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")),Opciones, Opciones[0]);
			
			
			
			switch (menu) {
				case 0:	
					System.exit(0);
					
					break;
				case 2: 
					
					Empleado(ide);
			
					break;
				case 3:
					vendedor(ide) ;
					break;
				case 4:
					
					break;
		
				}
			}while(menu != 1) ;
		
		}while(true) ;
	}

}
