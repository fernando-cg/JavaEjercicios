package T7;

public class ejercicio08 {

	public static void main(String[] args) {

		int random1, random2, contador = 0 ;
				
		do {
			
			random1 =(int) (Math.random()*6 + 1) ;
			
			random2 = (int) (Math.random()*6 + 1) ;
			
			contador ++ ;
			
		}while(random1 == random2) ;
		
		System.out.println("He necesitado " + contador + " tiradas para que los dados coincidan en el numero " + random1);
		
	}

}
