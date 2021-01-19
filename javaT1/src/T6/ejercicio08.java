package T6;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int n, fibo = 0 , num1 = 0 , num2 = 1 ; 
		
		System.out.print("Introduzca cuantos numero quieres que te muestre: ");
		
		n = teclado.nextInt() ;
		
		for(int x = 0 ; x < n ; x ++) {
			
			fibo = num1 + num2 ;
			
			num1 = num2 ;
			
			num2 = fibo ;
			
			System.out.print(fibo + ", " );
		}
		
		teclado.close() ;
	}

}
