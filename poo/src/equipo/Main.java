package equipo;

public class Main {

	public static void main(String[] args) {

		Jugador j1 = new Jugador("Betis","Delantero",190,69,"Ruben Castro",14);
		Jugador j2 = new Jugador("Real Madrid","Defensa",190,89,"Sergio Ramos",88);
		Jugador j3 = new Jugador("Celta","centrocampista",200,79,"Aspas",6);
		Jugador j4 = new Jugador("Betis","Delantero",150,99,"Borja Iglesias",98);
		
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		System.out.println(j4.toString());
	}

}
