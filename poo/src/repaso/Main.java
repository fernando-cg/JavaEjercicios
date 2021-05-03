package repaso;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	
	private static ArrayList<Coche> coches = new ArrayList() ;

	public static void main(String[] args) {
		
		coches.add(new Coche("1123FGT","Renault","Laguna","Gris",100000)) ;
		coches.add(new Coche("2331GHY","Audi","R8","Blanco",100)) ;
		coches.add(new Coche("4435SSH","Ferrary","488 spyder","Rojo",12400)) ;
		coches.add(new Coche("1442GTH","Lamborghini","Veneno","Verde",100000)) ;
		coches.add(new Coche("9711GMY","Dacia","Dubstep","Azul",100000)) ;
		coches.add(new Coche("1456HHJ","Mercedes","amg","Blanco",100000)) ;

		JOptionPane.showMessageDialog(null, "Bienvenido al concesionario DAM","DAM",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("coche.png")));
		
		String opciones[] = {"Add coche","Mostrar coches","Mostrar por kilometros", "Mostrar por Marcas" ,"Salir"} ;
	
		do {

			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "DAM",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("coche.png")), opciones,opciones[4]) ;
		
			
		}while(true) ;
	
	}

}
