package T4;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		
		String numero ;
		
		Scanner teclado = new Scanner(System.in) ;
		
		System.out.print("Introduzca un número de tres cifras -> ");
		
		numero = teclado.nextLine() ;
		
		System.out.println(numero.charAt(0) + " " + numero.charAt(1) + " " + numero.charAt(2));
		
		teclado.close();

	}

}
