package IMC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el numero de personas: ");
		
		int npersonas = sc.nextInt() ;
		
		Persona p[] = new Persona[npersonas] ;
		
		sc.nextLine() ;

		
		String nombre ;
		int edad ;
		char sexo ;
		double peso, altura ;
		
		//personas
		
		for(int i = 0 ; i < p.length ; i++) {
		
			System.out.print("Introduzca su nombre: ");
			
			nombre = sc.nextLine() ;
			
			System.out.print("Introduzca su sexo (M/H): ");
			
			sexo = sc.nextLine().charAt(0) ;
			
			
			System.out.print("Introduzca su edad: ");
			
			edad = sc.nextInt() ;
			
			System.out.print("Introduzca su peso: ");
			
			peso = sc.nextDouble() ;
			
			System.out.print("Introduzca su altura: ");
			
			altura = sc.nextDouble() ;
			
			p[i] = new Persona(nombre, edad, sexo, peso, altura) ;
		}
		
		//escritura
		
		for(int i = 0 ; i < p.length ; i ++ ) {
		
			
			if(p[i].calcularIMC() == -1) {
				
				System.out.println("Estas en tu peso ideal ");
			}
			else if(p[i].calcularIMC() == 0) {
				
				System.out.println("Estas por debajo del peso ideal");
			}
			else {
				
				System.out.println("Tienes sobrepeso");
			}
			
			if(p[i].esMayorDeEdad() == true) {
				
				System.out.println("Erea mayor de edad");
			}
			else {
				
				System.out.println("Eres menor de edad");
			}
			
			System.out.println(p[i].toString());
		
		}
		
		
		sc.close();
	}
}
