package biblioteca;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		//crear el joptionpane
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		String opciones[] = {"Introducir nuevos Libros", "Prestamo de libro","Devolución de libro", "Información de los libros disponibles", "Salir"} ;
		
		JComboBox box = new JComboBox(opciones);
		
		box.setSelectedIndex(1);
		
	    JOptionPane.showMessageDialog(null, box, "Elija una oppcion",JOptionPane.QUESTION_MESSAGE);
	    
	    panel.add(box);
	    
	    ArrayList<Libro> libros = new ArrayList();
	    
	    libros.add(new Libro("La cenicienta", "Walt Disney" , 5)) ; 
	    libros.add(new Libro("Cronicas de la Torre", "Elon Mursk" , 7)) ; 
	    libros.add(new Libro("Harry Potter", "JK Roglwing" , 2)) ; 
	    libros.add(new Libro("La celestina", "Fernando de Rojas" , 10)) ; 
	    libros.add(new Libro("Pentesting con kali", "0XWorld" , 5)) ; 
	    
	    int menu = box.getSelectedIndex() ;
	    
	    switch (menu) {
		case 0:
			
			break;
			
		case 1:
			
			JComboBox box2 = new JComboBox(libros.toArray());
			box2.setSelectedIndex(0);
			JOptionPane.showMessageDialog(null, box2, "Seleccione un libro",JOptionPane.QUESTION_MESSAGE);
			panel.add(box2);
			
			if(libros.) {
				
			}
			else {
				
			}
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;

		}
	}

}
