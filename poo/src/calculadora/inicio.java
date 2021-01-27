package calculadora;

import java.util.Scanner;

public class inicio {
	
	static int parseo(String sub){
		
		int numero = 0 ;
		
		for(int x = 0 ; x < sub.length() ; x++ ) {
			
			if(sub.charAt(x) == '1') {
				
				numero = numero + 1 * ((int) (Math.pow(10, (sub.length() - (x+1))))) ; 
			}
			else if(sub.charAt(x) == '2') {
				
				numero = numero + 2 * ((int) (Math.pow(10, (sub.length() - (x+1))))) ; 
			}
			else if(sub.charAt(x) == '3') {
				
				numero = numero + 3 * ((int) (Math.pow(10, (sub.length() - (x+1))))) ; 
			}
			else if(sub.charAt(x) == '4') {
				
				numero = numero + 4 * ((int) (Math.pow(10, (sub.length() - (x+1))))) ; 
			}
			else if(sub.charAt(x) == '5') {
				
				numero = numero + 5 * ((int) (Math.pow(10, (sub.length() - (x+1))))) ; 
			}
			else if(sub.charAt(x) == '6') {
				
				numero = numero + 6 * ((int) (Math.pow(10, (sub.length() - (x+1))))) ; 
			}
			else if(sub.charAt(x) == '7') {
				
				numero = numero + 7 * ((int) (Math.pow(10, (sub.length() - (x+1))))) ; 
			}
			else if(sub.charAt(x) == '8') {
				
				numero = numero + 8 * ((int) (Math.pow(10, (sub.length() - (x+1))))) ; 
			}
			else if(sub.charAt(x) == '9') {
				
				numero = numero + 9 * ((int) (Math.pow(10, (sub.length() - (x+1))))) ; 
			}
		}
		
		return numero  ;
	}
		
	

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		Calculadora cl = new Calculadora() ;

		String expresion ;
		
		String sub1 ;
		
		String sub2 ;
		
		int posicion = 0 ;
		
		System.out.print("Introduzca una expresion matemática sin espacios(+,-,*,/):");
	
		expresion = teclado.nextLine() ;
		
		for(int x = 0 ; x < expresion.length() ; x++) {
			
			if(expresion.charAt(x) == '*' || expresion.charAt(x) == '+' || expresion.charAt(x) == '-' || expresion.charAt(x) == '/') {
				
				posicion = x ;
				
				break ;
			}
		}
		
		sub1 = expresion.substring(0,posicion) ;
		
		sub2 = expresion.substring(posicion+1,expresion.length()) ;
		
		cl.setNum1(parseo(sub1));
		cl.setNum2(parseo(sub2));
		cl.setOperador(expresion.charAt(posicion));
		
		System.out.println("Resultado: " + cl.operacion());
		
		teclado.close();
	}

}
