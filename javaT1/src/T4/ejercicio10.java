package T4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		DecimalFormat formato1 = new DecimalFormat("#");
		
		float numero ;
		
		System.out.print("Introduzca un numero con decimales ->");
		
		numero = teclado.nextFloat() ;
		
		System.out.println(formato1.format(numero));
		
		teclado.close();
		
		
		
		
	}
}
