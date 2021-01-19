package T4;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		int horas,salario,resto ;
		
		System.out.print("Digame cuantas horas ha trabajado este mes -> ");
		
		horas = teclado.nextInt() ;
		
		if(horas <=40) {
			
			salario = horas * 12 ;
			
		}else {
		
			resto = horas - 40 ;
			
			
			salario = resto * 16 + 40 * 12 ;
			
			
		}
		
		System.out.println("Debe de cobrar " + salario + "€");
		
		
		teclado.close();
		

	}

}
