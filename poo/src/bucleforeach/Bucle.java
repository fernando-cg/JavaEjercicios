package bucleforeach;

public class Bucle {

	public static void main(String[] args) {
		
		int pepe[] = {1,2,3,4,6,5,7,8,9} ;
		int suma = 0 ;
		for(int x:pepe) {
			suma +=pepe[x] ;
			// suma + pepe[x] = suma 
		}

	}

}
