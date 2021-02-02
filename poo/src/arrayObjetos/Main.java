package arrayObjetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//creamos el array de objetos 
		
		Alumno a[] = new Alumno[4];
		
		Scanner sc = new Scanner(System.in) ;

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
