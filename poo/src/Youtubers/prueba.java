package Youtubers;

import java.time.Duration;
import java.util.Arrays;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class prueba {

	public static void main(String[] args) {
		
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.set(2000,2,1) ;
        cal2.set(2000,2,10);
        int diitas = (int) Duration.between(cal1.toInstant(), cal2.toInstant()).toDays();
        System.out.println(diitas);
        System.out.println(cal1.MONTH);
        Calendar c3 = Calendar.getInstance() ;
        System.out.println(c3.getTime());
	}
}
