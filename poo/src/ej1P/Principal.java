package ej1P;

import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal {
	
	private static Paciente[] lista= new Paciente[10] ;
	
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
		
		JOptionPane.showMessageDialog(null, "Bienvenido a la clinica Real Betis", "Clinica Betis",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Principal.class.getResource("betis.png")));
		String opciones[] = {"Add paciente","Listar Pacientes","Listar por especialidad","Eliminar paciente operado","Salir"} ;
		
		int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Clinica Betis",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon(Principal.class.getResource("betis2.png")),opciones,opciones[4]) ;
	
		switch (opcion) {
		case 0:
			String dni = "" ;
			do {
				 dni = (String) JOptionPane.showInputDialog(null,"Introduzca el dni completo en mayusculas","Clinica Betis",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Principal.class.getResource("betis2.png")),null,null);
				 if(comprobar(dni)) {
						JOptionPane.showMessageDialog(null, "Has introducido un formato de dni incorrecto", "Clinica Betis",JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Principal.class.getResource("betis2.png")));
				 }
			}while(comprobar(dni)) ;
			
			String nombre = (String) JOptionPane.showInputDialog(null,"introduzca su nombre","Clinica Betis",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Principal.class.getResource("betis2.png")),null,null);
			
			String[] valores = { "Traumatologia", "General", "Cirugia","M_interna" };
			 String seleccion = (String)JOptionPane.showInputDialog(null,
		             "Escoga el tipo de necesidad clinica", "Clinica Betis",
		             JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Principal.class.getResource("betis2.png")),
		             valores, valores[0]);
			 int pos = -1 ;
			 try {
				 for(int x = 0 ; x < lista.length ; x++) {
					if(lista[x] == null) {
						pos = x ; 
						break ;
					}
				 }
				 lista[pos] = (new Paciente(dni,nombre, seleccion)) ;
			 }catch(ArrayIndexOutOfBoundsException e ) {
				 
				 JOptionPane.showMessageDialog(null, "La lista de pacientes esta completa, espere a que un paciente termine su operacion medica", "Clinica Betis",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Principal.class.getResource("betis.png")));
			
			 }
			 
			break;
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			String[] valorees = { "Traumatologia", "General", "Cirugia","M_interna" };
			 String select = (String)JOptionPane.showInputDialog(null,
		             "Escoga el tipo de especialidad que desea eliminar", "Clinica Betis",
		             JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Principal.class.getResource("betis2.png")),
		             valorees, valorees[0]);
			 int id = -1 ;
			 for(int x=0; x < lista.length ; x++) {
				 if(lista[x].getEspecialidad().equalsIgnoreCase(select)) {
					 lista[x] = null ;
					 id = x ;
					 break ;
				 }
			 }
			 
			for(int x = id ; x < lista.length ; x++) {
				Paciente temp = lista[x+1] ;
				lista[x] = temp ;
			}
			break;
			
		case 4:
			System.exit(0);
			break;
		}
	}

}
