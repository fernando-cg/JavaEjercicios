package prueba01;

public class principal {

	public static void main(String[] args) {
		
		//llamo al constructor
		
		Coche ferrari = new Coche() ;
		
		// creo la instancia ferrari
		

		
		//utilizo los metodos
		
		System.out.println(ferrari.arrancar());
		
		//setter
		
		ferrari.setColor("rojo");
		ferrari.setMarca("ferrari");
		ferrari.setModelo("F3");
		ferrari.setPuerta(2);
		ferrari.setVelocidad(400);
		
		//guetter


		System.out.println(ferrari.getColor());
		System.out.println(ferrari.getMarca());
		System.out.println(ferrari.getModelo());
		System.out.println(ferrari.getPuertas());
		System.out.println(ferrari.getVelocidad());
		
		System.out.println(ferrari.imprimir());
	}

}
