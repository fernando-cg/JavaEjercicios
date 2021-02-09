package gregoriancalendar;

import java.time.Duration;
import java.util.GregorianCalendar;

public class calendartodec {

	public static void main(String[] args) {

		GregorianCalendar cal = new GregorianCalendar() ;
		
		int mes = (cal.get(cal.MONTH) + 1);
		
		System.out.println(cal.get(cal.MONTH)+1);
		
		int dia = cal.get(cal.DAY_OF_MONTH) ;
		
		System.out.println(cal.get(cal.DAY_OF_MONTH));
		
		int anio = cal.get(cal.YEAR) ;
		
		System.out.println(cal.get(cal.YEAR));
		
		System.out.println("Hoy es: " + dia + "/" + mes + "/" + anio);
		
		GregorianCalendar cal2 = new GregorianCalendar() ;
		
		cal2.set(2021, 12, 31);
		
		int falta = (int) Duration.between(cal.toInstant(), cal2.toInstant()).toDays() ;
		int falta2 = (int) Duration.between(cal.toInstant(), cal2.toInstant()).toMinutes();
		
		System.out.println(falta);

		System.out.println(falta2);

		System.out.println();
	}
	
	

}
