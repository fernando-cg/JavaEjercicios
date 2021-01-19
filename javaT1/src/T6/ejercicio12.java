package T6;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int altura ;
				
		char impr ;

		System.out.print("Introduzca la altura de la pirámide -> ");
		
		altura = teclado.nextInt() ;
		
		System.out.print("Indique con que quiere que imprima la pirámide ->");
				
		impr = teclado.next().charAt(0) ;
		
		for(int x = 1 ; x <= altura ; x++){
			
			for(int y = 1 ; y <= altura - x ; y ++) {
				
				System.out.print(" ");
			}
			
			for(int z = 1 ; z <= (x*2)-1 ; z++  ) {
				
				System.out.print(impr);
			}
			
			System.out.println("") ;
		}
		
		teclado.close() ;
		
	}

}
