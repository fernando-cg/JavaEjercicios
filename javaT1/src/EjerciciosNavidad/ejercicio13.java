package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		
			int edad ;

			Scanner teclado = new Scanner(System.in) ;
			
			System.out.print("Introduzca su edad -> ");
			
			edad = teclado.nextInt() ;
			
			if(edad >= 18) {
				
				System.out.println("Eres mayor de edad");
			}
			else {
				
				System.out.println("Eres menor de edad");
			}
			
			teclado.close();
	}

}
