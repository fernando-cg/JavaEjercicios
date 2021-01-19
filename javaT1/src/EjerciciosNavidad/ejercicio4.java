package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int km ;
		
		System.out.print("Introduzca una cantidad de Kilómetros -> ");
		
		km = teclado.nextInt() ;
		
		System.out.println(km + " KM son -> " + 1000 * km);
		
		teclado.close();
	}

}
