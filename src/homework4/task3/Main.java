package homework4.task3;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class Main {

        private static String formatDate(Calendar calendar) {
            Formatter formatter = new Formatter();
            formatter.format(" %1$tF %1$tr", calendar);
            return formatter.toString();
        }

        public static void main(String[] args) {
            Date date = new Date();

            Calendar currentCalendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();

            currentCalendar.setTime(date);

            System.out.println("Current date is: " + formatDate(currentCalendar));

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            calendar.set(Calendar.YEAR, 1987);
            calendar.set(Calendar.MONTH, 5 );
            calendar.set(Calendar.DATE, 21);
            calendar.set(Calendar.HOUR_OF_DAY, 11);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            calendar2.set(Calendar.YEAR,currentCalendar.get(Calendar.YEAR)-calendar.get(Calendar.YEAR));
            calendar2.set(Calendar.MONTH,currentCalendar.get(Calendar.MONTH)-calendar.get(Calendar.MONTH));
            calendar2.set(Calendar.DAY_OF_MONTH,currentCalendar.get(Calendar.DAY_OF_MONTH)-calendar.get(Calendar.DAY_OF_MONTH));
            calendar2.set(Calendar.HOUR_OF_DAY,currentCalendar .get(Calendar.HOUR_OF_DAY)-calendar.get(Calendar.HOUR_OF_DAY));
            calendar2.set(Calendar.MINUTE,currentCalendar.get( Calendar.MINUTE)-calendar.get(Calendar.MINUTE));
            calendar2.set(Calendar.SECOND,currentCalendar.get( Calendar.SECOND)-calendar.get(Calendar.SECOND));

            System.out.println("You've turned: "+calendar2.get(Calendar.YEAR)+" years "+calendar2.get(Calendar.MONTH)+" months "+calendar2.get(Calendar.DAY_OF_MONTH)+" days "+calendar2.get(Calendar.HOUR_OF_DAY)+" hours "+calendar2.get(Calendar.MINUTE)+" minutes "+calendar2.get(Calendar.SECOND)+" seconds");
        }
}
