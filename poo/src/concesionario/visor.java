package concesionario;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
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

		dia = Integer.parseInt(fecha.substring(0,1)) ;

		mes = Integer.parseInt(fecha.substring(3,4)) ;

		anio = Integer.parseInt(fecha.substring(6,fecha.length())) ;

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
		String opciones[] = {"consultar colores de un modelo", "Introducir coche nuevo", "Ordenar precio","Salir"} ;
		JComboBox box = new JComboBox(opciones);
		ArrayList<coche> coche = new ArrayList();


		do{
			JOptionPane.showMessageDialog(null, box, "Seleccione una opción:",JOptionPane.QUESTION_MESSAGE);
			int menu = box.getSelectedIndex() ;


			switch (menu) {
			case 0:

				JComboBox box2 = new JComboBox(coche.toArray());
				JOptionPane.showMessageDialog(null, box2, "Seleccione un coche",JOptionPane.QUESTION_MESSAGE);
				panel.add(box2);
				int opt = box2.getSelectedIndex() ; 
				JComboBox box3 = new JComboBox(coche.get(opt).ColoresDisp().toArray());
				JOptionPane.showMessageDialog(null, box2, "Colores",JOptionPane.QUESTION_MESSAGE);
				panel.add(box3);
				int opc = box2.getSelectedIndex() ; 

				break;

			case 1:

				crearClase(coche) ;

				break;

			case 2:

				coche.sort((Comparator<? super concesionario.coche>) coche);
				break;

			case 3:

					System.exit(0);

				break;

			}
		}while(true) ;
	}

}