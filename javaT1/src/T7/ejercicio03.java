package T7;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;

		int azar = (int) (Math.random()*100), intentos = 0;
		
		for(int x = 5 ; x > 0 ; x -- ) {
			
			System.out.print("Introduzca numero:");
			
			intentos = teclado.nextInt() ;
			
			if(intentos == azar) {
				
				break ;
			}
			else if((intentos != azar) && x > 1) {
				
				if(intentos > azar) {
					
					System.out.println("El numero que quieres es mas pequeño que el introducido");
				}
				else {
					
					System.out.println("El numero que quieres es mas grande que el introducido");
				}
			}
		}
		
		if(intentos == azar) {
			
			System.out.println("Enhorabuena has acertado el número");
		}
		else {
			
			System.out.println("Vaya no has adivinado el número, el número correcto es: " + azar);
		}
		
		teclado.close();
	}

}
