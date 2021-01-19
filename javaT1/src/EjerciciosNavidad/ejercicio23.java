package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int menu ;
		
		double base , altura, radio ;
		
		do {
			
			System.out.println("---------------------------------------");
			System.out.println("1: Calcular area triangulo");
			System.out.println("2: Calcular area círculo");
			System.out.println("---------------------------------------");
			System.out.print("-> ");
			
			menu = teclado.nextInt() ;
			
		}while(menu != 1 && menu != 2) ;
		
		switch (menu) {
		case 1:
			
			System.out.print("Base -> ");
			
			base = teclado.nextDouble() ;
			
			System.out.print("Altura -> ");
			
			altura = teclado.nextDouble() ;
			
			System.out.print("El area es -> " + (base * altura)/2);
			
			break;

		case 2:
			
			System.out.print("Introduzca el radio ->");
			
			radio = teclado.nextDouble() ;
			
			System.out.println("El area es -> " + (3.141516 * Math.pow(radio, 2)));
			
			break;
		}
		
		teclado.close();

	}

}
