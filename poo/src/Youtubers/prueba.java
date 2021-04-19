package Youtubers;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class prueba {

	static ArrayList<String> empleados = new ArrayList<String>() ;
	
	public static void main(String[] args) {
		
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.set(2000,2,1) ;
        cal2.set(2000,2,10);
        int diitas = (int) Duration.between(cal1.toInstant(), cal2.toInstant()).toDays();
        System.out.println(diitas);
        System.out.println(cal1.MONTH);
        Calendar c3 = Calendar.getInstance() ;
        System.out.println(c3.getTime());
        
        escribir(null) ;
	}
	
public static void eescritura() {
		
        try {
        	
        	FileWriter escritor =new FileWriter("empleados.txt", true);
              for(int x = 0 ; x < empleados.size() ; x++) {
            	  escritor.write(empleados.get(x).toString()) ;
              }
    		
    		escritor.close() ;
            
        } catch (IOException e) {

            System.out.println("No se ha encontrado la ubicacion especificada");
        }
	}

public static void escribir(String cadena) {
	FileReader f = null ;
	
	try {
		
		f = new FileReader("pepe.txt");
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		
	}
	
	try {
		
		BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("pepe.txt",true), "utf-8"));
	
		escribir.write("Hola que hases puto");
		
		escribir.close();
	} catch (IOException e) {
		
		e.printStackTrace();
		System.out.println("Error");
	}
	}
}
