package EjerciciosNavidad;

public class ejercicio30 {

	public static void main(String[] args) {

		String cadena = "Como no me ponga las pilas tralará-tralará" ;
		
		int contador = 0 ;
		
		for(int x = 0 ; x < cadena.length() ; x++) {
			if(cadena.charAt(x) == 'a' || cadena.charAt(x) == 'e' || cadena.charAt(x) == 'i' || cadena.charAt(x) == 'o' || cadena.charAt(x) == 'u'){
				
				contador ++ ;
			}
		}
		
		System.out.println("La cadena tiene " + contador + " vocales");
	}

}
