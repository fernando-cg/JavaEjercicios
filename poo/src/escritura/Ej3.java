package escritura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ej3 {

	public static void main(String[] args) {
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>() ;
		String linea = null;
		
        BufferedReader leerFichero;
        
       try {
    	leerFichero = new BufferedReader (new FileReader("carga.txt"));
    	
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     nombre =  token.nextToken().trim() ;
		   String  apellido1 =  token.nextToken().trim();
		   String       apellido2 =  token.nextToken().trim();
		   String     edad =  token.nextToken().trim();
		   String     ciudad =  token.nextToken().trim();
		  
		   
		   int    edad2=Integer.parseInt(edad);
		   
		   alumnos.add(new Alumno(nombre ,apellido1, apellido2, edad2,ciudad)) ;
		   
		   }
	} catch (NumberFormatException | IOException e) {
		
		System.out.println("Ha habido un error");
	}
       
       for(int x = 0 ; x < alumnos.size() ; x++) {
    	   
    	   System.out.println(alumnos.get(x).toString());
    	   
       }
	}

}
