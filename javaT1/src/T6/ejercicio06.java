package T6;

import java.util.Scanner;

public class ejercicio06 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int numero ;
		
		System.out.print("Introduce un numero-> ") ;
		
		numero = teclado.nextInt() ;
		
		for(int x = 0 ; x <= 10 ; x++) {
			
			System.out.println(numero + " * " + x + " = " + (numero * x));
			
		}
		
		teclado.close() ;
	}

}
