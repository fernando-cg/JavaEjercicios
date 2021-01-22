package T8nextlevel;

import java.util.ArrayList;

public class ejercicio03 {

	public static void main(String[] args) {
		
		int[][] r = new int[4][4] ;
		
		int[][] s = new int[4][4] ;
		
		ArrayList<Integer> repetidos = new ArrayList<Integer>();
		
		
		for(int x = 0 ; x < r.length ; x++) {
			
			for(int y = 0 ; y < r[2].length ; y++) {
				
				r[x][y] =(int) (Math.random()*50) ;
			}
		}
		
		for(int x = 0 ; x < r.length ; x++) {
			
			for(int y = 0 ; y < r[2].length ; y++) {
				
				s[x][y] =(int) (Math.random()*50) ;
			}
		}
		
		for(int x = 0 ; x < r.length ; x++) {
			
			for(int y = 0 ; y < r[2].length ; y++) {
				
				System.out.print("\t" + r[x][y]);
			}
			System.out.print("\t" );
			
			for(int y = 0 ; y < s[2].length ; y++) {
				
				System.out.print("\t" + s[x][y]);
			}
			
			System.out.println("");
		}
		
		for(int x = 0 ; x < r.length ; x++) {
			
			for(int y = 0 ; y < r[2].length ; y++) {
				
				
				for(int z = 0 ; z < r.length ; z++) {
					
					for(int c = 0 ; c < r[2].length ; c++) {
					
						if(r[x][y]== s[z][c]) {
							repetidos.add(s[z][c]);
						}
					}
					
				}
			}
			
		}
		
		System.out.println("");
		System.out.print("Los que se repiten son :");
		
	    for (int i=0;i<repetidos.size();i++) {
	        
	        System.out.print(repetidos.get(i) + ", ");
	      }
		
	}

}
