package T8nextlevel;

import java.util.Scanner;

public class ejercicio07 {
	
	//comprobar
	
	static int comprobar(int[][] array) {
		
		
		int suma = 0, maquina = 0  ;
		
		//comprobar la suma de las filas
		
		for(int x = 0 ; x < array.length ; x++){
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				if(array[x][y] == 1) {
					suma ++ ;
				}
				else if(array[x][y] == 2) {
					maquina ++ ;
					maquina ++ ;
				}
					
			}
			
			if(suma == 3) {
			
				return 1 ;
				
			}
			else if(maquina == 6) {
				
				return 2 ;
				
			}
			suma = 0 ;
			maquina = 0 ;
		}
		
		 suma = 0 ;
		 maquina = 0 ;
		
		//comprobar columnas
		
		for(int x = 0 ; x < array.length ; x++){
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				if(array[y][x] == 1) {
					suma ++ ;
				}
				else if(array[y][x] == 2) {
					maquina ++ ;
					maquina ++ ;
				}
				
			}
			
			if(suma == 3) {
			
				return 1 ;
				
			}
			else if(maquina == 6) {
				
				return 2 ;
				
			}
			suma = 0 ;
			maquina = 0 ;
		}
		
		 suma = 0 ;
		 maquina = 0 ;
		
		//comprobar diagonal primaria
		
		if(array[0][0] == 1 && array[1][1] == 1 && array[2][2] == 1) {
			
			return 1 ;
		}
		else if(array[0][0] == 2 && array[1][1] == 2 && array[2][2] == 2) {
			
			return 2 ;
		}
		
		
		//comprobar diagonal secundaria
				
				if(array[2][0] == 1 && array[1][1] == 1 && array[0][2] == 1) {
					
					return 1 ;
				}
				else if(array[2][0] == 1 && array[1][1] == 1 && array[0][2] == 1) {
					
					return 2 ;
				}
		
		
		
		return 3 ;
		
	}
	
	
	
	
	
	
	//maquina

	static void maquina(){
		
		Scanner teclado = new Scanner(System.in) ;
		
		int[][] array = new int[3][3] ;
		String[][] interfaz = new String[3][3] ;
		
		int filas , columnas ;
		
		for(int x = 0 ; x < array.length ; x++){
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				array[x][y] = 0 ;
				
			}
		}
		
		for(int x = 0 ; x < interfaz.length ; x++){
			
			for(int y = 0 ; y < interfaz[2].length ; y++) {
				
				interfaz[x][y] = "-" ;
				
			}
		}
		
		do {
			
		
			for(int x = 0 ; x < interfaz.length ; x++){
				
				for(int y = 0 ; y < interfaz[2].length ; y++) {
					
					System.out.print("\t" + interfaz[x][y]);
					
				}
				
				System.out.println("");
			}
			
			do {
				do {
					System.out.print("Introduzca la fila (1-3):");
					filas = teclado.nextInt() ;
					filas-- ;
					
					System.out.print("Introduzca la columna (1-3):");
					columnas = teclado.nextInt() ;
					columnas-- ;
					
					for(int x = 0 ; x < 16 ; x++) {
						System.out.println("");
					}
					
				}while((filas < 0) || (filas > 2) || (columnas < 0) || (columnas > 2) ) ;
				
			}while(array[filas][columnas] != 0) ;
			
			array[filas][columnas] = 1 ;
			interfaz[filas][columnas] = "X" ;
			
			
			if(comprobar(array) == 1) {
				System.out.println("Has ganado");
				
				break ;
			}
				
			
			do {
				
				filas =(int) (Math.random()*3) ;
				
				columnas = (int) (Math.random()*3) ;
				
			}while(array[filas][columnas] != 0) ;
			
			array[filas][columnas] = 2 ;
			interfaz[filas][columnas] = "O" ;
			
			if(comprobar(array) == 2) {
				System.out.println("Has perdido");
				
				break ;
			}
		
		}while(comprobar(array) == 3) ;
			
		teclado.close();
	}
	
	
	
	//persona
	
	
	static void persona(){
		
		Scanner teclado = new Scanner(System.in) ;
		
		int[][] array = new int[3][3] ;
		String[][] interfaz = new String[3][3] ;
		
		int filas , columnas, filas2, columnas2 ;
		
		for(int x = 0 ; x < array.length ; x++){
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
				array[x][y] = 0 ;
				
			}
		}
		
		for(int x = 0 ; x < interfaz.length ; x++){
			
			for(int y = 0 ; y < interfaz[2].length ; y++) {
				
				interfaz[x][y] = "-" ;
				
			}
		}
		
		do {
			
		
			for(int x = 0 ; x < interfaz.length ; x++){
				
				for(int y = 0 ; y < interfaz[2].length ; y++) {
					
					System.out.print("\t" + interfaz[x][y]);
					
				}
				
				System.out.println("");
			}
			
			do {
				do {
					System.out.print("(J1)Introduzca la fila(X) (1-3):");
					filas = teclado.nextInt() ;
					filas-- ;
					
					System.out.print("(J1)Introduzca la columna(X) (1-3):");
					columnas = teclado.nextInt() ;
					columnas-- ;
					
					for(int x = 0 ; x < 16 ; x++) {
						System.out.println("");
					}
					
				}while((filas < 0) || (filas > 2) || (columnas < 0) || (columnas > 2) ) ;
				
			}while(array[filas][columnas] != 0) ;
			
			array[filas][columnas] = 1 ;
			interfaz[filas][columnas] = "X" ;
			
			
			if(comprobar(array) == 1) {
				System.out.println("Ha ganado el (J1)");
				
				break ;
				
			}	
				
			for(int x = 0 ; x < interfaz.length ; x++){
					
				for(int y = 0 ; y < interfaz[2].length ; y++) {
						
					System.out.print("\t" + interfaz[x][y]);
						
				}
					
				System.out.println("");
			}
				
			
			do {
				do {
					System.out.print("(J2)Introduzca la fila (1-3):");
					filas2 = teclado.nextInt() ;
					filas2-- ;
					
					System.out.print("(J2)Introduzca la columna (1-3):");
					columnas2 = teclado.nextInt() ;
					columnas2-- ;
					
					for(int x = 0 ; x < 16 ; x++) {
						System.out.println("");
					}
					
				}while((filas2 < 0) || (filas2 > 2) || (columnas2 < 0) || (columnas2 > 2) ) ;
				
			}while(array[filas2][columnas2] != 0) ;
			
			array[filas2][columnas2] = 2 ;
			interfaz[filas2][columnas2] = "O" ;
			
			if(comprobar(array) == 2) {
				System.out.println("Ha ganado el (J2)");
				
				break ;
			}
		
		}while(comprobar(array) == 3) ;
		
			
		teclado.close();
	}
	
	
	
	//Main
	
	
	
	public static void main(String[] args) throws InterruptedException {

		Scanner teclado = new Scanner(System.in) ;
		
		int menu ;
		
		System.out.println("________________________________");
		System.out.println("|Bienvenido a este tres en raya|");
		System.out.println("--------------------------------");
		
		Thread.sleep(3000);
		for(int x = 0 ; x < 16 ; x++) {
			System.out.println("");
		}
		
		do {
			do {
				
				System.out.println("Por favor elija su modo de juego: ");
				System.out.println("1:Jugar contra la máquina") ;
				System.out.println("2:Jugar contra un oponente") ;
				System.out.println("3:Salir") ;
				System.out.print("Modo de juego:");
				menu = teclado.nextInt() ;
				
				for(int x = 0 ; x < 16 ; x++) {
					System.out.println("");
				}
				
			}while(menu != 1 && menu != 2 && menu !=3) ;
			
			switch (menu) {
				case 1:
					maquina() ;
					
					break;
					
				case 2:
					
					persona() ;
					
					break;
				}
			
		}while(menu != 3) ;
		
		teclado.close();
	}

}