package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int years ;
		
		System.out.print("Introduceme tu año de nacimiento -> ");
		
		years = teclado.nextInt() ;
		
		System.out.println("Tienes " + (2020 - years));
		
		teclado.close();
		
		
	}

}
