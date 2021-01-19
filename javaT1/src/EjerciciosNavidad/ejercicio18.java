package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
			
		String frase ;
		
		int numero ;

		System.out.print("Introduzcame una frase -> ");
		
		frase = teclado.nextLine() ;
		
		System.out.print("Introduzcame cuantas veces quieres que te repita la frase -> ");
		
		numero = teclado.nextInt() ;
		
		for(int x = 0 ; x < numero ; x++) {
			
			System.out.println(frase);
			
		}
		
		teclado.close();
	}

}
