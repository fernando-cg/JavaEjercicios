package T8nextlevel;

import java.util.Scanner;

/**
 * @fernando-cg
 *Realizar un programa que declare una matriz de 3x3. La matriz se debe inicializar a 0 (simula el agua). 
 *Aleatoriamente, se introduce un 1 (simula el barco) dentro de la tabla. 
 *A continuación, el alumno debe introducir la posición en la que piensa que puede estar el barco. 
 *El programa no finaliza hasta que no acierte la posición del barco.
 * 
 */
public class ejercicio01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;			
		
		int array[][] = new int[3][3] ;
		int y , x ;
		
		for(int i = 0 ; i < array.length ; i++) {
			
			for(int j = 0 ; j < array[2].length ; j++) {
				
				array[i][j] = 0 ;
			}
		}
		
		int p1 = (int) (Math.random() * 3) ;
		
		int p2 = (int) (Math.random() * 3) ;
		
		array[p1][p2] = 1 ;
		
		for(int i = 0 ; i < array.length ; i++) {
			
			for(int j = 0 ; j < array[2].length ; j++) {
				
				System.out.print(array[i][j] + "\t");
			}
			
			System.out.println("");
		}
		
		do {
		
			System.out.print("Introduce la posición (0-2) x->");
		
			x = teclado.nextInt();
		
			System.out.print("Introduce la posición (0-2) Y->");
		
			y = teclado.nextInt() ;
		
			if(x != p1 || y != p2) {
				System.out.println("Has fallado");
			}
		}while(x != p1 || y != p2) ;
		
		System.out.println("Enhorabuena has acertado");
			
		teclado.close();
	}    

}
