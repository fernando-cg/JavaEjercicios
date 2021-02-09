package Libreria;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int nlib = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cuantos libros quiere introducir")) ;
		
		Libro[] libro = new Libro[nlib] ;
		
		for(int i = 0 ; i< libro.length ; i++) {
			
			String titulo = JOptionPane.showInputDialog("Introduzca el titulo del libro") ;
			
			int isbn = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el isbn"));
			
			String autor = JOptionPane.showInputDialog("Introduzca el nombre del autor") ;
			
			int npaginas = Integer.parseInt(JOptionPane.showInputDialog("Número de páginas")) ;
			
			libro[i] = new Libro(titulo,isbn,autor,npaginas) ;	
		}
		
		for(int a = 0 ; a < libro.length ; a++) {
			JOptionPane.showInputDialog(null,libro[a].toString(),"Biblioteca",3,null, libro, a) ;
		}
	}

}
