package T6;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;

		int array[], par = 0 , impar = 0 ;
		
		array = new int[10] ;
		
		for(int x = 0 ; x < 10 ; x++) {
			
			array[x] = (int) (Math.random()*20) ;
		}
		
		for(int x = 0 ; x < 10 ; x++) {
			
			if(array[x] % 2 == 0 ) {
				
				par++ ;
				
			}
			else {
				
				impar ++ ;
				
			}
		}
		
		System.out.println("Hay " + par + " numero pares y " + impar + " numeros impares");
		
		teclado.close();
	}
}
