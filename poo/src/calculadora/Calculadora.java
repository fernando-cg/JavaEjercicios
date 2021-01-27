package calculadora;

public class Calculadora {
	
	private int num1 ;
	
	private int num2 ;
	
	private char operador ;

	public int operacion(){
	
		int resultado = 0 ;
		
		if(operador == '+') {
			
			resultado = this.num1 + this.num2 ;
		}
		else if(operador == '-') {
			if(this.num1 > this.num2) {
				
				resultado = this.num1 - this.num2 ;	
			}
			else {
				
				resultado = this.num2 - this.num1 ;	
			}
			
		}
		else if(operador == '/') {
			
			if(this.num1 > this.num2) {
			
				resultado = this.num1 / this.num2 ;
			}
			else {
				
				resultado = this.num2 / this.num1 ;
			}
		}
		else if(operador == '*') {
		
			resultado = this.num1 * this.num2 ;
		}
		
		return resultado ;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public char getOperador() {
		return operador;
	}

	public void setOperador(char operador) {
		this.operador = operador;
	} 
	
}
