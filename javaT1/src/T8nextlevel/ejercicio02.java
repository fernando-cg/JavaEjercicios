package T8nextlevel;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int array[][] = new int[3][3] ;
		
		int uno ;
		
		for(int x = 0 ; x < array.length ; x++) {
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				System.out.print("Introduzca un valor para [" + (x+1) + ", " + (y+1) + "]:") ;
				
				array[x][y] = teclado.nextInt() ;
			}
			
		}
		
		for(int x = 0 ; x < array.length ; x++) {
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				System.out.print("\t" + array[x][y]);
			}
			
			System.out.println("");
		}
		
		System.out.println("");
		
		uno = array[0][0] ;
		array[0][0] = array[2][2] ;
		array[2][2] = uno ;
		
		for(int x = 0 ; x < array.length ; x++) {
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				System.out.print("\t" + array[x][y]);
			}
			
			System.out.println("");
		}
		
		teclado.close();
	}

}
