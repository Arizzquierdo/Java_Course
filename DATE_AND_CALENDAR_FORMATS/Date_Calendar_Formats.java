package DATE_AND_CALENDAR_FORMATS;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Date_Calendar_Formats {
    public static void main(String[] args) {

        //formato de fecha
        Date date = new Date();

        System.out.println("date = " + date);
        
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String fechaStr = df.format(date);

        System.out.println("fechaStr = " + fechaStr);

        System.out.println("\n========================================");

        //tiempo en milisegundos
        long j = 0;
        for (int i = 0; i < 1000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2. getTime() - date.getTime();
        System.out.println("fechaStr = " + fechaStr);
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);

        System.out.println("\n========================================");

        // Clase Calendar

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2019, Calendar.SEPTEMBER, 25, 18, 20, 10);
        calendario.set(Calendar.YEAR,2020);
        calendario.set(Calendar.MONTH,Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE,20);
        calendario.set(Calendar.SECOND,10);
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + date);

    }
}
