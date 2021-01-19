package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		
			int resistencia ;

			Scanner teclado = new Scanner(System.in) ;
			
			System.out.print("Introduzca la resistencia del material -> ");
			
			resistencia = teclado.nextInt() ;
			
			if(resistencia >= 92) {
				
				System.out.println("El material es apto");
			}
			else {
				
				System.out.println("El material no es apto");
			}
			
			teclado.close();
	}

}
