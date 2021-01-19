package EjerciciosNavidad;

public class ejercicio20 {

	public static void main(String[] args) {

		int sumador = 0 ;
		
		for(int x = 0 ; x <= 100 ; x++) {
			
			sumador = (int) (sumador + Math.pow(x , 2)) ;
		}
		
		System.out.println(sumador);
	}

}
