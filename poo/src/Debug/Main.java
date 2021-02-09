package Debug;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int suma = 0 ;
		int nums[]={1,2,3,4,5};
		
		for(int i = 0 ; i < 10 ;i++) {
			
			//System.out.println(i);
			
			suma = suma + 1 ;
		}
		
		//Syso con interfaz
		
		String nombre = JOptionPane.showInputDialog("Hola introduzceme in nombre") ;
	
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Hola dame tu edad")) ;
		
		JOptionPane.showMessageDialog(null, "Te llamas " + nombre + " Nacistes en " + (2021 - edad), "Titulito",0,null);
		
		//bucle for ecah
		
		for (int  sum: nums)
			
			JOptionPane.showInputDialog(null, sum , "caca" , 1 , null, args, sum) ; 
		


	}
}
