package T5;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int precio , descuento ,tfinal ;
		
		System.out.print("Bienvenidos a Mercadower indique el precio total :");
		
		precio = teclado.nextInt() ;
		
		descuento = precio * 20 / 100 ;
		
		tfinal = precio - descuento ;
		
		System.out.println("El precio final es : " + tfinal + " Se te ha descontado: " + descuento + "€");
		
		teclado.close();
	}
}
