package escritura;

import java.io.FileWriter;
import java.io.IOException;

public class Ej2 {

	public static void main(String[] args) {

		escribe("pepe.txt") ;

	}
	
    public static void escribe(String nombre) {
        
        try {
        	
        	FileWriter escritor =new FileWriter(nombre, true);
                       
    		for(int x = 1 ; x < 6 ; x++) {
    			for(int y = 1; y <= 6-x ; y++ ) {
    				System.out.print(" ");
    				escritor.write(" ");
    			}
    			
    			for(int y = 1 ; y <= (x*2)-1 ; y++) {
    				System.out.print("*");
    				escritor.write("*");
    			}
    			
    			System.out.println("");
    			escritor.write("\n");
    			
    			
    		}
    		
    		escritor.close() ;
            
        } catch (IOException e) {

            System.out.println("No se ha encontrado la ubicacion especificada");
        }
    }  

}
