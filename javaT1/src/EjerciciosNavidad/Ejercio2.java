package EjerciciosNavidad;

import java.util.Scanner;

public class Ejercio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero ;
		
		System.out.print("Introduzcame un número y te calculo el cubo -> ");
		
		numero = teclado.nextInt() ;
		
		double resultado = (int) Math.pow(numero , 3) ;
		
		System.out.println("El cubo de " + numero + " es " + resultado) ;
		
		teclado.close() ;
	}
	
}
