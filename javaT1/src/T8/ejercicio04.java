package T8;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int[] array = new int[5] ;
		
		int[] array2 = new int[5] ;
		
		for(int x = 0 ; x < array.length ; x++) {
			
			System.out.print("Introduce el elemento " + (x+1)+": ");
			
			array[x] = sc.nextInt() ;
		}
		
		
		for(int x = array2.length - 1 ; x >= 0 ; x--) {
			
			array2[x] = array[array.length - (x+1)] ; 
		}
		
		System.out.println("");
		
		for(int x = 0 ; x < array.length ; x++) {
			
			System.out.print(array2[x] + "\t");
		}
		
		sc.close();
	}

}
