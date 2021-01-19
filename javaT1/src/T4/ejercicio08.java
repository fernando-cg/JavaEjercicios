package T4;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in) ;
		
		int numero ;
		
		String par , divisible ;
		
		System.out.print("Dime un número:") ;
		
		numero = teclado.nextInt() ;
		
		if(numero % 2 == 0) {
			
			par = "Es Par" ;
			
		}
		else {
			
			par = "Es Impar" ;
			
		}
		
		
		if(numero % 5 == 0) {
			
			divisible = "Es divisible entre 5" ;
			
		}
		else {
			
			divisible = "No es divisible entre 5" ;
			
		}
		
		System.out.println(par);
		
		System.out.println(divisible);
		
		teclado.close();
		
		
	}

}
