package T4;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int hora , minuto ;
		
		System.out.print("Indique la hora en la que estamos(1 -> 24) -> ");
		
		hora = teclado.nextInt() ;
		
		System.out.print("Introduzcame los minutos -> ");
		
		minuto = teclado.nextInt() ;
		
		if(hora == 24) {
			
			hora = 24 ;
			
		}else {
		
		hora = 23 - hora ;
		
		}
		
		minuto = 60 - minuto ;
		
		hora = hora * 3600 ;
		
		minuto = minuto * 60 ;
		
		System.out.println("faltan: " + (hora + minuto) + " para las 12");
		
		teclado.close();
	}	

}
