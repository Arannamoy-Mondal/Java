import java.time.*;
import java.time.format.DateTimeFormatter;
public class dateTime {
    public static void main(String[] args) {
        /*
         4 type of data in dateTime:
         1.LocalDate
         2.LocalTime
         3.LocalDateTime
         4.DateTimeFormatter 
        */

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        DateTimeFormatter dateTimeFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(LocalDateTime.now().format(dateTimeFormat));
    }
    
}
