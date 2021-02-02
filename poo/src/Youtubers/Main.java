package Youtubers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("¿Cuantos youtubers quieres introducir?");
		
		int numero = sc.nextInt() ;
		
		Youtuber y[] = new Youtuber[numero] ;
		
		sc.nextLine() ;
		
		String alias , paisorigen;
		
		int nseg, nvid, anio ;
		
		for(int i = 0 ; i < y.length ; i++) {
			
			System.out.print("Introduzca el alias del youtuber " + (i+1) + ": ");
			
			alias = sc.nextLine() ;
			
			System.out.print("Pais de origen de " +  alias + ": ");
			
			paisorigen = sc.nextLine() ;
			
			System.out.print("Introduzca la cantidad de seguidores de " +  alias + ": ");
			
			nseg = sc.nextInt() ;
			
			System.out.print("Introduzca la cantidad de videos seguidos de " +  alias + ":");
			
			nvid = sc.nextInt() ;
			
			System.out.print("Introduzca el año de creacion del canal de " +  alias + ": ");
			
			anio = sc.nextInt() ;
			
			sc.nextLine() ;
			
			y[i] = new Youtuber(alias,nseg,nvid,paisorigen,anio) ;
			
		}
		
		y[0].ordenar(y);
		
		y[0].ordenar2(y);

		
		sc.close();

	}

}
