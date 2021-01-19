package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int numero , contador = 0 ;

		do {
			System.out.print("Introduzca un número -> ");
			
			numero = teclado.nextInt() ;
			
			if(numero != 0) {
				
				contador++ ;
			}
			
		}while(numero != 0) ;
		
		System.out.println("El numero total de numeros iintroducidos es de -> " + contador);
		
		teclado.close();

		
	}

}
