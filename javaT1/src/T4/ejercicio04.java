package T4;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		byte hora ;

		System.out.println("Dime la hora en la que estamos de 00h -> 24h");
		
		hora = teclado.nextByte() ;
		
		if((hora >= 0 && hora < 4) || (hora >=20 && hora <= 24) ) {
			
			System.out.println("Buenas noches");
			
		}
		else if(hora >= 4 && hora < 12) {
			
			System.out.println("Buenos dias");
			
		}
		else {
			System.out.println("Buenas tardes");
		}
		
		teclado.close();
	}

}
