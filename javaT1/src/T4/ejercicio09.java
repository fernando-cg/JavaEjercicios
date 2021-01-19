package T4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		
		DecimalFormat formato1 = new DecimalFormat("#.00");

		Scanner teclado = new Scanner(System.in) ;
		
		double numero ;
		
		System.out.print("Introduzca un numero con decimales ->");
		
		numero = teclado.nextDouble() ;
		
		System.out.println(formato1.format(numero));
		
		teclado.close();
		
	}

}
