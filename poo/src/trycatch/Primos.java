package trycatch;

import java.util.ArrayList;

public class Primos {

	public static void main(String[] args) {
		
		ArrayList<Integer> primos =new ArrayList<Integer>() ;
		int contador2 = 0 ;
		for(int x = 1 ; x < 100 ; x++) {
			int contador = 0 ;
			for(int y = 1 ; y <= x ; y++)
				if(x%y == 0) {
					contador ++ ;
				}
			if(contador == 2) {
				primos.add(x) ;
			}
		}
		System.out.println("Hay " + primos.size() + " numeros primos:");
		for(int x:primos ) {
			
			System.out.print(x + " ");
		}
	}

}
