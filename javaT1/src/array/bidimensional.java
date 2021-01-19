package array;

import java.util.Scanner;

public class bidimensional {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int[][] matriz = new int[3][2] ;
		
		for(int x = 0 ; x < matriz.length ; x++) {
			
			for(int y = 0 ; y < matriz[2].length ; y++) {
				
				System.out.print("Introduzca un número -> ");
				
				matriz[x][y] = teclado.nextInt() ;
			}
			
		}
		
		for(int x = 0 ; x < matriz.length ; x++) {
			
			for(int y = 0 ; y < matriz[2].length ; y++) {
				
				System.out.print(matriz[x][y] + "	");
			}
			
			System.out.println();	
		}
		
		teclado.close();
	}

}
