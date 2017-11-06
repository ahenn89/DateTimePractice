package student.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.SECONDS;

/**
 *
 * @author Ashlee
 */
public class StartUp {
    public static void main(String[] args) {

        DateTimeLab dateTimeLab = new DateTimeLab();

        //output the date/ time right now as a string
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dateTimeLab.dateTimeToString_AmericanLongFormat(now));

        LocalDate today = LocalDate.now();
        System.out.println(dateTimeLab.dateToString_AmericanFormat(today));
        

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = "11/06/2017";
        LocalDate localDate = dateTimeLab.stringToLocalDate(date, formatter);
        System.out.println("localDate = " + localDate);
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        String currentDate = "11/06/2017 09:30";
        LocalDateTime localDateTime = dateTimeLab.stringToLocalDateTime(currentDate, dateTimeFormatter);
        System.out.println(localDateTime);
        
        LocalDateTime startDate = LocalDateTime.of(2017, Month.DECEMBER, 24, 12, 00);
        LocalDateTime endDate = LocalDateTime.of(2018, Month.DECEMBER, 24, 12, 00);
        Long unitsBetween = dateTimeLab.getChronoUnitsBetweenTwoDates(startDate, endDate, SECONDS);
        System.out.println("Units Between: " + unitsBetween);
        
        




    }
}

