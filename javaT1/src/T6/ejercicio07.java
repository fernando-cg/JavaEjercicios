package T6;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int ndigitos = 1, nintroducido, n ;
		
		System.out.print("Introduzca un número y te diré los dígitos que tiene: ") ;
		
		nintroducido = teclado.nextInt() ;
		
		
	    n = nintroducido;
	    
	    while (n > 10) {
	      n = n / 10;
	      ndigitos++;
	    }
		
	    System.out.println(nintroducido + " tiene " + ndigitos + " dígito/s.");
	 
	    teclado.close();
	}

}
