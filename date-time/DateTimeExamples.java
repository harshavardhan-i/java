import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.DateTimeFormatter;
import java.time.Period;
import java.time.Month;

public class DateTimeExamples {

    public static void p (Object o){
        System.out.println(o);
    }
    
    public static void main (String[] args){

        // Date  
        // Immutable object
        // LocalDate now = LocalDate.now();
        // p(now);
        // LocalDate hireDate = LocalDate.of(2008, Month.APRIL, 21);
        // p(hireDate);
        // LocalDate aWeekFromNow = now.plusWeeks(1);
        // p(aWeekFromNow);
        // LocalDate aWeekBefore = now.minusWeeks(1);
        // p(aWeekBefore);
        // p(hireDate.isBefore(now));

        // Time
        // LocalTime now = LocalTime.now();
        // p(now);
        // LocalTime timeHired = LocalTime.of(13, 0, 0);
        // p(timeHired);
        // LocalTime anHourFromNow = now.plusHours(1);
        // p(anHourFromNow);
        // LocalTime anHourEarlier = now.minusWeeks(1);
        // p( timeHired.isAfter(now));

        // Date time
        LocalDateTime now = LocalDateTime.now();
        p(now);
        LocalDateTime timeHired = LocalDateTime.of(2008, Month.APRIL, 21, 13, 0, 0);
        p(timeHired);
        p(now.isBefore(timeHired));

        Period period = Period.of(3, 5, 12);
        now = now.minus(period);
        p(now);
        now = now.plus(period);
        p(now);

        // Date time formatter
        LocalDate nows = LocalDate.now();
        p(nows);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        p(nows.format(dtf));
    }
}