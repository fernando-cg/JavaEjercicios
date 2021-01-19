package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio14 {
	
	static boolean par(int numero) {
		
		if(numero % 2 == 0) {
			
			return true ;
		}
		else {
		
			return false ;
		}
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int numero ;
		
		System.out.print("Introduzca un número -> ");
		
		numero = teclado.nextInt() ;
		
		if(par(numero) == true) {
			
			System.out.println("Es par");
			
		}
		else {
			
			System.out.println("Es impar");
		}
		
		teclado.close() ;		
	}

}
