package T8;

import java.util.ArrayList;

public class ejercicio07 {

	public static void main(String[] args) {
		
		int[] array = new int[20] ;
		
		ArrayList<Integer> par = new ArrayList<Integer>();
		
		ArrayList<Integer> impar = new ArrayList<Integer>();
		
		for(int x = 0 ; x < array.length ; x++){
			
			array[x] = (int) (Math.random() * 101) ;
		}
		
		for(int x = 0 ; x < array.length ; x++) {
			
			if(array[x] % 2 == 0) {
				
				par.add(array[x]) ;
			}
			else {
				
				impar.add(array[x]) ;
			}
		}
		
		for(int x = 0 ; x < array.length ; x++){
														
			System.out.print(array[x] + ",");
		}
													
		for(int x = 0 ; x < par.size(); x++) {
			
			array[x] = par.get(x) ;
			
		}
		
		System.out.println();
		
		for(int x = par.size() ; x < array.length; x++) {
			
			array[x] = impar.get(x - par.size()) ;
			
		}
		
		for(int x = 0 ; x < array.length ; x++ ) {
			
			System.out.print(array[x] + ",");
		}
		
	}

}
