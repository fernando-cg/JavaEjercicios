package T5;

import java.util.Scanner;

public class ejercicio04 {
	
	static int calculonota(int e1 , int e2) {
		
		int media ;
		
		media = (e1 + e2) / 2 ;
		
		return media;
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int e1, e2 ;
		
		String apto ;

		System.out.println("Bienvenido a este calculador de nota");
		
		System.out.print("Introduzcame la nota del primer examen: ");
		
		e1 = teclado.nextInt() ;
		
		System.out.print("Introduzcame la nota del segundo examen: ");
		
		e2 = teclado.nextInt() ;
		
		
		
		if(calculonota(e1,e2) >= 5) {
			
			System.out.println("Has aprobado con un: " + calculonota(e1,e2));
			
		}
		else {
			
			System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
			
			apto = teclado.next() ;
			
			if(apto.equalsIgnoreCase("apto")) {
				
				System.out.println("Has aprobado la recuperación");
			}
			else {
				
				System.out.println("No has aprobado la recuperación");
			}
			
		}
			
		teclado.close();
	}

}
