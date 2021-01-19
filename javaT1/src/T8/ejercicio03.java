package T8;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int[] array = new int[10] ;
		
		int mayor, menor ;
		
		for(int x = 0 ; x < array.length ; x++ ) {
			
			System.out.print("Introduzca un número:");
			
			array[x] = teclado.nextInt() ;
			
		}
		
		mayor = array[0] ;
				
		menor = array[0] ;
		
		for(int x = 0 ; x < array.length ; x++) {
			
			if(array[x] > mayor) {
				
				mayor = array[x] ;
			}
			
			if(array[x] < menor) {
				
				menor = array[x] ;
			}
		}
		
		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);
		
		teclado.close();
	}

}
