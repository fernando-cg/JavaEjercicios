package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int num1 , num2 , num3 ;
		
		System.out.print("Introduzca el primer numero -> ");
		
		num1 = teclado.nextInt() ;
		
		System.out.print("Introduzca el segundo número -> ");
		
		num2 = teclado.nextInt() ;
		
		System.out.print("Introduzca el tercer número -> ");
		
		num3 = teclado.nextInt() ;
		
		if(num1 * num2 == num3) {
			
			System.out.println("Es válido");
			
		}
		else {
			
			System.out.println("Es inválido");
			
		}
		
		teclado.close();

	}

}
