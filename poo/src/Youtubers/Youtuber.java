package Youtubers;

public class Youtuber {

	
	//atributos
	
	private String alias ;
	
	private int nseguidores ;
	
	private int nvideos ;
	
	private String paisnatal ;
	
	private int aniodecreacion ;

	//constructor
	
	public Youtuber(String alias,int nseguidores, int nvideos, String paisnatal, int aniodecreacion) {
		this.alias = alias ;
		this.nseguidores = nseguidores;
		this.nvideos = nvideos;
		this.paisnatal = paisnatal;
		this.aniodecreacion = aniodecreacion;
	}
	

		
	//metodos
	
	
	@Override
	public String toString() {
		return "Youtuber [alias=" + alias + ", nseguidores=" + nseguidores + ", nvideos=" + nvideos + ", paisnatal="
				+ paisnatal + ", aniodecreacion=" + aniodecreacion + "]";
	}



	public int getNseguidores() {
		return nseguidores;
	}



	public int getAniodecreacion() {
		return aniodecreacion;
	}
	
	//ordenar array de objetos por seguidores
	
	public void ordenar(Youtuber y[]) {
		
		for(int x = 0 ; x < y.length ; x++) {
			
	        for (int i = 0; i < (y.length-x-1); i++) {
	        	if(y[i].getNseguidores() < y[i+1].getNseguidores()) {
	        		
	        		Youtuber t = y[i+1] ;
	        		
	        		y[i+1] = y[i] ;
	        		
	        		y[i] = t ;
	        	}
	        }
		}
		
		for(int x = 0 ; x < y.length ;x++) {
			
			System.out.println(y[x].toString());
		}
	}
	
	public void ordenar2(Youtuber y[]) {
		
		for(int x = 0 ; x < y.length ; x++) {
			
	        for (int i = 0; i < (y.length-x-1); i++) {
	        	if(y[i].getAniodecreacion() < y[i+1].getAniodecreacion()) {
	        		
	        		Youtuber t = y[i+1] ;
	        		
	        		y[i+1] = y[i] ;
	        		
	        		y[i] = t ;
	        	}
	        }
		}
		
		for(int x = 0 ; x < y.length ;x++) {
			
			System.out.println(y[x].toString());
		}
	}
	
	
	
	
	
	
}
