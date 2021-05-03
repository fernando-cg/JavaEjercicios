package ejrep3;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	private static Disco[] almacen = new Disco[10] ;
	
	private static int num_discos = 0 ;
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bienvenido al registro de albunes","Albunes",JOptionPane.PLAIN_MESSAGE,null);
		
		String opciones[] = {"Insertar un disco", "Consultar un disco" , "Eliminar Disco" , "Mostrar Almacén de Disco" , "Salir"} ;
		do {
			
			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "La Rana",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, opciones,opciones[4]) ;
		
			switch (opcion) {
			case 0:
				
				break;
				
			case 1:
				
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

	public void setNum_discos() {
		num_discos ++;
	}
	
	

}
