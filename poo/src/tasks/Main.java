package tasks;

import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
	
	public static void seleccion(ArrayList notas) {
		if(notas.size()==0) {
			
			JOptionPane.showMessageDialog(null, "No se puede realizar una busqueda de notas porque no existe ninguna, prueve a crear una", "Emergencia", JOptionPane.ERROR_MESSAGE, null);
		}else {
			
			JPanel panel = new JPanel(new GridBagLayout());
			String[] salida = new String[notas.size()] ;
			
			for(int x = 0 ; x < notas.size() ; x++) {
				
				String salidas = x+1 + "-" + ((String) notas.get(x)).substring(0, 10) + "..." ;
				
				salida[x] = salidas ;
			}
			JComboBox box = new JComboBox(salida);
			JOptionPane.showMessageDialog(null, box, "Seleccione una nota:",JOptionPane.QUESTION_MESSAGE,null);
			JOptionPane.showMessageDialog(null, salida[box.getSelectedIndex()], "Notas", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}

	public static void main(String[] args) {

		ArrayList<String> notas = new ArrayList<String>() ;
		String opciones[] = {"Ver tareas", "Añadir tarea","Eliminar tarea","Editar tarea","Mover tarea","Salir"} ;
		String opciones1[] = {"Ver tareas", "Añadir tarea","Salir"} ;
		String opciones2[] = {"Ver tareas", "Añadir tarea","Eliminar tarea","Editar tarea","Salir"} ;
		
		int seleccion ;
		
		do {
		if(notas.size()==0) {
			 seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menu",
		             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
		             null, opciones1, opciones1[2]);
			 if(seleccion==2) {
				 seleccion = 5 ;
			 }
		}
		else if(notas.size()==1) {
			seleccion =JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menu",
		             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
		             null, opciones2, opciones2[4]);
			if(seleccion==4) {
				seleccion=5 ;
			}
		}
		else{
			seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menu",
		             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
		             null, opciones, opciones[5]);
		}
		
		switch (seleccion) {
		case 0:
			seleccion(notas) ;
			break;
			
		case 1:
			
			String nota = (String) JOptionPane.showInputDialog(null, "Introduzca el texto de la nota", "notas", JOptionPane.QUESTION_MESSAGE, null, null, null) ;
			
			notas.add(nota) ;
			
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			System.exit(0);
			break;
			
		}
		}while(true) ;
	}

}
