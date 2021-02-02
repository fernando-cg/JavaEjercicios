package Restaurante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in) ;
		
		int huevos ;
		
		double chorizo ;
		
		System.out.print("Cantidad de Huevos en docenas:");
		
		huevos = t.nextInt() ;
		
		System.out.print("Kilogramos de chorizo:");
		
		chorizo = t.hashCode() ;
		
		Restaurante r = new Restaurante(huevos,chorizo) ;
		
		t.close() ;
	}

}
