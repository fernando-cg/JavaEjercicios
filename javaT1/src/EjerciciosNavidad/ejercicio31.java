package EjerciciosNavidad;

public class ejercicio31 {

	public static void main(String[] args) {

		for(int x = 1 ; x < 100 ; x++){
			
			int cont = 0 ;
			
			
			for(int y = 1 ; y <= x ; y++) {
				
				if(x % y == 0) {
					
					cont++;
				}
			}
			
			
			if(cont == 2) {
				
				System.out.println(x);
			}
		}
	}

}
