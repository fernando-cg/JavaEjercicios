package trycatch;

public class ParImpar {

	public static void main(String[] args) {
		
		int random =(int) (Math.random()*100) ;
		
		System.out.println(random);
		
		try {
			if(random%2 == 0) {
				throw new Exception("Par " + random) ;
			}
			else {
				throw new Exception("Impar " + random) ;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
