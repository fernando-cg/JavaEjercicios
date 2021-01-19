package EjerciciosNavidad;

public class aleatorio {

	public static void main(String[] args) {
		System.out.println("10 Números aleatorios entre 1 y 100 ");
		
		for(int i = 0 ; i < 10 ; i++) {
			
			System.out.println( (int) (Math.random()*100));
			
		}

	}

}
