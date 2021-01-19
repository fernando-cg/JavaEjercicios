package T4;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		byte dia ;

		System.out.print("Introduzca un número del 1 al 7 -> ") ;
		
		dia = teclado.nextByte() ;
		
		switch (dia) {
		case 1:
			
			System.out.println("Lunes");
			break;
			
		case 2:
		
			System.out.println("Martes");
			break;
			
		case 3:
			
			System.out.println("Miércoles");
			break;
			
		case 4:
			
			System.out.println("Jueves");
			break;
			
		case 5:
			
			System.out.println("Viernes");
			break;
			
		case 6:
			
			System.out.println("Sábado");
			break;
			
		case 7:
			
			System.out.println("Domingo");
			break;

		}
		
		teclado.close();
		
		
	}

}
