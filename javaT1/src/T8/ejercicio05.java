package T8;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int[] array = new int[100] ;
		
		int num1 , num2 ;
		
		for(int x = 0 ; x < array.length ; x++) {
		
			array[x] = (int) (Math.random()*21) ;
			
			System.out.print(array[x] + "\t");
		}
		
		System.out.println("");
		
		System.out.print("Introduzca un numero que este en la lista: ");
		
		num1 = sc.nextInt() ;
		
		System.out.print("Introduzca el numero por el que lo quieres cambiar: ");
		
		num2 = sc.nextInt() ;	
		
		for(int x = 0 ; x < array.length ; x++) {
			
			if(num1==array[x]) {
				
				array[x] = num2 ;
				System.out.print("|" + array[x] + "|" + "\t");
				
			}else {
			
				System.out.print(array[x] + "\t");
				
			}
			
		}
		
		
		sc.close();
	}

}
