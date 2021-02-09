package gregoriancalendar;

import static java.util.Calendar.MONTH;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ejercicio01 {

	public static void main(String[] args) {

		GregorianCalendar cal = new GregorianCalendar() ;

		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(MONTH) + "/" + cal.get(Calendar.MONTH));
	}

}
