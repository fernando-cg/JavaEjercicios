package T7;

public class ejercicio06 {

	public static void main(String[] args) {

		int aleatorio, contador = 0 ;
		
		do {
			
			aleatorio = (int) (Math.random()*100) ;
			
			contador ++ ;
			
		}while(aleatorio != 24) ;
		
		System.out.println("He necesitado generar: " + contador + " números");
	}

}
