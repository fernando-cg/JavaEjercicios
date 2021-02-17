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
		
	    ArrayList<Libro> libros = new ArrayList();
	    
	    libros.add(new Libro("La cenicienta", "Walt Disney" , 5)) ; 
	    libros.add(new Libro("Cronicas de la Torre", "Elon Mursk" , 7)) ; 
	    libros.add(new Libro("Harry Potter", "JK Roglwing" , 2)) ; 
	    libros.add(new Libro("La celestina", "Fernando de Rojas" , 10)) ; 
	    libros.add(new Libro("Pentesting con kali", "0XWorld" , 5)) ; 
	    
	    
		do {
			JPanel panel = new JPanel(new GridBagLayout());
			
			String opciones[] = {"Introducir nuevos Libros", "Prestamo de libro","Devolución de libro", "Información de los libros disponibles", "Salir"} ;
			
			JComboBox box = new JComboBox(opciones);
			
			box.setSelectedIndex(1);
			
		    JOptionPane.showMessageDialog(null, box, "Elija una oppcion",JOptionPane.QUESTION_MESSAGE);
		    
		    panel.add(box);
		    
		    int menu = box.getSelectedIndex() ;
		    
		    switch (menu) {
			case 0:
				String titulo = JOptionPane.showInputDialog(null,"Introduzca el nombre del libro") ;
				String autor = JOptionPane.showInputDialog(null,"Introduzca el nombre del autor") ;
				int numerolibros = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el nombre del libro")) ;
				
				libros.add(new Libro(titulo,autor,numerolibros)) ;
				
				break;
				
			case 1:
				
				JComboBox box2 = new JComboBox(libros.toArray());
				box2.setSelectedIndex(0);
				JOptionPane.showMessageDialog(null, box2, "Seleccione un libro",JOptionPane.QUESTION_MESSAGE);
				panel.add(box2);
				int opt = box2.getSelectedIndex() ;
				
				if(libros.get(opt).prestamo() == true) {
					
					JOptionPane.showMessageDialog(null, "Operacion realizada con éxito");
				}
				else {
					
					JOptionPane.showMessageDialog(null, "La operacion no ha podido ser realizada");
				}
				break;
				
			case 2:
				
				JComboBox box3 = new JComboBox(libros.toArray());
				box3.setSelectedIndex(0);
				JOptionPane.showMessageDialog(null, box3, "Seleccione un libro",JOptionPane.QUESTION_MESSAGE);
				panel.add(box3);
				int opt1 = box3.getSelectedIndex() ;
				
				if(libros.get(opt1).devolucion() == true) {
					
					JOptionPane.showMessageDialog(null, "Operacion realizada con éxito");
				}
				else {
					
					JOptionPane.showMessageDialog(null, "La operacion no ha podido ser realizada");
				}
				break;
				
				
			case 3:
				JComboBox box4 = new JComboBox(libros.toArray());
				box4.setSelectedIndex(0);
				JOptionPane.showMessageDialog(null, box4, "Seleccione un libro",JOptionPane.QUESTION_MESSAGE);
				panel.add(box4);
				
				break;
				
			case 4:
				System.exit(0);
				break;
	
			}
		}while(true) ;
	}

}
