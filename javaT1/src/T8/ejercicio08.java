package T8;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;

		int[] array = new int[100] ;
		
		String respuesta ;
		
		
		for(int x = 0 ; x < array.length ; x++) {
			
			array[x] = (int) (Math.random() * 500) ;
			
		}
		
		int mayor = array[0] , menor = array[0] ;
		
		for(int x = 0 ; x < array.length ; x++) {
			
			if(mayor < array[x]) {
				mayor = array[x] ;
			}
			
			if(menor > array[x]) {
				
				menor = array[x] ;
			}
		}
		
		do {
			System.out.print("¿Desea que marque el mayor y el menor número? (si/no): ");
		
			respuesta = teclado.nextLine() ;
			
			respuesta =respuesta.toUpperCase() ;
		
		}while(!(respuesta.equals("SI")) && !(respuesta.equals("NO"))) ;
		
		if(respuesta.equals("SI")) {
			
			for(int x = 0 ; x < array.length ; x++) {
				
				if(array[x]==mayor || array[x]==menor) {
					
					System.out.print("***" + array[x] + "***, ");
				}else {
					
					System.out.print(array[x] + ", ");
				
				}
			}
			
		}
		else {
		
			for(int x = 0 ; x < array.length ; x++) {
				
			System.out.print(array[x] + ", ");
				
			}
		}
		
		teclado.close();
	}

}
