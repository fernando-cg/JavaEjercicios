package Youtubers;

import javax.swing.JOptionPane;

public class prueba {

	public static void main(String[] args) {
		String opciones2[]= {"express","alto","normal"} ;
		String opcion =(String) JOptionPane.showInputDialog(null, "Betis Envios", "Seleccione una opcción",JOptionPane.INFORMATION_MESSAGE,null, opciones2,opciones2[0]) ;

		System.out.println(opcion);
		
		int idof =(int)JOptionPane.showInputDialog (null, "Betis Envios", "Seleccione una Sucursal",JOptionPane.INFORMATION_MESSAGE,null,opciones2,opciones2[0]);
		System.out.println(idof);
	}

}
