package T5;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;

		String dia ;
		
		int hora , minutos , minutosr = 0 ;
		

			System.out.println("Indique un dia de la semana (Lunes - viernes)");
		
			dia = teclado.nextLine() ;
		
		System.out.println("Indique que hora que es actualmente(0-24)");
		
		hora = teclado.nextInt() ;
		
		System.out.println("Indique que minuto es actualmente (0-60)");
		
		minutos = teclado.nextInt() ;
		
		if(dia.equalsIgnoreCase("lunes")) {
			
			minutosr = 120 * 60 ;
			
		}
		else if(dia.equalsIgnoreCase("martes")) {
			
			minutosr = 96 * 60 ;
			
		}
		else if(dia.equalsIgnoreCase("miercoles")) {
			
			minutosr = 72 * 60 ;
			
		}
		else if(dia.equalsIgnoreCase("jueves")) {
			
			minutosr = 48 * 60 ;
			
		}
		else if(dia.equalsIgnoreCase("viernes")) {
			
			minutosr = 24 * 60 ;
			
		}
		
		hora = (24 - hora) * 60 ;
		
		minutos = 60 - minutos ;
		
		minutosr = minutosr - (minutos+hora) ;
		
		System.out.println("Faltan: " + minutosr);
	
		teclado.close() ;
	}

}
