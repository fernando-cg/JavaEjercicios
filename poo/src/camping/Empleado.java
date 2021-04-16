package camping;

public class Empleado extends Persona{

	private int id ;
	
	private static int idnext = 50 ;
	
	private String usuario ;
	
	private String password ;

	public Empleado(String nombre, int edad, String usuario, String password) {
		super(nombre, edad);
		aes cif = new aes() ;
		this.usuario = cif.encrypt(usuario,"programacion");
		this.password = cif.encrypt(password,"programacion");
		
		id = idnext ;
		
		idnext ++ ;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getPassword() {
		return password;
	}
	
	
}
