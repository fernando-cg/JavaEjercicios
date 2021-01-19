package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		
		int a , b , c , d ;
		
		Scanner teclado = new Scanner(System.in) ;
		
		System.out.print("Introduzca el valor de a -> ");
		
		a = teclado.nextInt() ;
		
		System.out.print("Introduzca valor de b -> ");
		
		b = teclado.nextInt() ;
		
		System.out.print("Introduzca valor de c -> ");
		
		c = teclado.nextInt() ;
		
		System.out.println("Introduzca valor de d -> ");
		
		d = teclado.nextInt() ;
		
		teclado.close();
		
		System.out.println(a+b*c+0.5-d*Math.pow(c,2));
	}

}
