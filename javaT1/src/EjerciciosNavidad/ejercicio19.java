package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int num1 , num2 ;
		
		System.out.print("Introduzca un número -> ") ;
		
		num1 = teclado.nextInt() ;
		
		System.out.print("Introduzca otro número -> ") ;
		
		num2 = teclado.nextInt() ;
		
		if(num1 >= num2) {
			
			for(int x = num2 ; x <= num1 ; x++) {
				
				System.out.println(x);
				
			}
			
		}
		else {
			
			for(int x = num1 ; x <= num2 ; x++) {
				
				System.out.println(x);
				
			}
			
		}
		
		teclado.close();
		
	}

}
