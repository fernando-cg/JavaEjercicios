package EjerciciosNavidad;

import java.util.Scanner;

public class ejercicio26 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int mes ;
		
		do {
			
			System.out.println("<--------------------------------------->");
			System.out.println("1: enero");
			System.out.println("2: febrero");
			System.out.println("3: marzo");
			System.out.println("4: abril");
			System.out.println("5: mayo");
			System.out.println("6: junio");
			System.out.println("7: julio");
			System.out.println("8: agosto");
			System.out.println("9: septiembre");
			System.out.println("10: octubre");
			System.out.println("11: noviembre");
			System.out.println("12: diciembre");
			System.out.println("<--------------------------------------->");
			System.out.print("-> ");
			
			mes = teclado.nextInt() ;
		
		}while(mes<1 || mes>12) ;
		
		switch (mes) {
		case 1:
			System.out.println("1: enero");
			break;

		case 2:
			System.out.println("2: febrero");
			break;
			
		case 3:
			System.out.println("3: marzo");
			break;
			
		case 4:
			System.out.println("4: abril");
			break;
			
		case 5:
			System.out.println("5: mayo");
			break;
			
		case 6:
			System.out.println("6: junio");
			break;
			
		case 7:
			System.out.println("7: julio");
			break;
			
		case 8:
			System.out.println("8: agosto");
			break;
			
		case 9:
			System.out.println("9: septiembre");
			break;
			
		case 10:
			System.out.println("10: octubre");
			break;
			
		case 11:
			System.out.println("11: noviembre");
			break;
			
		case 12:
			System.out.println("12: diciembre");
			break;
		}
		
		teclado.close() ;
	}

}
