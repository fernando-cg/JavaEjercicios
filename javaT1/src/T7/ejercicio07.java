package T7;

public class ejercicio07 {

	public static void main(String[] args) {

		String[] array = new String[] {"*", "-", "=", ".", "|", "@"} ;
		
		for(int x = 0 ; x < 10 ; x++) {
			
			int lineas = (int) (Math.random()* (40-1) +1) ;
			 
			int aleatorio = (int) (Math.random()*6) ;
			
			for(int y = 0 ; y < lineas ; y ++) {
				
				System.out.print(array[aleatorio] + " ");
			}
			
			System.out.println("");
		}
		
	}

}
