package T8;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		   String[] meses = {
				      "enero", "febrero", "marzo", "abril", "mayo", "junio",
				      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		
		double[] temperatura = new double[12] ;
		
		for(int x = 0 ; x < meses.length ; x++) {
			
			System.out.print("Introduzca la temperatura media de " + meses[x] + ":");
			
			temperatura[x] = sc.nextInt() ;
			
		}
		
		for (int i = 0; i < temperatura.length; i++) {
			
			System.out.print("│" + meses[i] + "\t" );
			
			for (int j = 0; j < temperatura[i]; j++) {
				
				System.out.print("* ");
			}
			
			System.out.println(temperatura[i] + " Cº");
		}
		
		sc.close();
	}

}
