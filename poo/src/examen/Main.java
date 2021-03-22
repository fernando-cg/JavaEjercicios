package examen;

import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Main {
//capar tipoViaje en huesped y turno en empleados
	public static void main(String[] args) {
	
		//defino las arrayList donde voy a guardar los datos
		
		ArrayList<Huesped>  h  =  new  ArrayList<Huesped> () ;
		ArrayList<Recepcion>  r  =  new  ArrayList<Recepcion> () ;
		ArrayList<Limpieza>  l  =  new  ArrayList<Limpieza> () ;
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        cal1.set(2007, Calendar.DECEMBER, 3);
        cal2.set(2007, Calendar.DECEMBER, 10);
		//creo objetos
		h.add(new Huesped("Juan", "Peres Domingues", cal1.getTime(), cal2.getTime(), 4, "España", true, "Turismo")) ;
		r.add(new Recepcion("Maria", "Fernandes Espinosa", "Noche", 49, 7, 8)) ;
		l.add(new Limpieza("Maria", "Fernandes Espinosa", "Noche", 49, 7, 8)) ;
		//salida de datos
		System.out.println(h.get(0).salida());
		System.out.println("--------------------------------------");
		System.out.println(r.get(0).salida());
		System.out.println("--------------------------------------");
		System.out.println(l.get(0).salida());
		// Iba a hacer un option pane con posibilidad de modificar datos, añadir y eliminar datos pero no me ha dado tiempo
		String opciones[] = {"Huesped","Recepcion","Limpieza", "Salir"} ;
		
		int menu = JOptionPane.showOptionDialog(null, "¿Seleccione que grupo desea cambiar?", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[3]);
		
		switch (menu) {
		case 0:
			String opciones1[] = {"Ver informacion de un Huesped","Eliminar Huesped","Añadir Huesped", "Salir"} ;
			
			int menu1 = JOptionPane.showOptionDialog(null, "¿Seleccione que grupo desea cambiar?", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones1, opciones1[3]);
			break;
			
		case 1:
			String opciones2[] = {"Huesped","Recepcion","Limpieza", "Salir"} ;
			
			int menu2 = JOptionPane.showOptionDialog(null, "¿Seleccione que grupo desea cambiar?", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones2, opciones2[3]);
			
			break;
			
		case 2:
			String opciones3[] = {"Huesped","Recepcion","Limpieza", "Salir"} ;
			
			int menu3 = JOptionPane.showOptionDialog(null, "¿Seleccione que grupo desea cambiar?", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones3, opciones3[3]);
			
			break;
			
		case 3:
			
			System.exit(0);
			
			break;
		}
	}

}
