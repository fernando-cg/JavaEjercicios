package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {

		Scanner teclado =  new Scanner(System.in) ;
		
		Scanner teclado2 =  new Scanner(System.in) ;
		
		int numero ;
		
		char letra ;
		
		float dec ;
		
		String cadena ;
		
		System.out.print("Número -> ");
		
		numero = teclado.nextInt() ;
		
		System.out.print("letra -> ");
		
		letra = teclado.next().charAt(0); ;
		
		System.out.print("Decimal -> ");
		
		dec = teclado2.nextFloat() ;
		
		System.out.print("Cadena -> ");
		
		cadena = teclado2.next() ;
		
		System.out.println(numero + " " + dec + " " + letra + " " + cadena);
		
		teclado.close();
		
		teclado2.close();
		
	}

}
