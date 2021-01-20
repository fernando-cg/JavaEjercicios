package T8nextlevel;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int array[][] = new int[3][5] ;
		
		int numero, cx = 0, cy = 0 ;
		
		for(int x = 0 ; x < array.length ; x++) {
			
			for(int y = 0 ; y < array[2].length ; y++) {
				System.out.print("Introducir valor para [" + (x+1) + ", " + (y+1) + "]:" );
				array[x][y] = teclado.nextInt() ;
			}
		}
		
		System.out.print("Introduzca el numero que desea buscar: ");
		
		numero = teclado.nextInt() ;
		
		for(int x = 0 ; x < array.length ; x++) {
			
			if(numero == array[x][cy]) {		
				break ;
			}
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				if(numero == array[x][y]) {
					
					cx = x ;
					cy = y ;
					
					break ;
				}
			}
			
		}
		
		if(numero== array[cx][cy]) {
			
			System.out.println("Tu numero se encuentra en el lugar [" + (cx+1) + ", " + (cy+1) + "]:" ) ;
		}
		else {
			System.out.println("El numero introducido no se encientra en el array");
		}
		
		teclado.close();
	}

}
