package T7;

public class ejercicio02 {

	public static void main(String[] args) {

		int array[], max , min, media = 0 ;
		
		array = new int[50] ;
		
		for(int x = 0 ; x < 50 ; x++) {
			
			array[x] = (int) (Math.random()*(199-100 + 1) + 100) ;
			
			System.out.print(array[x] + " ");
		}
		
		max = array[0] ;
		
		min = array[0] ;
		
		for(int x = 0 ; x < 50 ; x++) {
			
			media = array[x] + media ;
			
			if(max < array[x]) {
				
				max = array[x] ;
				
			}
			
			if(min > array[x]) {
				
				min = array[x] ;
			}
		}
		
		media = media / 50 ;
		
		System.out.println();
		
		System.out.println("Máximo: " + max);
		
		System.out.println("Mínimo: " + min);
		
		System.out.println("Media: " + media);
		
		
	}

}
