package escritura;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Ej1 {
	
    public static void escribe(String nombre) {
        
        try {
        	
        	FileWriter escritor =new FileWriter(nombre, true);
                       
            for (int i=141; i<=730;i++) {
            	
                if(i%2==0) {
                	
                	escritor.write(i + "\n");
                }
            }            
            escritor.close();
            
        } catch (IOException e) {

            System.out.println("No se ha encontrado la ubicacion especificada");
        }
    }  

	public static void main(String[] args) {
		
		String nombre = (String)JOptionPane.showInputDialog(null,"Introduzca el nombre que quiere que se llame el fichero","Fichero",JOptionPane.INFORMATION_MESSAGE) ;
	
		escribe(nombre) ;
	}
}
