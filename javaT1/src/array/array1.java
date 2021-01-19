package array;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;

		double[] notas = new double[19] ;
		
		double media = 0 ;
		
		for(int x = 0 ; x < notas.length ; x++) {
			
			System.out.print("Introduzca la nota del alumno nº " + (x+1) + ": ");
			
			notas[x] = teclado.nextDouble() ;
		}
		
		for(int x = 0 ; x < notas.length ; x++) {
			
			media = media + notas[x] ;
		}
		
		media = media / notas.length ;
		
	
		System.out.println("La media es: " + media);
		
		teclado.close() ;
	}
	

}
