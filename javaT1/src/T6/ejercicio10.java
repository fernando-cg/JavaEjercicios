package T6;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int numero ;
		
		boolean divisible = false ;
		
		System.out.print("Introduce un numero y te dire si es primo -> ");
		
		numero = teclado.nextInt() ;
		
		for(int x = 2 ; x < numero ; x++) {
			
			if(numero % x == 0) {
				
				divisible = true ;
			}			
		}
		
		if(divisible == false) {
			
			System.out.println("Es primo");
		}
		else{
			
			System.out.println("No es primo");
		}
		
		teclado.close() ;
	}

}
