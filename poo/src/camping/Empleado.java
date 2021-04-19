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

	@Override
	public String toString() {
		return  getNombre() + "\t" + getDni() + "\t" + getEdad() + "\t" + id + "\t" + usuario + "\t" + password + "\n" ;
	}

	public Empleado(String nombre, String dni, int edad, int id, String usuario, String password) {
		super(nombre, dni, edad);
		this.id = id;
		idnext = id ;
		this.usuario = usuario;
		this.password = password;
		idnext ++ ;
	}
	
	
	
}
