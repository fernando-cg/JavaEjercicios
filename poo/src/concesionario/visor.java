package concesionario;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class visor {
	
	public static void crearClase() {
		
		String marca =JOptionPane.showInputDialog(null,"Introduzca la marca") ;
		
		String modelo =JOptionPane.showInputDialog(null,"Introduzca el modelo") ;
		
		String fecha =JOptionPane.showInputDialog(null,"Introduzca la fecha de matriculación") ;
		
		ArrayList<String> colores = new ArrayList();
		
		int resp ;
		
		do {
			String color =JOptionPane.showInputDialog(null,"Introduzca el color") ;
		
			resp = JOptionPane.showConfirmDialog(null, "¿Quieres añadir otro color?", "Seleccione!", JOptionPane.YES_NO_OPTION);
			
			colores.add(color) ;
			
		}while(resp == 0);
		
		String kms =JOptionPane.showInputDialog(null,"Introduzca los Kilómetros que tiene el coche") ;
		
		String precioCompra =JOptionPane.showInputDialog(null,"Introduzca el precio de compra") ;
		
		String precioVenta =JOptionPane.showInputDialog(null,"Introduzca el precio de venta") ;
		
	}

	public static void main(String[] args) {

		Calendar date = new GregorianCalendar();
		JPanel panel = new JPanel(new GridBagLayout());
		String opciones[] = {"consultar colores de un modelo", "Introducir coche nuevo","Calcular beneficio de un coche","Salir"} ;
		JComboBox box = new JComboBox(opciones);
		box.setSelectedIndex(3);
		JOptionPane.showMessageDialog(null, box, "Seleccione una opción:",JOptionPane.QUESTION_MESSAGE);
		int menu = box.getSelectedIndex() ;
		
		switch (menu) {
		case 0:
			
			break;

		case 1:
			
			crearClase() ;
			
			break;

		case 2:
			
			break;

		case 3:
			
			break;

		}
	}

}
