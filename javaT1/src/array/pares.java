package array;

public class pares {

	public static void main(String[] args) {

		int[] pares = new int[50] ;
		
		int par = 100 ;
		
		for(int x = 0 ; x < 50 ; x++) {
			
			pares[x] = par ;
			
			par = par + 2 ;
		}

	}
}