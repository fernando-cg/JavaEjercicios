package camping;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import escritura.Alumno;
import gregoriancalendar.calendartodec;

public class Main {
	//me ha faltado que funcione el boton de cancelar, y que se actualize el mapa de ocupacion a la hora de crear un cliente tb me ha faltado poner un if en clientes para comprobar si hay empleados creados
	
	private static ArrayList<Empleado> empleados = new ArrayList<Empleado>() ;
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>() ;
	
	private static int[] caravanas = {0,0,0,0,0,0,0,0}  ;
	
	private static int[] autocaravanas = {0,0,0,0,0,0,0} ;
	
	private static int[] tiendas = {0,0,0,0,0} ;
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private static void eliminarFila(int fila,String archivo) {
		
		ArrayList<String> array = new ArrayList<String>() ;
		String linea = null;
		
	    BufferedReader leerFichero;
	    
	    try {
	    	
	    	leerFichero = new BufferedReader (new FileReader(archivo));
			while( (linea = leerFichero.readLine()) != null)
			{
				
				array.add(linea) ;
			   
			   
			   }
			
			array.remove(fila) ;
			BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,true), "utf-8"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
			bw.write("");
			for(int x = 0 ; x < array.size() ; x++) {
				escribir.write(array.get(x)) ;
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void lecturaemple(){
		
		String linea = null;
		
        BufferedReader leerFichero;
        
       try {
    	leerFichero = new BufferedReader (new FileReader("empleados.txt"));
    	
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     nombre =  token.nextToken().trim() ;
		   String  dni =  token.nextToken().trim();
		   String       edad =  token.nextToken().trim();
		   String     id =  token.nextToken().trim();
		   String     usuario =  token.nextToken().trim();
		   String     password =  token.nextToken().trim();
		   
		   int    edad2=Integer.parseInt(edad);
		   int    id2=Integer.parseInt(id);
		   
		   empleados.add(new Empleado(nombre ,dni,edad2, id2,usuario,password)) ;
		   
		   }
		
		} catch (NumberFormatException | IOException e) {
			
			System.out.println("Ha habido un error");
		}
		
	}

	public static void escribir(String cadena,String directorio) {
		
		FileReader f = null ;
		
		try {
			
			f = new FileReader(directorio);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		try {
			
			BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directorio,true), "utf-8"));
		
			escribir.write(cadena);
			
			escribir.close();
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Error");
		}
			
	    
		
	}
	
	public static void lecturat() {
		String linea = null;
		
        BufferedReader leerFichero;
        int x = 0 ;
       try {
    	leerFichero = new BufferedReader (new FileReader("tiendas.txt"));
    	
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     var =  token.nextToken().trim() ;
		   
		   int    var2=Integer.parseInt(var);
		   
		   tiendas[x] = var2 ;
		   x++ ;
		 }
		
		} catch (NumberFormatException | IOException e) {
			
			System.out.println("Ha habido un error");
		}
	}
	public static void lecturaCliente() {
		
		String linea = null;
		
        BufferedReader leerFichero;
        
       try {
    	leerFichero = new BufferedReader (new FileReader("clientes.txt"));
    	
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     nombre =  token.nextToken().trim() ;
		   String  dni =  token.nextToken().trim();
		   String       edad =  token.nextToken().trim();
		   String     id =  token.nextToken().trim();
		   String     socioclub =  token.nextToken().trim();
		   String     acompaniantes =  token.nextToken().trim();
		   String     fechaEntrada =  token.nextToken().trim();
		   String     fechaSalida =  token.nextToken().trim();
		   String     tipoHuesped =  token.nextToken().trim();
		   String     longitudVehiculo =  token.nextToken().trim();
		   String     precio =  token.nextToken().trim();
		   
		   int    edad2=Integer.parseInt(edad);
		   int    id2=Integer.parseInt(id);
		   int    longitudVehiculo2=Integer.parseInt(longitudVehiculo);
		   boolean socioclub2 = Boolean.parseBoolean(socioclub) ;
		   int    acompaniantes2=Integer.parseInt(acompaniantes);
		   Date fechaEntrada2 = new SimpleDateFormat("dd/MM/yyyy").parse(fechaEntrada);
		   Date fechaSalida2 = new SimpleDateFormat("dd/MM/yyyy").parse(fechaSalida);
		   double precio2 = Double.parseDouble(precio) ;
		   
		   clientes.add(new Cliente(nombre ,dni,edad2, id2, socioclub2,acompaniantes2,fechaEntrada2,fechaSalida2,tipoHuesped,longitudVehiculo2,precio2)) ;
		   
		   }
		
		} catch (NumberFormatException | IOException e) {
			
			System.out.println("Ha habido un error");
		} catch (ParseException e) {
			e.printStackTrace();
		}
       
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static Date maximaFechaTienda(ArrayList<Cliente> clientes) {
		
		Date retorno = null ;
		
		for(int x = 0 ; x < clientes.size() ; x++) {
			if(((int)Duration.between(retorno.toInstant(), clientes.get(x).getFechaSalida().toInstant()).toDays())> 0 && clientes.get(x).getTipoHuesped().equalsIgnoreCase("tienda")){
				
				retorno =  clientes.get(x).getFechaSalida() ;
			}
		}
		
		return retorno;
	}
	
	public static Date maximaFechaCaravana(ArrayList<Cliente> clientes) {
		
		Date retorno = null ;
		
		for(int x = 0 ; x < clientes.size() ; x++) {
			if(((int)Duration.between(retorno.toInstant(), clientes.get(x).getFechaSalida().toInstant()).toDays())> 0 && clientes.get(x).getTipoHuesped().equalsIgnoreCase("caravana")){
				
				retorno =  clientes.get(x).getFechaSalida() ;
			}
		}
		
		return retorno;
	}
	
	public static Date maximaFechaAuto(ArrayList<Cliente> clientes) {
		
		Date retorno = null ;
		
		for(int x = 0 ; x < clientes.size() ; x++) {
			if(((int)Duration.between(retorno.toInstant(), clientes.get(x).getFechaSalida().toInstant()).toDays())> 0 && clientes.get(x).getTipoHuesped().equalsIgnoreCase("autocaravana")){
				
				retorno =  clientes.get(x).getFechaSalida() ;
			}
		}
		
		return retorno;
	}
	
	public static void vermapa() {
		
		String[][] mapa = new String[5][4] ;
		
		String salida= "" ;
		
		for(int x = 0 ; x < caravanas.length ; x++) {
			if(caravanas[x] == 0) {
				salida += "C\t" ; 
			}
			else {
				salida += "Co\t" ;
			}
		}
		salida += "\n" ;
		for(int x = 0 ; x < autocaravanas.length ; x++) {
			if(autocaravanas[x] == 0) {
				salida += "A\t" ; 
			}
			else {
				salida += "Ao\t" ;
			}
		}
		salida += "\n" ;
		for(int x = 0 ; x < tiendas.length ; x++) {
			if(tiendas[x] == 0) {
				salida += "T\t" ; 
			}
			else {
				salida += "To\t" ;
			}
		}
		
		JOptionPane.showMessageDialog(null, salida,"La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
	}
	
	public static boolean comp(String usuario, String pass) {
		boolean retorno = false ;
		boolean passw=false ;
		boolean user=false ;
		aes crip = new aes() ;
		for(int x = 0 ;  x < empleados.size() ; x++) {
			if(empleados.get(x).getUsuario().equalsIgnoreCase(aes.encrypt(usuario, "programacion"))) {
				user = true ;
				break ;
			}
		}
		
		for(int x = 0 ;  x < empleados.size() ; x++) {
			if(empleados.get(x).getPassword().equalsIgnoreCase(aes.encrypt(pass, "programacion"))) {
				passw = true ;
				break ;
			}
		}
		
		if(passw ==true && user == true) {
			retorno = true ;
		}
				
				return retorno ;
	}
	
	public static void crearcliente() {
		
		String usuario ;
		String pass ;
		do {
			
			usuario = (String) JOptionPane.showInputDialog(null,"introduzca el usuario","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null);
			
			pass = (String) JOptionPane.showInputDialog(null,"introduzca el pass","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null);
			
			if(comp(usuario,pass) == false) {
				JOptionPane.showMessageDialog(null, "El password o el usuario es incorrecto","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
			}
		}while(comp(usuario,pass) == false) ; 
		
		String nombre = (String) JOptionPane.showInputDialog(null,"introduzca el nombre del cliente","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null);
		boolean temp = false ;
		int edad=0 ;
		do {
			try {
			
				 edad =  Integer.parseInt((String) JOptionPane.showInputDialog(null,"la edad del cliente","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null));
				 temp = false ;
			} catch(NumberFormatException e){
				temp = true ;
				JOptionPane.showMessageDialog(null, "Has introducido un formato de edad incorrecto","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
			}
		}while(temp) ;
		
		String opciones[] = {"Si","No"} ;
		int opcion = JOptionPane.showOptionDialog(null, "�Eres socio del camping?", "La Rana",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("camping.png")), opciones,opciones[0]) ;
		boolean socio ;
		
		if(opcion == 0) {
			socio =true ;
		}
		else {
			socio = false ;
		}
		int acomp = 0 ;
		temp = false ;
		
		do {
			try {
			
				 acomp =  Integer.parseInt((String) JOptionPane.showInputDialog(null,"Introduzca el numero de acompaniantes","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null));
				 temp = false ;
			} catch(NumberFormatException e){
				temp = true ;
				JOptionPane.showMessageDialog(null, "Has introducido un formato de numero incorrecto","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
			}
		}while(temp) ;
		
		String opciones1[] = {"caravana","autocaravana","tienda"} ;
		String tipo = (String) JOptionPane.showInputDialog(null,
	             "seleccione el tipo de camping", "La Rana",
	             JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("camping.png")),
	             opciones1, opciones1[0]);
		
		int longitud = 0 ;
		
		if(!tipo.equalsIgnoreCase("tienda")) {
			
		temp = false ;
			do {
				try {
				
					 longitud =  Integer.parseInt((String) JOptionPane.showInputDialog(null,"la longitud del vehiculo","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null));
					 temp = false ;
				} catch(NumberFormatException e){
					temp = true ;
					JOptionPane.showMessageDialog(null, "Has introducido un formato de longitud incorrecto","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
				}
			}while(temp) ;
		}
		
		Date fsalida = null ;
		Date fentrada = null ;
		
		do {
			
			temp = false ;
			do {
				try {
					
					
					String fent =  (String) JOptionPane.showInputDialog(null,"Introduzca la fecha de entrada dd/mm/AAAA","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null);
					fentrada = new SimpleDateFormat("dd/MM/yyyy").parse(fent);
					temp = false ;
				} catch(ParseException e){
					temp = true ;
					JOptionPane.showMessageDialog(null, "Has introducido un formato de numero incorrecto","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
				}
			}while(temp) ;
			
			temp = false ;
			
			do {
				try {
					
					
					String fent =  (String) JOptionPane.showInputDialog(null,"Introduzca la fecha de salida dd/mm/AAAA","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null);
					fsalida = new SimpleDateFormat("dd/MM/yyyy").parse(fent);
					temp = false ;
				} catch(ParseException e){
					temp = true ;
					JOptionPane.showMessageDialog(null, "Has introducido un formato de numero incorrecto","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
				}
			}while(temp) ;
			
			if(0>=((int) Duration.between(fentrada.toInstant() ,fsalida.toInstant()).toDays())) {
				JOptionPane.showMessageDialog(null, "Porfavor introduzca la fecha de salida mas grande que la de entrada","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
			}
			
		}while(0>=((int) Duration.between(fentrada.toInstant() ,fsalida.toInstant()).toDays())) ;
		
		if(tipo.equalsIgnoreCase("tienda")) {
			boolean comp = false ;
			for(int x = 0 ; x < tiendas.length ; x++) {
				if(tiendas[x]== 0 ) {
					comp = true ;
				}
			}
			if (comp ==true || ((int)Duration.between(maximaFechaTienda(clientes).toInstant(),fentrada.toInstant()).toDays())> 0) {
				JOptionPane.showMessageDialog(null, "La reserva se ha realizado con exito","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
				clientes.add(new Cliente(nombre,edad,socio,acomp,fentrada,fsalida,tipo,longitud)) ;
				escribir(clientes.get(clientes.size()-1).toString(),"clientes.txt") ;
				for(int x = 0 ; x < tiendas.length ; x++) {
					if(tiendas[x]== 0 ) {
						tiendas[x]= clientes.get(clientes.size()-1).getId() ;
						break ;
					}
				}
			}else{
				SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
				JOptionPane.showMessageDialog(null, "El parking esta completo no se ha podido hacer la reserva, pruebe a hacer la reserva a partir de: " + f.format(maximaFechaTienda(clientes)) ,"La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
			}
			
			
		}else if(tipo.equalsIgnoreCase("caravana")) {
			
			boolean comp = false ;
			for(int x = 0 ; x < caravanas.length ; x++) {
				if(caravanas[x]== 0 ) {
					comp = true ;
				}
			}
			if (comp ==true || ((int)Duration.between(maximaFechaCaravana(clientes).toInstant(),fentrada.toInstant()).toDays())> 0) {
				JOptionPane.showMessageDialog(null, "La reserva se ha realizado con exito","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
				clientes.add(new Cliente(nombre,edad,socio,acomp,fentrada,fsalida,tipo,longitud)) ;
				escribir(clientes.get(clientes.size()-1).toString(),"clientes.txt") ;
				for(int x = 0 ; x < caravanas.length ; x++) {
					if(caravanas[x]== 0 ) {
						caravanas[x]= clientes.get(clientes.size()-1).getId() ;
						break ;
					}
				}
			}else{
				SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
				JOptionPane.showMessageDialog(null, "El parking esta completo no se ha podido hacer la reserva, pruebe a hacer la reserva a partir de: " + f.format(maximaFechaCaravana(clientes)) ,"La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
			}
			
		}else if(tipo.equalsIgnoreCase("autocaravana")) {
			boolean comp = false ;
			for(int x = 0 ; x < autocaravanas.length ; x++) {
				if(autocaravanas[x]== 0 ) {
					comp = true ;
				}
			}
			if (comp ==true || ((int)Duration.between(maximaFechaAuto(clientes).toInstant(),fentrada.toInstant()).toDays())> 0) {
				JOptionPane.showMessageDialog(null, "La reserva se ha realizado con exito","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
				clientes.add(new Cliente(nombre,edad,socio,acomp,fentrada,fsalida,tipo,longitud)) ;
				escribir(clientes.get(clientes.size()-1).toString(),"clientes.txt") ;
				for(int x = 0 ; x < autocaravanas.length ; x++) {
					if(autocaravanas[x]== 0 ) {
						autocaravanas[x]= clientes.get(clientes.size()-1).getId() ;
						break ;
					}
				}
			}else{
				SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
				JOptionPane.showMessageDialog(null, "El parking esta completo no se ha podido hacer la reserva, pruebe a hacer la reserva a partir de: " + f.format(maximaFechaAuto(clientes)) ,"La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
			}
		}
	}
	
 	public static void crearemple() {
		String usuario ;
		String pass ;
		do {
			
			usuario = (String) JOptionPane.showInputDialog(null,"introduzca el usuario root","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null);
			
			pass = (String) JOptionPane.showInputDialog(null,"introduzca el pass del usuario root","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null);
			
			if(!usuario.equalsIgnoreCase("user")|| ! pass.equalsIgnoreCase("1234")) {
				JOptionPane.showMessageDialog(null, "La contraseña o el usuario es incorrecto","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
			}
		}while(!usuario.equalsIgnoreCase("user")|| ! pass.equalsIgnoreCase("1234")) ; 
		
		String nombre = (String) JOptionPane.showInputDialog(null,"introduzca el nombre del empleado","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null);
		boolean temp = false ;
		int edad=0 ;
		do {
			try {
			
				 edad =  Integer.parseInt((String) JOptionPane.showInputDialog(null,"la edad del usuario","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null));
				 temp = false ;
			} catch(NumberFormatException e){
				temp = true ;
				JOptionPane.showMessageDialog(null, "Has introducido un formato de edad incorrecto","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
			}
		}while(temp) ;
		
		String usuario1 = (String) JOptionPane.showInputDialog(null,"introduzca el usuario del empleado","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null);
		String pass1 = (String) JOptionPane.showInputDialog(null,"introduzca el password del empleado","La Rana",JOptionPane.QUESTION_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")),null,null);
		
		empleados.add(new Empleado(nombre,edad,usuario1,pass1)) ;
		escribir(empleados.get(empleados.size()-1).toString(),"empleados.txt") ;
	}

	public static void main(String[] args) {
		
		UIManager UI=new UIManager();
	    UI.put("OptionPane.background", new Color( 0, 0, 0 ));
	    UI.put("Panel.background", new Color( 0, 0, 0 ));
	    UI.put("Menu.Foreground",Color.red);
	    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
	    UI.put("OptionPane.messageForeground", Color.white);
	    lecturaemple() ;
	    lecturaCliente() ;
	    
		JOptionPane.showMessageDialog(null, "Bienvenido al camping La Rana","La Rana",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("camping.png")));
		
		String opciones[] = {"Ver estado de las parcelas","add empleado","add cliente","Salir"} ;
		
		do {
			Calendar c1 = Calendar.getInstance() ;
			
			for(int x = 0 ; x <clientes.size() ; x++ ) {
				
				int dur = (int) Duration.between(clientes.get(x).getFechaSalida().toInstant(), c1.toInstant()).toDays();
				
				if(dur <=0) {
					clientes.remove(x) ;
					eliminarFila(x, "clientes.txt") ;
				}
			}
			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "La Rana",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Main.class.getResource("camping.png")), opciones,opciones[3]) ;
			
			switch (opcion) {
			case 0:
				vermapa() ;
				break;
				
			case 1:
				crearemple() ;
				break;
				
			case 2:
				crearcliente() ;
				break;
				
			case 3:
				System.exit(0);
				break;
				
				
			}
			
		}while(true) ;
	}

}
