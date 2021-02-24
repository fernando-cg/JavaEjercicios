package fesac_olimpiadas;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
	
	public static void registrar(ArrayList atleta) {
	
		String nombre =JOptionPane.showInputDialog(null,"Introduzca su nombre") ;
		
		String pais =JOptionPane.showInputDialog(null,"Introduzca su pais de nacimiento") ;
		
		String tiempo =JOptionPane.showInputDialog(null,"Introduzca el tiempo que ha tardado en llegar a la meta (hh:mm:ss)") ;
		
		int horas = Integer.parseInt(tiempo.substring(0,2)) ;
		
		int minutos = Integer.parseInt(tiempo.substring(3,5)) ;
		
		int segundos = Integer.parseInt(tiempo.substring(6,8)) ;
		
		atleta.add(new Atleta(nombre,pais,horas,minutos,segundos)) ;
	}

	public static void main(String[] args) {
		Calendar date = new GregorianCalendar() ;
		ArrayList<Atleta> atleta = new ArrayList() ;
		
		do {
			
		
			String opciones[] = {"Consultar datos de los concursantes", "Introducir datos de los corredores", "Mostrar ganador","Carrera","Salir"} ;
			int menu = JOptionPane.showOptionDialog(null, "Seleccione una opcción", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[4]);
			
			switch (menu) {
			case 0:
				
				JOptionPane.showMessageDialog(null,atleta.toString(),"Información de los concursantes",JOptionPane.INFORMATION_MESSAGE);
				
				break;
				
			case 1:
				
				registrar(atleta) ;
				
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
