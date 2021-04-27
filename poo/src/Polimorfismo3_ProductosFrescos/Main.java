package Polimorfismo3_ProductosFrescos;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Main {
	
	static ArrayList<Productos> producto = new ArrayList<Productos>();
	static ArrayList<Tienda> tienda = new ArrayList<Tienda>();
	static ArrayList<Empleado> emple = new ArrayList<Empleado>();
	static ArrayList<Vendedor> vende = new ArrayList<Vendedor>();
	
	
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
		String[] Opciones = {"Volver","Ver Empleados","Añadir Empleados","Modificar Empleados", "Eliminar Empleados"};
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
				JOptionPane.showMessageDialog(null, "¡Introduzca un formato numérico!", "MERCADONA", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")));
				
				}
			}while(temp);
			emple.add(new Empleado(Nombre,Edad,tienda.get(ide).getId()));
			break;
		case 3:
			
			break;
		case 4:
	
			break;

		}
		}while(menu !=0) ;
		
	}
	
	
	

	public static void main(String[] args) {
		
		tienda.add(new Tienda("Mercadona Cerro", "C/Cerro del Alguila 7") );
		emple.add(new Empleado("Roberto", 23,1));


		
		JOptionPane.showMessageDialog(null, "¡Bienvenido a tu Tienda favorita!", "MERCADONA", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("mercado.png")));
		
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
			
					break;
				case 4:
					
					break;
		
				}
			}while(menu != 1) ;
		
		}while(true) ;
	}

}
