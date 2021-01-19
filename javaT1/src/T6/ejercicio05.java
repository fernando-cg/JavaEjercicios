package T6;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int pass, contador = 4 ;

		do {
			
			System.out.println("Caja fuerte bloqueada: introduzca la clave de 4 digitos para accdeder");
			
			System.out.print("-> ");
			
			pass = teclado.nextInt() ;
			
			if(pass != 1234 ){
				
				System.out.println("Lo siento, esa no es la combinación");
				
				contador -- ;
			}
			
			
		}while(contador > 0 && pass != 1234) ;
		
		if(pass == 1234) {
			
			System.out.println("Enhorabuena tiene acceso a la cueta");
			
		}
		else {
			
			System.out.println("La cuenta ha sido inhabilitada");
		}
		
		teclado.close();
		
		
	}

}
