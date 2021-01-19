package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio27 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int aleatorios;
		
		System.out.print("Dime cuantos numeros aleatorios quieres -> ");
		
		aleatorios = teclado.nextInt() ;
		
		for(int x = 0 ; x < aleatorios ; x ++) {
			
			System.out.println( x + " -> " + (int) (Math.random()*99 + 1));
			
		}
		
		teclado.close();
	}

}
