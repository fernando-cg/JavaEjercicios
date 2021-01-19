package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int num1 , num2, num3 , mayor , menor ;
		
		System.out.print("Introduzca numero 1 -> ");
		
		num1 = teclado.nextInt() ;
		
		System.out.print("Introduzca numero 2 -> ");
		
		num2 = teclado.nextInt() ;
		
		System.out.print("Introduzca numero 3 -> ");
		
		num3 = teclado.nextInt() ;
		
		if(num1 > num2 && num1 > num3 ) {
			
			mayor = num1 ;
			
		}
		else if(num2 > num1 &&  num2 > num3) {
			
			mayor = num2 ;
			
		}
		else {
			
			mayor = num3 ;
			
		}
		
		
		
		if(num1 < num2 && num1 < num3 ) {
			
			menor = num1 ;
			
		}
		else if(num2 < num1 &&  num2 < num3) {
			
			menor = num2 ;
			
		}
		else {
			
			menor = num3 ;
			
		}
		
		System.out.println("Mayor -> " + mayor);
		
		System.out.println("Menor -> " + menor);
		
		teclado.close() ;
	}

}
