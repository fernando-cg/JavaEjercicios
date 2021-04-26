package Youtubers ;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        // FECHAS
        Scanner sc = new Scanner(System.in);

        Date fechaE = null;
        Date fechaS = null;

        System.out.println("Escribe la fecha de entrada dd/mm/AAAA");
        String entrada = sc.next();

        try {
            fechaE = new SimpleDateFormat("dd/MM/yyyy").parse(entrada);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("error 1");
        }

        System.out.println("Escribe la fecha de salida dd/mm/AAAA");
        String salida = sc.next();

        try {
            fechaS = new SimpleDateFormat("dd/MM/yyyy").parse(salida);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("error2");
        }

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        System.out.println(fechaE);
        System.out.println(fechaS);
        System.out.println(fechaE.getDay());
        System.out.println(fechaS.getDay());
        System.out.println(fechaE.getMonth());
        System.out.println(fechaS.getMonth());
        System.out.println(fechaE.getYear());
        System.out.println(fechaS.getYear());
        cal1.set(2021, 12, 12);
        cal2.set(2021,12,18);
        int dias = (int) Duration.between(cal1.toInstant(), cal2.toInstant()).toDays();

        System.out.println("estarias un total de " + dias + " dias");
        // FIN FECHAS
        
    }

}
