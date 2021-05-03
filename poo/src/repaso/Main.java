package repaso;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	
	private static ArrayList<Coche> coches = new ArrayList() ;

	public static void main(String[] args) {
		
		coches.add(new Coche("1123FGT","Renault","Laguna","Gris",4)) ;
		coches.add(new Coche("2331GHY","Audi","R8","Blanco",5)) ;
		//coches.add(new Coche("4435SSH","Ferrary","488 spyder","Rojo",3)) ;
		//coches.add(new Coche("1442GTH","Lamborghini","Veneno","Verde",2)) ;
		//coches.add(new Coche("9711GMY","Dacia","Dubstep","Azul",1)) ;
		//coches.add(new Coche("1456HHJ","Mercedes","amg","Blanco",6)) ;

		JOptionPane.showMessageDialog(null, "Bienvenido al concesionario DAM","DAM",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("coche.png")));
		
		String opciones[] = {"Add coche","Mostrar coches","Mostrar por kilometros", "Mostrar por Marcas" ,"Salir"} ;
		
		do {

			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "DAM",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("coche.png")), opciones,opciones[4]) ;
		
			switch (opcion) {
			
			case 0:
				
				crearemple() ;
				
				break;
				
			case 1:
				mostrarCoche() ;
				break;
				
			case 2:
				mpk() ;
				break;
				
			case 3:
				mpm() ;
				break;
				
			case 4:
				
				System.exit(0);
				
				break;

			}
			
		}while(true) ;
	
	}
	
	public static boolean compMat(String matricula) {
		boolean retorno = true ;
		
		if(matricula.length() == 7 ) {
			
			try {
			
				int temp = Integer.parseInt(matricula.substring(0, 4)) ;
			
			}catch(NumberFormatException e){
				
				return retorno ;
				
			}
			
			char[] letras = {'T','R','W','G','M','Y','F','P','D','X','B','N','J','Z','S','V','H','L','C','K'};
			
			int contador = 0 ;
			
			for(int x = 0 ; x < letras.length ; x++) {
				
				if(letras[x]==matricula.charAt(4) || letras[x]==matricula.charAt(5) || letras[x]==matricula.charAt(6)) {
					contador ++ ;
				}
			}
			
			if(contador == 3) {
				
				for(int x = 0 ; x < coches.size() ; x++) {
					
					if(coches.get(x).getMatricula().equals(matricula)) {
						retorno = true ;
						break ;
					}
					else {
						retorno = false ;
					}
				}
			}
			
		}
		
		return retorno ;
	}
	
	public static void crearemple() {
		String matricula ;
		
		do {
			
			matricula = (String)JOptionPane.showInputDialog(null, "Introduzca la matricula del coche con formato(nnnnMMM)", "DAM", JOptionPane.WARNING_MESSAGE,new ImageIcon(Main.class.getResource("coche.png")) , null, null) ;
			
			if(compMat(matricula)) {
				
				JOptionPane.showMessageDialog(null, "Has introducido un formato de matricula incorrecta/La matricula esta repetida", "DAM", JOptionPane.QUESTION_MESSAGE, new ImageIcon(Main.class.getResource("coche.png")));
			}
			
		}while(compMat(matricula)) ;
		
		String marca = (String)JOptionPane.showInputDialog(null, "Introduzca la marca del coche", "DAM", JOptionPane.WARNING_MESSAGE,new ImageIcon(Main.class.getResource("coche.png")) , null, null) ;
		
		String modelo = (String)JOptionPane.showInputDialog(null, "Introduzca el modelo", "DAM", JOptionPane.WARNING_MESSAGE,new ImageIcon(Main.class.getResource("coche.png")) , null, null) ;
		
		String color = (String)JOptionPane.showInputDialog(null, "Introduzca el color", "DAM", JOptionPane.WARNING_MESSAGE,new ImageIcon(Main.class.getResource("coche.png")) , null, null) ;
		
		boolean temp = true ;
		int kms = -1 ;
		do {
			try {
			
				 kms = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Introduzca el numero de kilometros recorridos", "DAM", JOptionPane.WARNING_MESSAGE,new ImageIcon(Main.class.getResource("coche.png")) , null, null)) ;
				temp = false ;
			}catch(NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "Has introducido un formato incorrecto", "DAM", JOptionPane.QUESTION_MESSAGE, new ImageIcon(Main.class.getResource("coche.png")));
			}
		}while(temp) ;
		
		coches.add(new Coche(matricula,marca,modelo,color,kms)) ;
	}
	
	public static void mostrarCoche() {
		String salida="" ;
		
		for(int x = 0 ; x < coches.size() ; x++) {
			salida = salida +  coches.get(x).getMatricula() + "\n" ;
		}
		
		JOptionPane.showMessageDialog(null, salida, "DAM", JOptionPane.QUESTION_MESSAGE, new ImageIcon(Main.class.getResource("coche.png")));
	}
	
	public static void mpk() {
		
		for(int x = 0 ; x < coches.size() ; x++) {
			System.out.println("Hola");
			for(int y = 0 ; y < coches.size()-x ; y++) {
				//arreglar
				System.out.println("Hola1");
	            if(coches.get(y).getKm() < coches.get(y+1).getKm()){
	                
	            	Coche temp = coches.get(y);
	            	coches.add(y, coches.get(y+1)) ;
	            	coches.remove(y) ;
	            	coches.add(y+1,temp) ;
	            	System.out.println("El orden ha cambiado");
	            }
			}
		}
		
		String salida="" ;
		
		for(int x = 0 ; x < coches.size() ; x++) {
			salida = salida +  coches.get(x).getKm() + "\n" ;
		}
		
		JOptionPane.showMessageDialog(null, salida, "DAM", JOptionPane.QUESTION_MESSAGE, new ImageIcon(Main.class.getResource("coche.png")));
	
	}
	
	public static void mpm() {
		
	}

}
