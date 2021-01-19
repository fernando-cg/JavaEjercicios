package T8;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int[] array = new int[10] ;
		
		for(int x = 0 ; x < array.length ; x++) {
			System.out.print("Introduzca el número " + (x+1) + ":" );
			
			array[x] = teclado.nextInt() ;
		
		}
		
		for(int x = array.length ; x > 0 ; x--) {
			
			System.out.print("\t" + array[x - 1]);
		}

		teclado.close();
	}

}
