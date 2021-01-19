package T4;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int numero, maximo, suma = 0 ;
		
		System.out.print("Introduzcame cuantos numeros quiere introducir ->");
		
		maximo = teclado.nextInt() ;
		
		for(int i = 0 ; i < maximo ; i++ ) {
			
			System.out.print("Introduzca el numero que desee -> ");
			
			numero = teclado.nextInt() ;
			
			suma = suma + numero ;
			
		}
		
		System.out.println("La suma es -> " + suma);
		
		teclado.close() ;
	}

}
