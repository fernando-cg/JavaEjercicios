package T8;

public class ejercicio02 {

	public static void main(String[] args) {

		int[] numero = new int[20] ;
		
		int[] cuadrado = new int[20] ;
		
		int[] cubo = new int[20] ;
		
		for(int x = 0 ; x < numero.length ; x++) {
			
			numero[x] = (int) (Math.random()*100) ;
			
			cuadrado[x] = (int) (Math.pow(numero[x], 2)) ;
			
			cubo[x] = (int) (Math.pow(numero[x], 3)) ;
		}	
		
		for(int x = 0 ; x < numero.length ; x++) {
			System.out.print(numero[x] + "\t");
		}
		
		System.out.println();
		System.out.println();
		
		for(int x = 0 ; x < numero.length ; x++) {
			System.out.print(cuadrado[x] + "\t");
		}
		
		System.out.println();
		System.out.println();
		
		for(int x = 0 ; x < numero.length ; x++) {
			System.out.print(cubo[x] + "\t");
		}
	}
	

}
