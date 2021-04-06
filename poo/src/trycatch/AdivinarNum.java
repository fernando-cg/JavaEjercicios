package trycatch;

import javax.swing.JOptionPane;

public class AdivinarNum {

	public static void main(String[] args) {

		int random =(int) (Math.random()*501) ;
		int contador = 0 ;
		int numero = 0 ;
		do {
			try {
				 numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numerito")) ;
				
				if(numero > random) {
					JOptionPane.showMessageDialog(null, "El numero random es mas pequeño");
					contador ++ ;
				}else if(numero == random) {
					JOptionPane.showMessageDialog(null, "Enhorabuena has ganado, has usado " + contador + " intentos" );
				}else {
					JOptionPane.showMessageDialog(null, "El numero random es mas grande");
					contador ++ ;
				}
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Has introducido un elemento no numerico te sumo una oportunidad por tonto");
				contador ++ ;
			}
		}while(numero != random) ;
	}

}
