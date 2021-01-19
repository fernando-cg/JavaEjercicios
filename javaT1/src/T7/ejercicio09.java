package T7;

import java.util.Scanner;

public class ejercicio09 {
	
	public static int juego(int monedas){
		
		String[] array = new String[] {"Limon", "Corazón", "Diamante", "Herradura", "Campana"} ;
		
		int random[] ;
		
		random = new int[3] ;
		
		
		for(int x = 0 ; x < 3 ; x++) {
			
			random[x] = (int) (Math.random()*5) ;
			
			System.out.print(array[random[x]] + ", ");
			
		}
		
		monedas -- ;
		
		if(random[0] == random[1] && random[1] == random[2]) {
			
			System.out.println("Enhorabuena, ha ganado 10 monedas");
			
			monedas = monedas + 10 ;
		}
		else if(random[0] == random[1] || random[0] == random[2] || random[1] == random[2]){
			
			System.out.println("Has recuperado tu moneda");
			
			monedas ++ ;
		}
		else if(random[0] != random[1] && random[0] != random[2] && random[1] != random[2]) {
			
			System.out.println("Has perdido la moneda");
		}
		
		return monedas ;
	}

	public static void main(String[] args) throws InterruptedException{

		Scanner teclado = new Scanner(System.in) ;
		
		int menu = 0, monedas = 5 ;
		
		System.out.println("Bienvenido a esta maquina tragaperra");
		while(monedas > 0 && menu != 3) {
			
			do {
					if(menu != 3) {
					System.out.println("1: Jugar");
					System.out.println("2: Mostrar premios");
					System.out.println("3: Salir");
					menu = teclado.nextInt() ;
				}
			}while(menu < 1 || menu > 3) ;
		
			switch (menu) {
			case 1:
			
				monedas = juego(monedas) ;
				
				System.out.println("Te quedan " + monedas + " Monedas");
				
				Thread.sleep(3000);
				
			
				break;
				
			case 2:
				System.out.println("3 iguales = 10 monedas");
				
				System.out.println("2 iguales = recuperar moneda introducida");
				
				System.out.println("Ninguna igual: pierdes la moneda");
				
				Thread.sleep(5000);
				
				break;
				
			}
			
			System.out.println("Programa finalizado, te has quedado sin monedas");
		}
		
		teclado.close();
	}

}
