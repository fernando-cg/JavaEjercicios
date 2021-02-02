package arrayObjetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//creamos el array de objetos 
				
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("¿Cuantos objetos quieres introducir?");
		
		int nobjetos = sc.nextInt() ;
		
		sc.nextLine() ;
		
		Alumno a[] = new Alumno[nobjetos];

		int edad,curso ;
		
		String nombre ;
		
		//instanciamos
		
		for (int i=0; i < a.length; i++) {
			System.out.print("Dame el Nombre del alumno:");    
			   			
			sc.nextLine() ;
			
			System.out.print("Dame la edad:");
			
			edad = sc.nextInt() ;
			
			System.out.print("Dame el curso:");
			
			curso = sc.nextInt() ;
			
			nombre = sc.nextLine() ;
			
			System.out.println("............................");
			
			a[i] = new Alumno (nombre, curso , edad) ;
		}
		for(int i = 0 ; i < a.length ; i++) {
			
			System.out.println(a[i].toString());
			
		}
		
		sc.close();
	}
}
