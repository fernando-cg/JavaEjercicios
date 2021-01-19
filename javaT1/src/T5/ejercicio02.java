package T5;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		char p1 ;
		int suma = 0 ;

		System.out.println("Bienvenido al cuestionario:");
		
		do {
			
		System.out.println("Primera pregunta:");
		System.out.println("A:");
		System.out.println("B:");
		
		p1 = teclado.nextLine().charAt(0) ;
		
		}while(Character.toUpperCase(p1) != 'A' && Character.toUpperCase(p1) != 'B') ;
		
		if(Character.toUpperCase(p1) == 'A') {
			suma ++ ;
			
		}
		
		System.out.println("Tienes: " + suma + " Puntos en el examen");
		
		teclado.close();
	}

}
