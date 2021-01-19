package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio29 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int numero ;
		
		do {
			
			System.out.print("Dime un numero mayor o igual que 0 -> ");
			
			numero = teclado.nextInt() ;
			
			if(numero <= 0) {
				
				System.out.println("Numero no válido") ;
			}
			
		}while(numero <= 0) ;
		
		System.out.println(numero + " Es correcto");
		
		teclado.close();
	}

}
