
package T8nextlevel;

import java.util.Scanner;

public class ejercicio07 {
	
	//comprobar
	
	static int comprobar(int[][] array) {
		
		int suma = 0 ;
		
		//comprobar la suma de las filas
		
		for(int x = 0 ; x < array.length ; x++){
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				suma = suma + array[x][y] ;
				
			}
			
			if(suma == 3) {
			
				return 1 ;
				
			}
			else if(suma == 6) {
				
				return 2 ;
				
			}
			suma = 0 ;
		}
		
		//comprobar columnas
		
		for(int x = 0 ; x < array.length ; x++){
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				suma = suma + array[y][x] ;
				
			}
			
			if(suma == 3) {
			
				return 1 ;
				
			}
			else if(suma == 6) {
				
				return 2 ;
				
			}
			suma = 0 ;
		}
		
		//comprobar diagonal primaria
		
		if(array[0][0] + array[1][1] + array[2][2] == 3) {
			
			return 1 ;
		}
		else if(array[0][0] + array[1][1] + array[2][2] == 6) {
			
			return 2 ;
		}
		
		//comprobar diagonal secundaria
				
				if(array[2][0] + array[1][1] + array[0][2] == 3) {
					
					return 1 ;
				}
				else if(array[2][0] + array[1][1] + array[0][2] == 6) {
					
					return 2 ;
				}
		
		
		
		return 3 ;
		
	}
	
	
	
	
	
	
	//maquina

	static void maquina(){
		
		Scanner teclado = new Scanner(System.in) ;
		
		int[][] array = new int[3][3] ;
		
		int filas , columnas ;
		
		for(int x = 0 ; x < array.length ; x++){
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				array[x][y] = 0 ;
				
			}
		}
		
		do {
			
		
			for(int x = 0 ; x < array.length ; x++){
				
				for(int y = 0 ; y < array[2].length ; y++) {
					
					System.out.print("\t" + array[x][y]);
					
				}
				
				System.out.println("");
			}
			
			do {
				
				System.out.print("Introduzca la fila (1-3):");
				filas = teclado.nextInt() ;
				filas-- ;
				
				System.out.print("Introduzca la columna (1-3):");
				columnas = teclado.nextInt() ;
				columnas-- ;
				
			}while(array[filas][columnas] != 0) ;
			
			array[filas][columnas] = 1 ;
			
			if(comprobar(array) == 1) {
				System.out.println("Has ganado");
				
				break ;
			}
				
			
			do {
				
				filas =(int) (Math.random()*3) ;
				
				columnas = (int) (Math.random()*3) ;
				
			}while(array[filas][columnas] != 0) ;
			
			array[filas][columnas] = 2 ;
			
			if(comprobar(array) == 2) {
				System.out.println("Has perdido");
				
				break ;
			}
		
		}while(comprobar(array) == 3) ;
			
		teclado.close();
	}
	
	
	
	//Main
	
	
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int menu ;
		
		System.out.println("________________________________");
		System.out.println("|Bienvenido a este tres en raya|");
		System.out.println("--------------------------------");
		
		do {
			
			System.out.println("Por favor elija su modo de juego: ");
			System.out.println("1:jugar contra la máquina") ;
			System.out.println("2:jugar contra un oponente") ;
			System.out.print("Modo de juego:");
			menu = teclado.nextInt() ;
			
		}while(menu != 1 && menu != 2) ;
		
		switch (menu) {
		case 1:
			maquina() ;
			
			break;
			
		case 2:
			
			break;
		}

		teclado.close();
	}

}
