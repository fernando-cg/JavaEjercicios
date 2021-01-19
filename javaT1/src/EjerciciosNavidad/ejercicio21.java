package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int numero, sumador = 0 ;
		
		System.out.print("Dime un numero de inicio -> ");
		
		numero = teclado.nextInt() ;
		
		for(int x = numero ; x <= numero + 100 ; x++) {
			
			sumador = sumador + x ;
			
		}
		
		System.out.println("La suma total es " + sumador);
		
		teclado.close() ;

	}
	
}
