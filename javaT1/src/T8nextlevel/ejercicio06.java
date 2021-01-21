package T8nextlevel;

public class ejercicio06 {
	
	static boolean comprobar(int random, int[][] array) {
		
		for(int x = 0 ; x < array.length ; x++) {
			for(int y = 0 ; y < array[2].length ; y++) {
				
				if(array[x][y] == random){
					
					return true ;
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
	
		int[][] array = new int[6][10] ;
		
		int random ;
		
		for(int x = 0 ; x < array.length ; x++) {
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				random = (int) (Math.random()*1001) ;
				
				while(comprobar(random, array) == true) {
					
					random = (int) (Math.random()*1001) ;
				}
				array[x][y] = random ;
			}
			
		}
		
		for(int x = 0 ; x < array.length ; x++) {
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				System.out.print("\t" + array[x][y]);
			}
			System.out.println("");
		}
		
		int mayor = array[0][0] , menor = array[0][0], mx = 0 , my = 0, mmx = 0 , mmy = 0 ;
		
		for(int x = 0 ; x < array.length ; x++) {
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				if(array[x][y] < menor) {
					
					menor = array[x][y] ;
				}
				
				if(array[x][y] > mayor) {
					
					mayor = array[x][y] ;
				}
			}
		}
		
		for(int x = 0 ; x < array.length ; x++) {
			
			if(array[x][my] == mayor) {
				break ;
			}
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				if(array[x][y] == mayor) {
					
					mx = x ;
					my = y ;
						
					break ;
				}
			}
		}
		
		for(int x = 0 ; x < array.length ; x++) {
			
			if(array[x][mmy] == menor) {
				break ;
			}
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				if(array[x][y] == menor) {
					
					mmx = x ;
					mmy = y ;
						
					break ;
				}
			}
		}
		
		System.out.println("El mayor es: " + mayor + ", se encuentra en: " + mx + ":" + my + ", el menor es: " + menor + ", se encuentra en: " + mmx + ":" + mmy );
	}
}