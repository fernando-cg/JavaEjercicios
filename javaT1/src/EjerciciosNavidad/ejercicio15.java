package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int num ;
		
		System.out.print("Introduzca un número -> ");
		
		num = teclado.nextInt() ;
		
		if(num == 0) {
			
			System.out.println("Es neutro");
			
		}
		else if(num > 0) {
			
			System.out.println("Es positivo");
			
		}
		else {
			
			System.out.println("Es negativo");
			
		}
		
		teclado.close();
		
		
	}

}
