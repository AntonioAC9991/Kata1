package kata1.pkg21.pkg22;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata12122 {
    public static void main(String[] args) {
        LocalDate birthdate =  LocalDate.of(1980,1,1);
        Person person = new Person("Antonio", birthdate);
        System.out.println(person.getName()+ " tiene " + person.getAge());
    }
    
}
