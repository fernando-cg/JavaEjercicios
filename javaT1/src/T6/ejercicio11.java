package T6;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int numero, suma = 0 ;
		
		do {
			System.out.print("Introduzca un numero -> ") ;
			
			numero = teclado.nextInt() ;
		
		}while(numero < 0) ;
		
		for(int x = numero ; x <= numero+100 ; x++) {
			
			suma = suma + x ;
			
		}
		
		System.out.println("La suma total es:" + suma);
		
		teclado.close();
	}

}
