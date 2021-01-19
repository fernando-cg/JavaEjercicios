package T7;

public class ejercicio01 {

	public static void main(String[] args) {

		int array[], suma = 0 ;
		
		array = new int[3] ;
		
		for(int x = 0 ; x < 3 ; x++) {
			
			array[x] = (int) (Math.random()*100) ;
			
			System.out.print(array[x] + ",");
		}
		
		for(int x = 0 ; x < 3 ; x++) {
			
			suma = suma + array[x];
		}
		System.out.println("Suma = " + suma);
	}

}
