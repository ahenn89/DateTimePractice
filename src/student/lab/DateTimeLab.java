package student.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Ashlee
 */
public class DateTimeLab {

//     Accepts a LocalDateTime object and converts it into a String that is formatted
//     in the Americanized style of mm/dd/yyyy hh:mm:ss
    
    public String dateTimeToString_AmericanFormat(LocalDateTime dateTime) throws IllegalArgumentException{
        if(dateTime == null){
            throw new IllegalArgumentException("Error: LocalDateTime object cannot be null.");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ssa");
        String stringDateAndTime = dateTime.format(formatter);
        return stringDateAndTime;
    }
    
    //Formats a LocalDateTime object in a long format, spelling the entire month and including the time of the object on a 12 hour clock.

    public String dateTimeToString_AmericanLongFormat(LocalDateTime dateTime)throws IllegalArgumentException{
        if(dateTime == null){
            throw new IllegalArgumentException("Error: LocalDateTime object cannot be null.");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm a");
        String stringDateAndTime = dateTime.format(formatter);
        return stringDateAndTime;
    }
    

    //Formats a LocalDate and outputs a string. Utilizes the American "month first" format.
    
    public String dateToString_AmericanFormat(LocalDate date) throws IllegalArgumentException{
        if(date == null){
            throw new IllegalArgumentException("Error: LocalDate object cannot be null.");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String stringDate = date.format(formatter);
        return stringDate;
    }    
    
//    you must provide a minimum of two
//     methods to convert formatted strings to Date/Time objects
    

    //Accepts a String and a DateTimeFormatter and returns LocalDate object. 

    public LocalDate stringToLocalDate(String date, DateTimeFormatter formatter) throws IllegalArgumentException{
        if(date == null || date.isEmpty()){
            throw new IllegalArgumentException("Error. The String 'date' cannot be null.");
        } else if (formatter == null){
            throw new IllegalArgumentException("Error. A DateTimeForma formatter object cannot be null.");
        }
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }
    

    //Accepts a String and a DateTimeFormatter and returns LocalDateTime object. 

    public LocalDateTime stringToLocalDateTime(String date, DateTimeFormatter formatter)throws IllegalArgumentException{
       if(date == null || date.isEmpty()){
            throw new IllegalArgumentException("Error. The String 'date' cannot be null.");
        } else if (formatter == null){
            throw new IllegalArgumentException("Error. A DateTimeForma formatter object cannot be null.");
        }
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        return localDateTime;
    }
    

    //Accepts a start and end time in addition to a ChronoUnit. Returns a long value that is the difference between the start date/time and end date/time.
 
    public long getChronoUnitsBetweenTwoDates(LocalDateTime start, LocalDateTime end, ChronoUnit units) throws IllegalArgumentException{
        if(start == null){
            throw new IllegalArgumentException("Error. A LocalDateTime object `start` is required. It cannot be null.");
        } else if (end == null){
            throw new IllegalArgumentException("Error. A LocalDateTime object `end` is required. It cannot be null.");  
        } else if (units == null){
            throw new IllegalArgumentException("Error. A ChronoUnit `units` must be defined.");
        }
        LocalDateTime startTime = start;
        LocalDateTime endTime = end;
        long hoursBetween = units.between(startTime, endTime);
        return hoursBetween;
        
    }
}
