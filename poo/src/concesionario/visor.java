package concesionario;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class visor {
	
	public static void crearClase(ArrayList coche) {
		
		String marca =JOptionPane.showInputDialog(null,"Introduzca la marca") ;
		
		String modelo =JOptionPane.showInputDialog(null,"Introduzca el modelo") ;
		
		String fecha =JOptionPane.showInputDialog(null,"Introduzca la fecha de matriculación (dd/mm/aaaa)") ;
		
		int dia, mes, anio ;
		
		int contador = 0 ;
		
		for(int x = 0 ; x < fecha.length() ; x++) {
			
			if(!(fecha.charAt(x) == '/')) {
				contador++ ;
			}
			else {
				
				break ;
			}
		}
		
		dia = Integer.parseInt(fecha.substring(0,contador)) ;
		
		int contador2 = 0 ;
		
		for(int x = contador + 1 ; x < fecha.length() ; x++) {
			
			if(!(fecha.charAt(x) == '/')) {
				contador2++ ;
			}
			else {
				
				break ;
			}
		}
		
		mes = Integer.parseInt(fecha.substring(contador+1,contador2)) ;
		
		anio = Integer.parseInt(fecha.substring(contador2+1,fecha.length())) ;
		
		ArrayList<String> colores = new ArrayList();
		
		int resp ;
		
		do {
			String color =JOptionPane.showInputDialog(null,"Introduzca el color") ;
		
			resp = JOptionPane.showConfirmDialog(null, "¿Quieres añadir otro color?", "Seleccione!", JOptionPane.YES_NO_OPTION);
			
			colores.add(color) ;
			
		}while(resp == 0);
		
		int kms =Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca los Kilómetros que tiene el coche")) ;
		
		int precioCompra =Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el precio de compra")) ;
		
		int precioVenta =Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el precio de venta")) ;
		
		coche.add(new coche( marca,  modelo,  colores,  kms, precioVenta, precioCompra,dia, mes, anio)) ;
	}

	public static void main(String[] args) {

		Calendar date = new GregorianCalendar();
		JPanel panel = new JPanel(new GridBagLayout());
		String opciones[] = {"consultar colores de un modelo", "Introducir coche nuevo","Calcular beneficio de un coche","Salir"} ;
		JComboBox box = new JComboBox(opciones);
		box.setSelectedIndex(3);
		JOptionPane.showMessageDialog(null, box, "Seleccione una opción:",JOptionPane.QUESTION_MESSAGE);
		int menu = box.getSelectedIndex() ;
		
		ArrayList<coche> coche = new ArrayList();
		
		switch (menu) {
		case 0:
			
			break;

		case 1:
			
			crearClase(coche) ;
			
			break;

		case 2:
			
			break;

		case 3:
			
			break;

		}
	}

}
